package themadgabfly;

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
import static themadgabfly.Dictionary.*;
import static themadgabfly.Game.*;


/**
 * @author Seth Michail & Ekin Sert, CSE MSc program
 */
public class Space_o_plex extends Game {
    public String str = "Space O Plex";
    //public String title = "Space O Plex";
    public static StringBuilder gameName = new StringBuilder("Space O Plex");
    public static Text out1 = new Text("Your Guess: ");
    public static Text out2 = new Text("");
    public static String input = "";
    public static String output = "";


 
    //if(tf == true){}
    
   @Override
    public void setTitle(String s) {
        title.replace("The MadGabFly", s);
        
    }
    
    
    public void spaceoplex(){
        
    String wfg = giveWord(); // word for guess.

    //System.out.println(wfg);

    int low = wfg.length(); // length of the word for guess(wfg).

    line1.setText("Guess the word: ");

    for(int i = 0; i < low; i++) {
    
    dword += "_ ";

    }
    line2.setText(dword);
    
    line1.setText("You have " + low + " chance to guess the word!");

    int lou = 0;
line1.setText(pword);
        /*btn1.getOnAction(new EventHandler<ActionEvent>() {
            
            @Override
            public void handle(ActionEvent event) {
                pword=in.getText();
                line2.setText(pword);
                in.setText("");
                
                }));}
    
    do { // checks both length if they are equal or not.
    
    System.out.print("Your 1st guess: ");

    pword = in.getText(); // gets pword's answer.

    low = wfg.length(); // length of the word for guess(wfg).

    lou = pword.length(); // length of the pword's estimation.

    if(lou != low) {
    
    System.out.println("Check length of your guess!");
    
    }
    
    } while(lou != low);

    System.out.println("Let's check!");

    if(pword.equalsIgnoreCase(wfg)) {
    
    System.out.println("You are lucky!");

    }

    else {
    
    for(int x = 2; x < low+1; x++) {
    
    System.out.print("Continue to guess: ");

    for(int i = 0; i < low; i++) {

    if((pword.substring(i, i+1)).equalsIgnoreCase((wfg.substring(i, i+1)))) {
    
    System.out.print((pword.substring(i, i+1)));

    }

    else {
    
    System.out.print("_ ");

    }

    }

    System.out.println();
    
    do {
    
    System.out.print("Make your guess " + x + ":");
    
    pword = in.getText();

    System.out.println();

    if(wfg.length() != pword.length()) {
    
    System.out.println("Check length of your guess!");

    }

    }while(wfg.length() != pword.length());

    }

    }

    if(!pword.equalsIgnoreCase(wfg)) {

    System.out.println("GAME OVER!");

    }

    else {
    
    System.out.println("YOU WON!");

    }*/
}
}
