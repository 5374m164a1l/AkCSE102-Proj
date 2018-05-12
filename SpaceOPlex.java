package themadgabfly;

import java.util.HashSet;
import javafx.scene.text.Text;
import static themadgabfly.Dictionary.*;
import static themadgabfly.Settings.*;

/**
 * @author Seth Michail & Ekin Sert, CSE MSc program
 */
public class Space_o_plex extends Game {
    public static Boolean e = true; //was going to use this for settings changes
    public StringBuilder str = new StringBuilder();
    public static HashSet usedWords = new HashSet(256);
    public static StringBuilder tmp = new StringBuilder();
    
            
    @Override
    public void nextStep(StringBuilder s){
        //what to when submit button is pressed
        if(preezent(pword.toString())){
            if(!used(pword.toString())){
                chkwrd(pword.toString());
            }else{
                line2.setText("That word has been used, pick a different word");
                score=score-(cword.length()/2);
                points.setText("Score: " + score);
                return;
            }
        }else{line2.setText("I don't know that word, write a different word");
            score=score-(cword.length()/4);
            points.setText("Score: " + score);
            if(cword.length()==pword.length()){ //what follows is one part of the update 
                    //mechanism, the other part is the same thing, just in a different method body
                    str.replace(0, str.length()-1, pword.toString());
                for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)==' '){
                }else{tmp.append(str.charAt(i));}}
            str.delete(0, str.length());
            for (int i = 0; i < cword.length(); i++) {
                if(cword.charAt(i)==pword.charAt(i) || cword.charAt(i)==tmp.charAt(i)){
                    str.append(cword.charAt(i));
                
                }else{str.append("_ ");}
            }
        }
            line1.setText(str.toString());
            return;
        }
        btn2.setText("Next");
        btn2.setVisible(true);
    }
    
    @Override
    public void firstStep(){
        populate();

        //what to when start button is pressed
        btn2.setVisible(false);
        int r1 = (int)(Math.random()*4);
        int r2 = (int)(Math.random()*9);
        int r3 = (int)(Math.random()*15);
        int r4 = (int)(Math.random()*21);
        
        message.setText("");
        if(cword.length()>0){
            cword.delete(0, cword.length());
            cword.append(giveWord());
        }else{
            cword.append(giveWord());
        }
        int l = cword.length();
        for(int q =0; q < l; q++){
            if(q==r1 || q==r2 || q==r3 || q==r4){
                str.append(cword.charAt(q));//where to put the clues based on word size
            }else if(dbtn1.isSelected() && (q==0 || q==l-1)){
                str.append(cword.charAt(q));
            }else{str.append("_ ");
            }//sets the placeholders for the word, including clues
        }
        line1.setText(str.toString());
        line2.setText(cword.length() + " letters");
    }
    
    public Boolean used(String s1){
        boolean val = false;            //the default value of false indicates the assumption that the word has not been used
        
        if(usedWords.size()>0){
            if(usedWords.contains(s1)){// checks if the entry used or not.
                val = true;         //if user word or computer word has been used
            }
        }
        return val;
    }

    public void chkwrd(String s1){
        if(pword.toString().equalsIgnoreCase(cword.toString())){//checks if user word matches computer word
            score = score + s1.length();
            points.setText("Score: " + score); System.out.println("*"+score+"*");
            message.setText("You Win! Press Next for next word");
            line1.setText("");str.delete(0, str.length());
        }else{
            score=score-(cword.length()/4);//if not, apply a penalty
            points.setText("Score: " + score);
            if(cword.length()==pword.length()){
            
            for (int i = 0; i < str.length(); i++) { //the other update part, because the player needs help
                if(str.charAt(i)==' '){
                }else{tmp.append(String.valueOf(str.charAt(i)));}}
            str.delete(0, str.length());
            for (int i = 0; i < cword.length(); i++) {
                if(cword.charAt(i)==pword.charAt(i) || cword.charAt(i)==tmp.charAt(i)){
                    str.append(String.valueOf(cword.charAt(i)));
                
                }else{str.append("_ ");}
            }
        }
        
            line1.setText(str.toString());}
    }
   
}
