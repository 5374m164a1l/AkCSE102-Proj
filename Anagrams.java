package themadgabfly;

import java.util.HashSet;
import static themadgabfly.Dictionary.giveWord;
import static themadgabfly.Dictionary.populate;
import static themadgabfly.Settings.dbtn2;

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
        wmixr(cword.toString());
    }
    
    public void wmixr(String str){
        int l = str.length();
        if(dbtn2.isSelected() && str.length()>5){
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
            }
        }
        message.setText("The mixed word is: ");
        line1.setText(dword.toString());
        dword.delete(0, dword.length());//clears the stringbuilder for reuse
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

