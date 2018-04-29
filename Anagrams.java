package themadgabfly;

import static themadgabfly.Dictionary.giveWord;

/**
 * @author Seth Michail & Ekin Sert, CSE MSc program
 */

public class Anagrams extends Game {//implements ActionListener {
    public String n = "Anagrams";
    public static int iou = 0;
    public static String[] usedwords = new String[150]; // to keep used words.        
    
    
    @Override
    public void nextStep(String s){
        //what to when submit button is pressed
        if(pword.equalsIgnoreCase(cword)){
            message.setText("You Win! Press Next for next word");
            line1.setText("");
            line2.setText("");
            score = score + s.length();
            points.setText("Score: " + score);
            wordUsed(cword);
            cword=giveWord();
        }else{
            message.setText("Press Next to try again");
            score=score-(cword.length()/4);
            points.setText("Score: " + score);
        }
    }
    
    @Override
    public void firstStep(){
        //what to when start button is pressed
        wmixr(cword);
        
        
    }
    
        
    
    public void wmixr(String str){
        int l = str.length();
        String [] mw = new String[l];
        
        for(int i=0; i<l; i++) {
            do {
                double a = Math.random();
                a = a*l;
                int b = (int) a;
                mw[i] = String.valueOf(str.charAt(b));
                str = str.replaceFirst(mw[i], " ");
                if(!mw[i].equals(" ")) {
                dword += mw[i];
                }
                
            } while (mw[i].equals(" "));
            System.out.println(dword);
        }
        message.setText("The mixed word is: ");
        line1.setText(dword);
        wordUsed(cword);
        dword="";
    }

    public void wordUsed(String s){
        
        for(int h =0; h < usedwords.length -1; h++){
            if(usedwords[h]!=null){
                if(s.equalsIgnoreCase(usedwords[h])){
                System.out.println("theres a problem");
                message.setText("That word has been used, type a different word");
                score=score-(cword.length()/3);
                points.setText("Score: " + score);
                return;
            }else if(usedwords[h]==null){
                usedwords[h] = s;
            }
            }   
        }
    }
 }
