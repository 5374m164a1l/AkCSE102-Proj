package themadgabfly;

import java.util.HashSet;
import static themadgabfly.Dictionary.giveWord;
import static themadgabfly.Dictionary.populate;
import static themadgabfly.Settings.dbtn1;
import static themadgabfly.Settings.loadSaves;

/**
 * @author Seth Michail & Ekin Sert, CSE MSc program
 */

public class Anagrams extends Game {
    public static int iou = 0;
    public static HashSet usedWords = new HashSet(256);
    
    @Override
    public void nextStep(StringBuilder s){
        //what to when submit button is pressed
        if(pword.toString().equalsIgnoreCase(cword.toString())){
            message.setText("You Win! Press Next for next word");
            line1.setText("");
            line2.setText("");
            score = score + s.length();
            points.setText("Score: " + score);
            wordUsed(cword.toString());
            cword.delete(0, cword.length());
            cword.append(giveWord());
        }else{
            message.setText("Press Next to try again");
            score=score-(cword.length()/4);
            points.setText("Score: " + score);
        }
    }
    
    @Override
    public void firstStep(){
              populate();

        //what to when start button is pressed
        cword.delete(0, cword.length());
        cword.append(giveWord());
        System.out.println(cword.toString());
        wmixr(cword.toString());
    }
    
    public void wmixr(String str){
        int l = str.length();
        if(dbtn1.isSelected() && str.length()>5){//str length <= 5 means no swapping
            String str2 = str.substring(1, str.length()-1);
            int k = str2.length();
            String [] mw = new String[k];
            dword.replace(0, 1, str.subSequence(0, 1).toString());
            for(int i=0; i<k; i++) {
            do {
                double a = Math.random();
                a = a*k;
                int b = (int) a;
                
                mw[i] = String.valueOf(str2.charAt(b));
                str2 = str2.replaceFirst(mw[i], " ");
                if(!mw[i].equals(" ")) {
                dword.append(mw[i]);
                }
                
            } while (mw[i].equals(" "));
            
        }
        dword.append(str.substring(str.length()-1, str.length()));
        System.out.println(dword.toString()+"line 68");
        }else{
            String [] mw = new String[l];
            for(int i=0; i<l; i++) {
            do {
                double a = Math.random();
                a = a*l;
                int b = (int) a;
                mw[i] = String.valueOf(str.charAt(b));
                str = str.replaceFirst(mw[i], " ");
                if(!mw[i].equals(" ")) {
                dword.append(mw[i]);
                }
                
            } while (mw[i].equals(" "));
            
        }System.out.println(dword.toString()+"line 83");
        }
        message.setText("The mixed word is: ");
        line1.setText(dword.toString());
        System.out.println(str +" : "+cword + " "+cword.charAt(cword.length()-1));
        //wordUsed(cword.toString());
        dword.delete(0, dword.length());
    }

    public void wordUsed(String s){
        if(usedWords.contains(s)){
            message.setText("That word has been used, type a different word");
            score=score-(cword.length()/3);
            points.setText("Score: " + score);
            return;
        }else{
            usedWords.add(s);
        }
        
    }
 }

