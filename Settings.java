package themadgabfly;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
    public static Button mainbtn = new Button();
    public static Button save = new Button();
    public static Boolean[] saves = new Boolean[8];
    public static RadioButton dbtn1 = new RadioButton("Easy");
    public static RadioButton dbtn2 = new RadioButton("Hard");
    public static RadioButton tbtn1 = new RadioButton("Disabled");
    public static RadioButton tbtn2 = new RadioButton("Enabled");
    public static RadioButton fbtn1 = new RadioButton("Normal");
    public static RadioButton fbtn2 = new RadioButton("Large");
    public static RadioButton sbtn1 = new RadioButton("");
    public static RadioButton sbtn2 = new RadioButton("On"); 
    public static File file1 = new File("/home/username/NetBeansProjects/TheMadGabfly/src/themadgabfly/saves.txt");
    //need a save settings button and code to go with it
            
    @Override
    public void start(Stage primaryStage) {
        
        save.setText("Save Settings");
        save.setOnAction(new EventHandler<ActionEvent>() {
            //how can we preserve selected settings from previous use of settings panel?
            //there is still a lot left to do on this one
            //8 element string array, actionevent sets corresponding values true and false
            @Override
            public void handle(ActionEvent event) {
                
                try {
                   Saves();
                    
                } catch (Exception ex) {
                    Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
                }
               }});
        
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
        
        
            dbtn1.setContentDisplay(ContentDisplay.LEFT);
            dbtn1.setSelected(saves[0]);
            //saves[0] = "true";
            //this should reveal a few random chars in space o plex, and smaller dictionary for other games
            
        
            dbtn2.setContentDisplay(ContentDisplay.LEFT);
            dbtn2.setSelected(saves[1]);
            //saves[1] = "false";
        
            tbtn1.setContentDisplay(ContentDisplay.LEFT);
            tbtn1.setSelected(saves[2]);
            //saves[2] = "true";
        
            tbtn2.setContentDisplay(ContentDisplay.LEFT);
            tbtn2.setSelected(saves[3]);
            //saves[3] = "false";
         //setting this to true will enable a countdown timer
        
            fbtn1.setContentDisplay(ContentDisplay.LEFT);
            fbtn1.setSelected(saves[4]);
            //saves[4] = "true";
        
            fbtn2.setContentDisplay(ContentDisplay.LEFT);
            fbtn2.setSelected(saves[5]);
            //saves[5] = "false";
         //setting this to true will set the font to larger size, perhaps 26pt
        
            sbtn1.setContentDisplay(ContentDisplay.LEFT);
            sbtn1.setSelected(saves[6]);
            //saves[6] = "true";
        
            sbtn2.setContentDisplay(ContentDisplay.LEFT);
            sbtn2.setSelected(saves[7]);
            //saves[7] = "false";
            
        dbtn1.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    dbtn2.setSelected(false);
                    saves[0] = true;
                    saves[1] = false;
                    Space_o_plex.e=true;
                    //select bigger dictionary
                    //show more chars in Space-o-plex
                    //anagrams set first 2 and last 2 letters to correct positoins
                    System.out.println("Code not written yet!!");
            }
        });
        dbtn2.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    dbtn1.setSelected(false);
                    saves[1] = true;
                    saves[0] = false;
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
                    saves[2] = true;
                    saves[3] = false;
                    System.out.println("Code not written yet!!");
            }
        });
        tbtn2.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    tbtn1.setSelected(false);
                    saves[3] = true;
                    saves[2] = false;
                    System.out.println("Code not written yet!!");
            }
        });
        fbtn1.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    fbtn2.setSelected(false);
                    saves[4] = true;
                    saves[5] = false;
                    System.out.println("Code not written yet!!");
            }
        });
        fbtn2.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    fbtn1.setSelected(false);
                    saves[5] = true;
                    saves[4] = false;
                    System.out.println("Code not written yet!!");
            }
        });
        sbtn1.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    sbtn2.setSelected(false);
                    saves[6] = true;
                    saves[7] = false;
                    System.out.println("Code not written yet!!");
            }
        });
        sbtn2.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    sbtn1.setSelected(false);
                    saves[7] = true;
                    saves[6] = false;
                    System.out.println("Code not written yet!!");
            }
        });
         
         
  
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setMinSize(300, 300);
        grid.setVgap(5);
        grid.setHgap(5);
        
        save.setMaxWidth(250);
        save.setMinWidth(250);
        grid.add(save, 1, 20, 3, 1);

        mainbtn.setMaxWidth(250);
        mainbtn.setMinWidth(250);
        grid.add(mainbtn, 1, 24, 3, 1);
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

    public void Saves(){
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file1));
            for (int i = 0; i < 8; i++) {
                writer.write(saves[i].toString());
                writer.flush();    
                writer.newLine();
            }
            writer.close();
                    
        } catch (IOException ex) {
            Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void loadSaves(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file1));
            int i = 0;
            while(reader.ready()){
                saves[i] = Boolean.valueOf(reader.readLine());
                i++;
                //System.out.println(saves[i].toString()); 
            }
            dbtn1.setSelected(saves[0]);
            dbtn2.setSelected(saves[1]);
            tbtn1.setSelected(saves[2]);
            tbtn2.setSelected(saves[3]);
            fbtn1.setSelected(saves[4]);
            fbtn2.setSelected(saves[5]);
            sbtn1.setSelected(saves[6]);
            sbtn2.setSelected(saves[7]);


        } catch (FileNotFoundException ex) {
            Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
