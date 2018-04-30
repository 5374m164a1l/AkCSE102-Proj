package themadgabfly;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.GridPane;
import javafx.scene.text.*;
import javafx.stage.Stage;
import static javafx.application.Application.STYLESHEET_MODENA;

/**
 * @author Seth Michail & Ekin Sert, CSE MSc program
 */
public class Settings extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button mainbtn = new Button();
        mainbtn.setText("Main Menu");
        mainbtn.setOnAction(new EventHandler<ActionEvent>() {
            //how can we preserve selected settings from previous use of settings panel?
            //there is still a lot left to do on this one
            @Override
            public void handle(ActionEvent event) {
                TheMadGabfly again = new TheMadGabfly();
                try {
                    again.init();
                    again.start(primaryStage);
                    
                } catch (Exception ex) {
                    Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
                }
               }});
        
        RadioButton dbtn1 = new RadioButton("Easy");
            dbtn1.setContentDisplay(ContentDisplay.LEFT);
            dbtn1.setSelected(true);
            //this should reveal a few random chars in space o plex, and smaller dictionary for other games
            
        RadioButton dbtn2 = new RadioButton("Hard");
            dbtn2.setContentDisplay(ContentDisplay.LEFT);
            dbtn2.setSelected(false);
           
        RadioButton tbtn1 = new RadioButton("Disabled");
            tbtn1.setContentDisplay(ContentDisplay.LEFT);
            tbtn1.setSelected(true);
         
        RadioButton tbtn2 = new RadioButton("Enabled");
            tbtn2.setContentDisplay(ContentDisplay.LEFT);
            tbtn2.setSelected(false);
         //setting this to true will enable a countdown timer
        RadioButton fbtn1 = new RadioButton("Normal");
            fbtn1.setContentDisplay(ContentDisplay.LEFT);
            fbtn1.setSelected(true);
         
        RadioButton fbtn2 = new RadioButton("Large");
            fbtn2.setContentDisplay(ContentDisplay.LEFT);
            fbtn2.setSelected(false);
         //setting this to true will set the font to larger size, perhaps 26pt
        RadioButton sbtn1 = new RadioButton("");
            sbtn1.setContentDisplay(ContentDisplay.LEFT);
            sbtn1.setSelected(true);
         
        RadioButton sbtn2 = new RadioButton("On");
            sbtn2.setContentDisplay(ContentDisplay.LEFT);
            sbtn2.setSelected(false);
            
        dbtn1.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    dbtn2.setSelected(false);
                    Space_o_plex.e=true;
                    //select bigger dictionary
                    //show more chars in Space-o-plex
                    System.out.println("Code not written yet!!");
            }
        });
        dbtn2.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    dbtn1.setSelected(false);
                    Space_o_plex.e=false;
                    //select bigger dictionary
                    //show fewer chars in Space-o-plex
                    System.out.println("Code not written yet!!");
            }
        });
        tbtn1.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    tbtn2.setSelected(false);
                    System.out.println("Code not written yet!!");
            }
        });
        tbtn2.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    tbtn1.setSelected(false);
                    System.out.println("Code not written yet!!");
            }
        });
        fbtn1.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    fbtn2.setSelected(false);
                    System.out.println("Code not written yet!!");
            }
        });
        fbtn2.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    fbtn1.setSelected(false);
                    System.out.println("Code not written yet!!");
            }
        });
        sbtn1.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    sbtn2.setSelected(false);
                    System.out.println("Code not written yet!!");
            }
        });
        sbtn2.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    sbtn1.setSelected(false);
                    System.out.println("Code not written yet!!");
            }
        });
         
         
  
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setMinSize(280, 300);
        grid.setVgap(5);
        grid.setHgap(5);
        mainbtn.setMaxWidth(250);
        mainbtn.setMinWidth(250);
        grid.add(mainbtn, 1, 20, 3, 1);
        Text set1 = new Text("Difficulty");
        set1.setFont(Font.font(STYLESHEET_MODENA, FontWeight.LIGHT, 14));
        grid.add(set1, 1,2);
        grid.add(dbtn1,2,2);
        grid.add(dbtn2,3,2);
        Text set2 = new Text("Timer");
        grid.add(set2, 1,6);
        grid.add(tbtn1,2,6);
        grid.add(tbtn2,3,6);
        Text set3 = new Text("Font Size");
        grid.add(set3, 1,10);
        grid.add(fbtn1,2,10);
        grid.add(fbtn2,3,10);
        Text set4 = new Text("Sound");
        grid.add(set4,1,14);
        grid.add(sbtn1,2,14);
        grid.add(sbtn2,3,14);
 
        
        grid.setStyle("-fx-background-color: #E6E6E6;");

        Scene scene = new Scene(grid, 280, 300);
        
        primaryStage.setTitle("Settings");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
