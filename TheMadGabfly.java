/*
 */
package themadgabfly;

import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import static themadgabfly.Dictionary.*;
import static themadgabfly.Settings.loadSaves;

/**
 * @author Seth Michail & Ekin Sert, CSE MSc program
 */
public class TheMadGabfly extends Application {
    @Override
    public void start(Stage primaryStage) {
        loadSaves();
        
        Button btn1 = new Button();
        Button btn2 = new Button();
        Button btn3 = new Button();
        Button btn4 = new Button();
        
        btn1.setMaxWidth(140);
        btn1.setMinWidth(140);
        btn2.setMaxWidth(140);
        btn2.setMinWidth(140);
        btn3.setMaxWidth(140);
        btn3.setMinWidth(140);
        btn4.setMaxWidth(140);
        btn4.setMinWidth(140);
        
        btn1.setText("Anagrams");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                Anagrams pane1=new Anagrams();
                try {
                    pane1.cword.append(giveWord());
                    pane1.title="Anagrams";
                    pane1.init();
                    pane1.start(primaryStage);
                    
                } catch (Exception ex) {
                    Logger.getLogger(TheMadGabfly.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        btn2.setText("Connections");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                Connections pane2 = new Connections();
                try {
                    pane2.firstStep();
                    pane2.title="Connections";
                    pane2.init();
                    pane2.start(primaryStage);
                } catch (Exception ex) {
                    Logger.getLogger(TheMadGabfly.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }); 
        
        btn3.setText("Space-o-plex");
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                Space_o_plex pane3=new Space_o_plex();
                try {
                    pane3.firstStep();
                    pane3.title="Space-o-plex";
                    pane3.init();
                    pane3.start(primaryStage);
                } catch (Exception ex) {
                    Logger.getLogger(TheMadGabfly.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
  
        btn4.setText("Settings");
        btn4.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                Settings pane4=new Settings();
                try {
                    primaryStage.setTitle("Settings");
                    pane4.init();
                    pane4.start(primaryStage);
                } catch (Exception ex) {
                    Logger.getLogger(TheMadGabfly.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setMinSize(400, 200);
        grid.setAlignment(Pos.CENTER);
        grid.setVgap(5);
        grid.setHgap(5);
        
        grid.add(btn1,2,0);
        grid.add(btn2,2,2);
        grid.add(btn3,2,4);
        grid.add(btn4,2,7);
        
        grid.setStyle("-fx-background-color: #E6E6E6;");

        Scene scene = new Scene(grid, 400, 200);
        
        primaryStage.setTitle("TheMadGabFly");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
        
    }
    
}
