package themadgabfly;

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
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
public class Connections extends Game {//Application {
    public static Boolean bool = false;
    public static int score = 0;
    public static int iou = 0;
    public static String str = "";
    public static String llu = "";
    public static String c = "Connections";
    public static TextField in = new TextField();
    public static Text comp = new Text(Dictionary.giveWord());
    public static Text out = new Text("");
    public static Text points = new Text("");
    public static Button btn1 = new Button();
   // public static Button btn2 = new Button();
    public static Button btn3 = new Button();
    public static String[] usedwords = new String[150]; // to keep used words.        
    
    @Override
    public void setTitle(String c){
        title.replace("The MadGabFly", c);
    }
    
    

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

    
    /*
    louw = usedwords.length; // length of udeswords array.
      
        for(int v = 0; v < louw; v++) { // checks if the entry used or not.

        if (player.equals(usedwords[v])) {
           
        System.out.println("CPU Wins!");
        
        //System.exit(0);
            
        }
        
        }
        
        usedwords[iou] = player;
        
        iou++;
        
        int a = player.length();
        
        String flp = String.valueOf(player.charAt(0)); // first letter of player.
        
        String llp = String.valueOf(player.charAt(a-1)); // last letter of player.
        
        d = flp.equals(llu);
        
        llu = llp; 
       
        oe++;
        
        }
       
        } while(d);
        
        System.out.println("CPU Wins!");
        return score;
      
    public static class GraduationYear extends JPanel{
    private JTextField yearField;
    private JLabel yearIn,yearOut, graduationField;

    public GraduationYear(){
        this.setLayout(new GridLayout(2,2));
        TextListener listener = new TextListener();
        yearField = new JTextField(6);
        graduationField = new JLabel("????");
        JLabel yearIn = new JLabel("Enter college in");
        JLabel yearOut = new JLabel("Graduation Year");
        yearField.addActionListener(listener);
        this.add(yearIn);
        this.add(yearField);
        this.add(yearOut);
        this.add(graduationField);
    }

  public class TextListener implements ActionListener
   {
    public void actionPerformed(java.awt.event.ActionEvent event)
     {
        Integer year = new Integer(Integer.parseInt(yearField.getText())+4);
        //graduationField.setText(yearField.getText()+4);
        graduationField.setText(year.toString());
        
     }
    */
