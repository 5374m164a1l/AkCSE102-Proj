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
        //what to when submit button
        if(pword.equalsIgnoreCase(cword)){
            message.setText("You Win! Press start for next word");
            score = score + s.length();
            points.setText("Score: " + score);
            wordUsed(cword);
            cword=giveWord();
        }else{
            message.setText("Press start to try again");
        }
    }
    
    @Override
    public void firstStep(){
        //what to when start button
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
                //System.out.println(b);
                mw[i] = String.valueOf(str.charAt(b));
                str = str.replaceFirst(mw[i], " ");
                if(!mw[i].equals(" ")) {
                //System.out.print(mw[i]);
                dword += mw[i];
                }
                
            } while (mw[i].equals(" "));
            System.out.println(dword);
        }
        message.setText("The mixed word is: ");
        line1.setText(dword);
        line2.setText(cword);
        wordUsed(cword);
        dword="";
    }

    public void wordUsed(String s){
        
        for(int h =0; h < usedwords.length -1; h++){
            if(usedwords[h]!=null){
                if(s.equalsIgnoreCase(usedwords[h])){
                System.out.println("theres a problem");
                message.setText("theres a problem");
            }else if(usedwords[h]==null){
                usedwords[h] = s;
            }
            }   
        }
    }
 }

