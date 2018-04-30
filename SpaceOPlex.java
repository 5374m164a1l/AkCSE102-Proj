package themadgabfly;

import javafx.scene.text.Text;
import static themadgabfly.Dictionary.*;

/**
 * @author Seth Michail & Ekin Sert, CSE MSc program
 */
public class Space_o_plex extends Game {
    public static Boolean e = true; //was going to use this for settings changes
    public String str = "";
    public static String[] usedwords = new String[150];
    public static String tmp = "";
    
    @Override
    public void nextStep(String s){
        //what to when submit button is pressed
        if(preezent(pword)){
            if(!used(pword)){
                chkwrd(pword);
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
                for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)==' '){
                }else{tmp+=String.valueOf(str.charAt(i));}}
            str="";
            for (int i = 0; i < cword.length(); i++) {
                if(cword.charAt(i)==pword.charAt(i) || cword.charAt(i)==tmp.charAt(i)){
                    str+=String.valueOf(cword.charAt(i));
                
                }else{str+="_ ";}
            }
        }
            line1.setText(str);
            return;
        }
        btn2.setText("Next");
        btn2.setVisible(true);
    }
    
    @Override
    public void firstStep(){
        //what to when start button is pressed
        btn2.setVisible(false);
        int r1 = (int)(Math.random()*4);
        int r2 = (int)(Math.random()*9);
        int r3 = (int)(Math.random()*15);
        System.out.println(r1 +" "+r2);
        message.setText("");
        cword = giveWord();
        int l = cword.length();
        if(r1 < l && r2 < l){
            for(int q =0; q < l; q++){
                if(q==r1 || q==r2 || q==r3){str +=cword.charAt(q);//where to put the clues based on word size
                }else{str +="_ ";}//sets the placeholders for the word, including clues
            }
        }else{firstStep();}
        line1.setText(str);
        line2.setText(cword.length() + " letters");
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
        if(pword.equalsIgnoreCase(cword)){//checks if user word matches computer word
            score = score + s1.length();
            points.setText("Score: " + score); System.out.println("*"+score+"*");
            message.setText("You Win! Press Next for next word");
            line1.setText("");str="";
        }else{
            score=score-(cword.length()/4);//if not, apply a penalty
            points.setText("Score: " + score);
            if(cword.length()==pword.length()){
            
            for (int i = 0; i < str.length(); i++) { //the other update part, because the player needs help
                if(str.charAt(i)==' '){
                }else{tmp+=String.valueOf(str.charAt(i));}}
            str="";
            for (int i = 0; i < cword.length(); i++) {
                if(cword.charAt(i)==pword.charAt(i) || cword.charAt(i)==tmp.charAt(i)){
                    str+=String.valueOf(cword.charAt(i));
                
                }else{str+="_ ";}
            }
        }
        
            line1.setText(str);}
    }
   
}
