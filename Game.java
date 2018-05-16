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
import static themadgabfly.Settings.fbtn2;

/**
 * @author Seth Michail & Ekin Sert, CSE MSc program
 */
public abstract class Game extends Application{
    public String title = "The MadGabFly";
    public StringBuilder pword = new StringBuilder();
    public StringBuilder cword = new StringBuilder();
    public StringBuilder dword = new StringBuilder();
    public Boolean tf = false;
    public Text message = new Text("Press Start to begin");
    public Text line1 = new Text("");
    public Text line2 = new Text("");
    public static Text timer = new Text("");
    public TMGFTimer tr = new TMGFTimer();
    public TextField in = new TextField("");
    public Button btn1 = new Button();
    public Button btn2 = new Button();
    public Button btn3 = new Button();
    public int score = 0;
    public Text points = new Text("Score: " + score);
        
    public ActionListener bl1 = new ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            if(e.getSource().equals(btn1)){
                pword.delete(0, pword.length());
                pword.append( in.getText());
            }
            throw new UnsupportedOperationException("Not supported yet."); 
        }
    };
    
    public static Listener bl2 = new Listener() {};
        
    @Override
    public void start(Stage primaryStage) {
        if(Settings.tbtn1.isSelected()){
                    timer.setVisible(false);
                }else if(Settings.tbtn2.isSelected()) {
                    
                    tr.start();
                    timer.setVisible(true);
                }
        btn1.setText("Submit");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                if(pword.length()==0 ){
                    pword.append(in.getText());
                }else{
                    pword.delete(0, pword.length());
                    pword.append( in.getText());
                }
                if(pword.equals("")){
                    message.setText("Type a word");
                }else{
                    line2.setText(pword.toString());
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
                firstStep();        //gets things started
            }
        });
        
        btn3.setText("Main Menu");//exit settings and return to main menu
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                TheMadGabfly again = new TheMadGabfly();//recreate the main menu
                try {
                    again.init();
                    again.start(primaryStage); 
                    Connections.usedWords.clear();
                    tr.stop();                  //stop the timer
                    tr.reset();                 //reset the timer
                }catch (Exception ex) {
                    Logger.getLogger(Settings.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        in.setPrefColumnCount(7);
        in.setOnAction(new EventHandler<ActionEvent>() {
            //when user presses enter key
            @Override
            public void handle(ActionEvent event) {
            pword.delete(0, pword.length());
            pword.append( in.getText());
                if(pword.equals("")){
                    line2.setText("Enter a word");
                }else{
                    line2.setText(pword.toString());
                    in.setText("");
                    nextStep(pword);
                }
            }
        });
        in.setMaxWidth(160);
        in.setMinWidth(160);
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setMinSize(320, 350);//width,hieght
        grid.setVgap(5);
        grid.setHgap(5);
        grid.add(btn3,0,0);
        if(fbtn2.isSelected()){//font set to large
            message.setFont(new Font(22));
            line1.setFont(new Font(22));
            line2.setFont(new Font(22));
            timer.setFont(new Font(22));
        }else{              //default small font
            message.setFont(new Font(16));
            line1.setFont(new Font(16));
            line2.setFont(new Font(16));
            timer.setFont(new Font(16));
        }
        message.setWrappingWidth(450.0);
        grid.add(message,1,2);
        grid.add(line1,1,5);
        grid.add(line2,1,7);
        grid.add(in,1,9);
        grid.add(btn1,1,11);
        grid.add(btn2,1,13);
        grid.add(points,1,15);
        grid.add(timer, 1, 18);

        grid.setStyle("-fx-background-color: #E6E6E6;");
        
        Scene scene = new Scene(grid, 615, 355);
        
        primaryStage.setTitle(title);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public abstract void nextStep(StringBuilder s);
    public abstract void firstStep();
    
    


}

