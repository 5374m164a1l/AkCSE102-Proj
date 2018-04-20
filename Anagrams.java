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

public class Anagrams extends Game {//implements ActionListener {
    public String n = "Anagrams";
    
    @Override
    public void setTitle(String s) {
        title.replace("The MadGabFly", n);
    }
            
    
    public ActionListener bl1 = new ActionListener() {
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e) {
            if(e.getSource().equals(btn1)){pword=in.getText();}
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    };
    public static Listener bl2 = new Listener() {};
        
    
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

//public  int playAnagrams() throws InterruptedException {
        // //this line doesnt wait
        /*
        public static class Waitn extends Thread {

     public Waitn() {} // constructor
     public void start() {while(something==true){ 
			//do stuff 
			wait();
         } 
	   } 
	 }

  //and then later in code somewhere you start the thread.
  Waitn waiter = new Waitn();
  waiter.start();
  //and in your action listener or however you get to you button pressed code, you notify the thread to wakeup.

  public void actionPerformed( ActionEvent ae ) {
    if( ae.getSource() == myButton ) {
     waiter.notify();

    }

  }

}
}

        
        if(pword.isEmpty()){
            System.out.println("pword is empty");
            btn1.getOnMouseClicked();
            line2.setText(line2.getText()+pword +"line 141");
            //do{btn1.getOnAction();}while(pword.isEmpty());//
        //}
        //while(pword.isEmpty()){
          //  ans.getOnAction();
            //wait(200); 
            }
        
        //if(btn1.getOnMouseClicked().toString().equalsIgnoreCase(cword)) {
            
        }
        else {
            while(pword.compareToIgnoreCase(cword)!=0){
            score = score - 5;
            points.setText("Score: "  + 2);
            line2.setText(line2.getText()+"TRY AGAIN!");
            //ans.getOnAction();
            btn1.getOnAction();
            //ans.notify();
            //btn1.getOnMouseClicked();
            System.out.println("Enter the predicted word: ");//only this line gets executed
            line1.setText("Enter the predicted word: ");
            Thread.sleep(2000);
            
            }
            //}while(!pword.equalsIgnoreCase(cword));
            
        }
        return score;
    }

    @Override
    public void actionPerformed(java.awt.event.ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
}
