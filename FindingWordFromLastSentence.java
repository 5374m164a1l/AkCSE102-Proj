package themadgabfly;

import static themadgabfly.Dictionary.*;

/**
 * @author Seth Michail & Ekin Sert, CSE MSc program
 */
public class Connections extends Game {//Application {
    public static Boolean bool = false;
    public static int iou = 0;
    public static String cpu = "";
    public static String llu = "";
    public static String[] usedwords = new String[150]; // to keep used words.        
    
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
        computr();//this is not working
    }
    
    @Override
    public void firstStep(){
        //what to when start button
        //message.setText("Please enter the first word: ");
        cpu = giveWord();
        usedwords[0]=cpu;
        line1.setText(cpu);
        llu = String.valueOf(cpu.charAt(0));
    
    }
    
    public void computr(){
        if(cpu.isEmpty()){message.setText("Computer word not given!");return;}
        else{cpu = Dictionary.giveWordbyLetter(llu);
            int louw = usedwords.length; // length of udeswords array.
            for(int v = 0; v < louw; v++) { // checks if the entry used or not.
                if (cpu.equalsIgnoreCase(usedwords[v])) { 
                    cpu = giveWordbyLetter(llu); // if computer word has already been used, 
                                         // gives another random word starts with 
                                         // last letter of user for cpu.
                    v=0;
            //break;
                }//else if(cpu.charAt(0).){}
                else if (v==louw-1) {
                    break;
                }
            }
        
        int a = cpu.length();
        if(a>0){
            String flc = String.valueOf(cpu.charAt(0));
            String llc = String.valueOf(cpu.charAt(a-1));
            System.out.println("flc: "+flc+", llc: "+llc+", llu: "+llu);
            if(flc.equalsIgnoreCase(llu)){
                line1.setText(cpu+"_");
                usedwords[iou] = cpu;
                iou++;
                llu = llc;
            }
        }
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
            score = score + s1.length();
            points.setText("Score: " + score); System.out.println("*"+score+"*");
        }else if(String.valueOf(s1.charAt(0)).equalsIgnoreCase(llu)){//checks if first
                     //letter of player word matches last letter of computer word
            score = score + s1.length();
            points.setText("Score: " + score); System.out.println("*"+score+"*");
        }
    }
}
