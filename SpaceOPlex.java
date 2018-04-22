package themadgabfly;

import javafx.scene.text.Text;
import static themadgabfly.Dictionary.*;


/**
 * @author Seth Michail & Ekin Sert, CSE MSc program
 */
public class Space_o_plex extends Game {
    public String str = "";
    public static String[] usedwords = new String[150];
    public static String llu = "";
    //we need to make some adjustments. i.e. start with a couple clues such as "_ i _ _ f _ _"
    //we should also update the word, i.e. player guesses "eclipse", words gets 
    //updated to "_ i _ _ f _ e", points scheme, number of tries, etc.

    @Override
    public void nextStep(String s){
        //what to when submit button
        if(preezent(pword)){
            if(!used(pword)){
                chkwrd(pword);
            }else{
                line2.setText("pick a different word");
                return;
            }
        }else{line2.setText("Write a different word");
            return;
        }
        
    }
    
    @Override
    public void firstStep(){
        //what to when start button
        cword = giveWord();
        int l = cword.length();
        for(int q =0; q < l; q++){
            str +="_ ";
        }
        line1.setText(str);
        line2.setText("");
        System.out.println(str);
        System.out.println(cword);
    }
    
    public Boolean used(String s1){
        boolean val = false;
        if(usedwords.length>0){
        for(int v = 0; v < usedwords.length; v++) { // checks if the entry used or not.
            if (s1.equalsIgnoreCase(usedwords[v])) { 
                val = true; //if user word has been used
                break;
            }
        }
        }
        return val;
    }

    public void chkwrd(String s1){
        if(usedwords[0]==null){//if no words used yet
            score = score + s1.length();
            points.setText("Score: " + score); System.out.println("*"+score+"*");
            message.setText("You Win! Press start for next word");
            line1.setText(""); str="";
        }else if(String.valueOf(s1.charAt(0)).equalsIgnoreCase(llu)){//checks if first
                     //letter of player word matches last letter of computer word
            score = score + s1.length();
            points.setText("Score: " + score); System.out.println("*"+score+"*");
            message.setText("You Win! Press start for next word");
            line1.setText("");str="";
        }
    }
   
}
