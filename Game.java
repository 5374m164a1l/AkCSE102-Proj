package themadgabfly;
// @author username
import java.awt.event.ActionListener;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import static java.lang.Math.random;
import java.util.Scanner;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.beans.InvalidationListener;
import javafx.event.EventDispatchChain;
import javax.xml.bind.Marshaller.Listener;
import static themadgabfly.Dictionary.giveWord;

public abstract class Game extends Application{
    public String title = "The MadGabFly";
    public String pword="";
    public String cword="";
    public String dword="";
    public Boolean tf=false;
    public Text points=new Text("Score: ");
    public Text line1=new Text("Make your guess:");
    public Text line2=new Text("l2");
    public TextField in = new TextField("");
    public Button btn1 = new Button();
    public Button btn2 = new Button();
    public Button btn3 = new Button();
    public int score = 0;
    
    
    public ActionListener bl1 = new ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            if(e.getSource().equals(btn1)){pword=in.getText();}
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    public static Listener bl2 = new Listener() {};
        
    @Override
    public void start(Stage primaryStage) {
        
        
        btn1.setText("Submit");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                pword=in.getText();
                line2.setText(pword);
                in.setText("");
                
                }
        });
        //btn1.addActionListener(bl1);
        btn2.setText("Start");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                tf = true;
            }
        });
        btn3.setText("Main Menu");//exit settings and return to main menu
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                TheMadGabfly again = new TheMadGabfly();
                try {
                    again.init();
                    again.start(primaryStage); 
                } catch (Exception ex) {
                    Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        in.setPrefColumnCount(7);
        in.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                pword=in.getText();
                line2.setText(pword);
                in.notifyAll();
            }
        });
        in.setMaxWidth(160);
        in.setMinWidth(160);
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setMinSize(300, 300);//width,hieght
        grid.setVgap(5);
        grid.setHgap(5);
        //btn1.;
        grid.add(btn3,0,0);
        grid.add(line1,1,1);
        grid.add(line2,1,2);
        grid.add(in,1,4);
        grid.add(btn1,1,6);
        grid.add(btn2,1,8);
        grid.add(points,1,25);

        grid.setStyle("-fx-background-color: #E6E6E6;");
        
        Scene scene = new Scene(grid, 615, 315);
        
        primaryStage.setTitle(title);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    
    public abstract void setTitle(String s);
    


}

