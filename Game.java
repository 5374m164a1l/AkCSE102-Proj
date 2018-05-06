package themadgabfly;

import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.xml.bind.Marshaller.Listener;

/**
 * @author Seth Michail & Ekin Sert, CSE MSc program
 */
public abstract class Game extends Application{
    public String title = "The MadGabFly";
    public String pword = "";
    public String cword = "";
    public String dword = "";
    public Boolean tf = false;
    public Text message = new Text("Press Start to begin");
    public Text line1 = new Text("");
    public Text line2 = new Text("");
    public TextField in = new TextField("");
    public Button btn1 = new Button();
    public Button btn2 = new Button();
    public Button btn3 = new Button();
    public int score = 0;
    public Text points = new Text("Score: " + score);
        
    public ActionListener bl1 = new ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            if(e.getSource().equals(btn1)){pword=in.getText();}
            throw new UnsupportedOperationException("Not supported yet."); 
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
                if(pword.equals("")){
                    message.setText("Type a word");
                }else{
                    line2.setText(pword);
                    in.setText("");
                    nextStep(pword);
                }}
        });
        
        btn2.setText("Start");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                message.setText("");
                btn2.setText("Next");
                firstStep();
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
                    for (int i = 0; i < 149; i++) {
                        Connections.usedwords[i]=null;
                    }
                }catch (Exception ex) {
                    Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        in.setPrefColumnCount(7);
        in.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                pword=in.getText();
                if(pword.equals("")){line2.setText("Enter a word");
                }else{
                    line2.setText(pword);
                    in.setText("");
                    nextStep(pword);
                }
            }
        });
        in.setMaxWidth(160);
        in.setMinWidth(160);
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setMinSize(300, 300);//width,hieght
        grid.setVgap(5);
        grid.setHgap(5);
        grid.add(btn3,0,0);
        message.setFont(new Font(20));
        message.setWrappingWidth(450.0);
        grid.add(message,1,1);
        line1.setFont(new Font(20));
        grid.add(line1,1,2);
        line2.setFont(new Font(20));
        grid.add(line2,1,3);
        grid.add(in,1,5);
        grid.add(btn1,1,7);
        grid.add(btn2,1,9);
        grid.add(points,1,14);

        grid.setStyle("-fx-background-color: #E6E6E6;");
        
        Scene scene = new Scene(grid, 615, 315);
        
        primaryStage.setTitle(title);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public abstract void nextStep(String s);
    public abstract void firstStep();
    
    


}

