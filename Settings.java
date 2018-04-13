package themadgabfly;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import static themadgabfly.TheMadGabfly.main;


/**
 * @author Seth Michail CSE MSc program
 */
public class Settings extends Application {
    @Override
    public void start(Stage primaryStage) {
        Button btn3 = new Button();
        btn3.setText("Main Menu");
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                //TheMadGabfly.launch(args);
                //TheMadGabfly.main(args);
                //exit settings and return to main menu
               }});
        
        RadioButton dbtn1 = new RadioButton("Easy");
            dbtn1.setContentDisplay(ContentDisplay.LEFT);
            dbtn1.setSelected(true);
            
            
        RadioButton dbtn2 = new RadioButton("Hard");
            dbtn2.setContentDisplay(ContentDisplay.LEFT);
            dbtn2.setSelected(false);
           
        RadioButton tbtn1 = new RadioButton("Enabled");
            tbtn1.setContentDisplay(ContentDisplay.LEFT);
            tbtn1.setSelected(true);
         
        RadioButton tbtn2 = new RadioButton("Disabled");
            tbtn2.setContentDisplay(ContentDisplay.LEFT);
            tbtn2.setSelected(false);
         
        RadioButton fbtn1 = new RadioButton("Normal");
            fbtn1.setContentDisplay(ContentDisplay.LEFT);
            fbtn1.setSelected(true);
         
        RadioButton fbtn2 = new RadioButton("Large");
            fbtn2.setContentDisplay(ContentDisplay.LEFT);
            fbtn2.setSelected(false);
         
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
                    //select bigger dictionary
                    //show more chars in Space-o-plex
                    System.out.println("Code not written yet!!");
            }
        });
        dbtn2.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    dbtn1.setSelected(false);
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
        
        
        grid.add(btn3,1,14);
        
        Text set1 = new Text("Difficulty");
        grid.add(set1, 1, 4);
        grid.add(dbtn1,2,4);
        grid.add(dbtn2,3,4);
        Text set2 = new Text("Timer");
        grid.add(set2, 1, 6);
        grid.add(tbtn1,2,6);
        grid.add(tbtn2,3,6);
        Text set3 = new Text("Font Size");
        grid.add(set3, 1, 8);
        grid.add(fbtn1,2,8);
        grid.add(fbtn2,3,8);
        Text set4 = new Text("Sound");
        grid.add(set4,1,10);
        grid.add(sbtn1,2,10);
        grid.add(sbtn2,3,10);
 
        
        grid.setStyle("-fx-background-color: #D8BFD8;");

        Scene scene = new Scene(grid, 300, 650);
        
        primaryStage.setTitle("TheMadGabFly");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
