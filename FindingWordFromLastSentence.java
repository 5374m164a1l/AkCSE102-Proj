package themadgabfly;

import java.util.Scanner;
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
import javafx.scene.text.Text;
import javafx.stage.Stage;
import static themadgabfly.Dictionary.giveWordbyLetter;
import static themadgabfly.Dictionary.giveWord;

/**
 * @author Seth Michail & Ekin Sert, CSE MSc program
 */
public class Connections extends Application {
    public static Boolean bool = false;
    public static int score = 0;
    public static int iou = 0;
    public static String str = "";
    public static String llu = "";
    public static TextField in = new TextField();
    public static Text comp = new Text(Dictionary.giveWord());
    public static Text out = new Text("");
    public static Text points = new Text("");
    public static Button btn1 = new Button();
   // public static Button btn2 = new Button();
    public static Button btn3 = new Button();
    public static String[] usedwords = new String[150]; // to keep used words.        
    
    @Override
    public void start(Stage primaryStage) {
        
        btn1.setText("Submit");
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                str = in.getText();
                out.setText(str);
                try {
                    player(str);
                    computr();
                    in.setText("");
                } catch (InterruptedException ex) {
                    Logger.getLogger(Connections.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
        
        btn3.setText("Exit");
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Code not written yet!!");
            }
        });
        
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setMinSize(300, 300);
        grid.setVgap(5);
        grid.setHgap(5);
 
        in.setMaxWidth(160);
        in.setMinWidth(160);
         
        grid.add(btn1,1,10);
        //grid.add(btn2,1,12);
        grid.add(btn3,0,0);
        grid.add(in,1,5);
        grid.add(comp,1,2);
        grid.add(out,1,4);
        grid.add(points,1,20);
        
        grid.setStyle("-fx-background-color: #E6E6E6;");

        Scene scene = new Scene(grid, 300, 300);
        
        primaryStage.setTitle("TheMadGabFly");
        primaryStage.setScene(scene);
        primaryStage.show();}

public void player(String s) throws InterruptedException {

        
        System.out.print("Please enter the first word: ");
        
        String user = s;//can.nextLine(); // first word of the game.
        
        usedwords[iou] = user; // to add the word to used words.
        
        iou++;
        
        int i = user.length();
        
        llu = String.valueOf(user.charAt(i-1)); // last letter of user's entry.
        
}

public Boolean chkwrd(String s1, String s2){
return bool;
}

public void computr(){
    String cpu="";
    int louw = usedwords.length; // length of udeswords array.
    for(int v = 0; v < louw; v++) { // checks if the entry used or not.
        if (cpu.equalsIgnoreCase(usedwords[v])) { 
            cpu = giveWordbyLetter(llu); // gives another random word starts with 
                                     // last letter of user for cpu.
            v=0;
            break;
        }
        else if (v==louw-1) {
            break;
        }
    }
        
    int a = cpu.length();
    //if(a>0){
    String flc = String.valueOf(cpu.charAt(0));
    String llc = String.valueOf(cpu.charAt(a-1));
    if(flc.equalsIgnoreCase(llu)){
        comp.setText(cpu+"_");
        usedwords[iou] = cpu;
        iou++;
        llu = llc;
    }
    }}
