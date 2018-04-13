package themadgabfly;

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
import themadgabfly.TheMadGabfly;

/**
 * @author Seth Michail & Ekin Sert, CSE MSc program
 */

public class Anagrams extends Application {//implements ActionListener {
    public static String pword="";
    public static String cword="";
    public static Boolean tf=false;
    public static Text points=new Text("Score: ");
    public static Text line1=new Text("l1");
    public static Text line2=new Text("l2");
    public static TextField in = new TextField("");
    public static Button btn1 = new Button();
    public static Button btn2 = new Button();
    public static Button btn3 = new Button();
    public static int score = 0;
    
    public static ActionListener bl1 = new ActionListener() {
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
                tf=game(pword);
                go(tf);
                //notifyAll();
                }
        });
        //btn1.addActionListener(bl1);
        btn2.setText("Start");
        btn2.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                String word = giveWord();
                cword=word;
                wmixr(word);
            }
        });
        btn3.setText("Exit");
        btn3.setOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                
                System.out.println("Code not written yet!!");
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

        grid.setStyle("-fx-background-color: #D8BFD8;");
        
        Scene scene = new Scene(grid, 615, 315);
        
        primaryStage.setTitle("TheMadGabFly");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    //ans.buildEventDispatchChain(tail);// lookup EventDispatchChain
//need several methods to replace playAnagrams
public String wmixr(String s){
        
        String mword = "";
        int l = s.length();
        String [] mw = new String[l];
        
        for(int i=0; i<l; i++) {
            do {
                double a = Math.random();
                a = a*l;
                int b = (int) a;
                mw[i] = String.valueOf(s.charAt(b));
                s = s.replaceFirst(mw[i], " ");
                if(!mw[i].equals(" ")) {
                System.out.print(mw[i]);
                mword += mw[i];
                }
            } while (mw[i].equals(" "));
        }
        
        line1.setText("The mixed word is: "+mword+ "\n"+"Enter the predicted word: ");
        return mword;}

public boolean game(String s2){return pword.equalsIgnoreCase(cword);}

public void go(Boolean trfs){
    if(trfs==true) {
            score = score + 10;
            points.setText("Score: " + score);
            line2.setText("SUCCESS!");
        }
        else {
            //while(pword.compareToIgnoreCase(cword)!=0){
            score = score - 5;
            points.setText("Score: "  + 2);
            line2.setText(line2.getText()+"GAME OVER!");
            //ans.getOnAction();
            //btn1.getOnAction();
            //ans.notify();
            //btn1.getOnMouseClicked();
            //System.out.println("Enter the predicted word: ");//only this line gets executed
            //line1.setText("Enter the predicted word: ");
            //Thread.sleep(2000);
            
            }}   

}
