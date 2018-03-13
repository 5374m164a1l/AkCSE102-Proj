/*
 */
package themadgabfly;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * @author Seth Michail CSE MSc program
 */
public class TheMadGabfly extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Button btn1 = new Button();
        Button btn2 = new Button();
        Button btn3 = new Button();
        Button btn4 = new Button();
        Button btn5 = new Button();
        Button btn6 = new Button();
        btn1.setText("Anagrams");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Code not written yet!!");
            }
        });
        
        btn2.setText("Blab Nibs");//maybe "Ad Libs"?
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Code not written yet!!");
            }
        });
        
        btn3.setText("Connections");
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Code not written yet!!");
            }
        });
  
        btn4.setText("More Words");
        btn4.setOnAction((ActionEvent event) -> {
            System.out.println("Code not written yet!!");
        });
        
        btn5.setText("Settings");
        btn5.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Code not written yet!!");
            }
        });
        
        
       /* StackPane root = new StackPane();
        root.getChildren().add(btn1);
        root.getChildren().add(btn2);
        root.getChildren().add(btn3);
        root.getChildren().add(btn4);
        root.getChildren().add(btn5);
        
        Scene scene = new Scene(root, 300, 750);
        
        primaryStage.setTitle("Hello Wrld!");
        primaryStage.setScene(scene);
        primaryStage.show();*/
        
        GridPane grid = new GridPane();
grid.setPadding(new Insets(10, 10, 10, 10));
grid.setMinSize(300, 300);
grid.setVgap(5);
grid.setHgap(5);
 
//Text username = new Text("Username:");
grid.add(btn1, 2, 0);
 
/*TextField text = new TextField();
text.setPrefColumnCount(10);
grid.add(text, 1, 0);
*/
grid.add(btn2,2,2);
grid.add(btn3,2,4);
grid.add(btn4,2,6);
grid.add(btn5,2,8);
 
/*Text password = new Text("Password:");
grid.add(password, 0, 1);
 
TextField text2 = new TextField();
text2.setPrefColumnCount(10);
grid.add(text2, 2, 2);
*/
grid.setStyle("-fx-background-color: #D8BFD8;");

Scene scene = new Scene(grid, 300, 650);
        
        primaryStage.setTitle("Hello Wrld!");
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
