package themadgabfly;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import static javafx.application.Application.STYLESHEET_CASPIAN;
import static javafx.application.Application.STYLESHEET_MODENA;
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


/**
 * @author Seth Michail & Ekin Sert, CSE MSc program
 */
public class Settings extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button mainbtn = new Button();
        mainbtn.setText("Main Menu");
        mainbtn.setOnAction(new EventHandler<ActionEvent>() {
            
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
        grid.setMinSize(300, 300);
        grid.setVgap(5);
        grid.setHgap(5);
        
        
        grid.add(mainbtn,1,24);
        Text settings = new Text("Settings");
        
        settings.setFont(Font.font(STYLESHEET_CASPIAN, FontWeight.LIGHT, 18));
        grid.add(settings, 2, 1);
        Text set1 = new Text("Difficulty");
        set1.setFont(Font.font(STYLESHEET_MODENA, FontWeight.LIGHT, 14));
        
        grid.add(set1, 1, 8);
        grid.add(dbtn1,2,8);
        grid.add(dbtn2,3,8);
        Text set2 = new Text("Timer");
        grid.add(set2, 1, 12);
        grid.add(tbtn1,2,12);
        grid.add(tbtn2,3,12);
        Text set3 = new Text("Font Size");
        grid.add(set3, 1, 16);
        grid.add(fbtn1,2,16);
        grid.add(fbtn2,3,16);
        Text set4 = new Text("Sound");
        grid.add(set4,1,20);
        grid.add(sbtn1,2,20);
        grid.add(sbtn2,3,20);
 
        
        grid.setStyle("-fx-background-color: #E6E6E6;");

        Scene scene = new Scene(grid, 300, 650);
        
        primaryStage.setTitle("TheMadGabFly");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
