package themadgabfly;

import java.util.HashSet;
import static themadgabfly.Dictionary.*;

/**
 * @author Seth Michail & Ekin Sert, CSE MSc program
 */
public class Connections extends Game {//Application {
    public static Boolean bool = false;
    public static int iou = 0;
    public static String llu = "";
    public static HashSet usedWords = new HashSet(256);
    
    
    @Override
    public void nextStep(StringBuilder s){
        //what to when submit button pressed
        if(preezent(pword.toString())){
            if(!used(pword.toString())){
                chkwrd(pword.toString());
            }else{
                message.setText("That word has been used, choose another word");
                score=score-(cword.length()/2);
                points.setText("Score: " + score);
                return;
            }
        }else{message.setText("I don't know that word, write a different word");
            score=score-(cword.length()/4);
            points.setText("Score: " + score);
            return;
        }
        
    }
    
    @Override
    public void firstStep(){
        populate();
        //what to when start button pressed
        message.setText("Type a word with first letter same as last letter of word shown below");
        if(cword.length()>0){
            cword.delete(0, cword.length());
            cword.append(giveWord());//first word
        }else{
            cword.append(giveWord());//also first word
        }       
        if(!used(cword.toString())){//if not used, add it to used
            usedWords.add(cword.toString());
            line1.setText(cword.toString());       //the word chosen by the computer
            llu = String.valueOf(cword.charAt(cword.length()-1));
                                        //last letter of the computers word
        }else{
            firstStep();                //recursive method call
        }
        btn2.setVisible(false);         //hides the start button
    }
    
    public void computr(){              //this method gets a word for the computer based on the last letter of the users word
        int j = 0;
        if(cword.length()==0){
            //sets message and exits method, because something went whack
            message.setText("Computer word not given!");
            return;
        }  
        else{                                       
            while(used(cword.toString())){
                cword.delete(0, cword.length());
                cword.append(giveWordbyLetter(llu));
                j++;
                if(j>100){//to prevent infinite loop if all valid words have been used
                    message.setText("You Win!");
                    break;
                }
            }
        }
        if(cword.length()>0){
            String flc = String.valueOf(cword.charAt(0));
            String llc = String.valueOf(cword.charAt(cword.length()-1));
            if(flc.equalsIgnoreCase(llu)){
                line1.setText(cword.toString());
                usedWords.add(cword.toString());
                llu = llc;
            }
                
        }
    }
    
    public Boolean used(String s1){
        boolean val = false;            //the default value of false indicates the assumption that the word has not been used
        
        if(usedWords.size()>0){
            if(usedWords.contains(s1)){ // checks if the entry used or not.
                val = true;             //if user word or computer word has been used
            }
        }
        return val;
    }

    public void chkwrd(String s1){
        if(usedWords.isEmpty()){//if no words used yet
            llu=String.valueOf(s1.charAt(s1.length()-1));
            score = score + s1.length();
            message.setText("You can do it!");
            points.setText("Score: " + score); 
            usedWords.add(s1);
        }else if(String.valueOf(s1.charAt(0)).equalsIgnoreCase(llu)){//checks if first
                     //letter of player word matches last letter of computer word
            llu=String.valueOf(s1.charAt(s1.length()-1));
            score = score + s1.length();
            message.setText("Keep up the good work!");
            points.setText("Score: " + score); 
            usedWords.add(s1);
        }else{
            message.setText("First letter of your word needs to match last letter of word shown");
                score=score-(cword.length()/2);
                points.setText("Score: " + score);
                return;
        }
        computr();              //to get a new word for the computer
            
    }
}
