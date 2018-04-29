package themadgabfly;

import static themadgabfly.Dictionary.*;

/**
 * @author Seth Michail & Ekin Sert, CSE MSc program
 */
public class Connections extends Game {//Application {
    public static Boolean bool = false;
    public static int iou = 0;
    public static String llu = "";
    public static String[] usedwords = new String[150]; // to keep used words.        
    
    
    @Override
    public void nextStep(String s){
        //what to when submit button
        if(preezent(pword)){
            if(!used(pword)){
                chkwrd(pword);
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
        //what to when start button
        message.setText("Type a word with first letter same as last letter of word shown below");
        cword = giveWord(); 
        if(!used(cword)){
            for (int i = 0; i < usedwords.length; i++) {
                if(usedwords[i]==null){
                    usedwords[i]=cword;
                    break;}
            }line1.setText(cword); //the word chosen by the computer
            llu = String.valueOf(cword.charAt(cword.length()-1));
         //last letter of the computers word
        }else{firstStep();}
        btn2.setVisible(false); //hides the start button
    }
    
    public void computr(){
        if(cword.isEmpty()){message.setText("Computer word not given!");return;}
        else{cword = Dictionary.giveWordbyLetter(llu);
            int louw = usedwords.length; // length of udeswords array.
            for(int v = 0; v < louw; v++) { // checks if the entry used or not.
                if (cword.equalsIgnoreCase(usedwords[v])) { 
                    cword = giveWordbyLetter(llu); // if computer word has already been used, 
                                         // gives another random word starts with 
                                         // last letter of user for cword.
                    v=0;
                    //what can we do if a suitable word can not be found? need to avoid infinte loop
                }
                else if (v==louw-1) {
                    break;
                }
            }
        }
        
        int a = cword.length();
        if(a>0){
            String flc = String.valueOf(cword.charAt(0));
            String llc = String.valueOf(cword.charAt(a-1));
            System.out.println("flc: "+flc+" "+cword+", llc: "+llc+", llu: "+llu);
            if(flc.equalsIgnoreCase(llu)){
                line1.setText(cword);
                for (int i = 0; i < usedwords.length; i++) {
                    if(usedwords[i]==null){usedwords[i]=cword;break;}}
                llu = llc;
                System.out.println(llu);
            }
        }
        for (int i = 0; i < usedwords.length; i++) {
            System.out.println(usedwords[i]);
            
        }
        
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
            llu=String.valueOf(s1.charAt(s1.length()-1));
            score = score + s1.length();
            points.setText("Score: " + score); System.out.println("*"+score+"*");
            for (int i = 0; i < usedwords.length; i++) {
            if(usedwords[i]==null){usedwords[i]=s1;break;}}
        }else if(String.valueOf(s1.charAt(0)).equalsIgnoreCase(llu)){//checks if first
                     //letter of player word matches last letter of computer word
            llu=String.valueOf(s1.charAt(s1.length()-1));
            score = score + s1.length();
            points.setText("Score: " + score); System.out.println("*"+score+"*");
            for (int i = 0; i < usedwords.length; i++) {
            if(usedwords[i]==null){usedwords[i]=s1;break;}}
            
        }else{
            message.setText("First letter of your word needs to match last letter of word shown");
                score=score-(cword.length()/2);
                points.setText("Score: " + score);
                return;
        }
        System.out.println(usedwords[usedwords.length-1]);
            computr();
            
    }
}
