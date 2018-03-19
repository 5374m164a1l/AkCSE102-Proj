
package programming_project;

import static java.lang.Math.random;
import java.util.Scanner;
import java.util.Stack;
import static programming_project.Dictionary.giveWord;

public class Anagrams {
    
    public static void main(String[] args) {
        
    playAnagrams();
        
    }

    public static int playAnagrams() {
        
        Scanner scan = new Scanner(System.in);
        
        String word = giveWord();
        
        String cword = word;
        
        int score = 0;
        
        System.out.println();
        
        System.out.print("The mixed word is: ");
        
        int l = word.length();
        
        String [] mw = new String[l];
        
        for(int i=0; i<l; i++) {
            
            do {
            
            double a = Math.random();
            
            a = a*l;
            
            int b = (int) a;
            
            mw[i] = String.valueOf(word.charAt(b));
            
            word = word.replaceFirst(mw[i], " ");
            
            if(!mw[i].equals(" ")) {
        
            System.out.print(mw[i]);
            
            }
            } while (mw[i].equals(" "));
        
        }
        
        System.out.println();
        
        System.out.println();
        
        System.out.print("Enter the predicted word: ");
        
        String pword = scan.nextLine();
        
        System.out.println();
              
        do {
        
        
        if(pword.equals(cword)) {
            
        }
        else {
            
            score = score - 5;
            
            System.out.println("TRY AGAIN!");
            
            System.out.println();
            
            System.out.println("Your score: " + score);
            
            System.out.println();
            
            System.out.print("Enter the predicted word: ");
        
            pword = scan.nextLine();
        
            System.out.println();
    
        }
        
        } while(!pword.equals(cword));
        
        score = score + 10;
        
        System.out.println("SUCCESS!");
        
        System.out.println();
        
        System.out.println("Your score: " + score);
        
        return score;
              
    }
    
       
}
