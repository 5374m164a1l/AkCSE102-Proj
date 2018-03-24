
package programming_project;

import java.util.Scanner;

import static programming_project.Dictionary.giveWordbyLetter;

public class FindingWordFromLastSentence {
    
    public static void main(String[] args) {
        
        boolean d = false; // will be used to check if the first letter of player is equal to last letter of cpu.
        
        int oe = 0; // odd or even number. (to remain frequency btw user and cpu)
        
        String[] usedwords = new String[150]; // to keep used words.
        
        for(int k = 0; k < 150; k++) {
            
        usedwords[k] = "xxxx"; // default values for array members.
            
        }
        
        int iou = 0; // index of usedwords.
        
        int louw = 0; // length od usedwors array(150)
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please enter the first word: ");
        
        String user = scan.nextLine(); // first word of the game.
        
        usedwords[iou] = user; // to add the word to used words.
        
        iou++;
        
        int i = user.length();
        
        String llu = String.valueOf(user.charAt(i-1)); // last letter of user's entry.
        
        do {
            
        if(oe%2 == 0) {
      
        System.out.print("CPU is entering the next word: ");
        
        String cpu = giveWordbyLetter(llu); // creates a word starts with last letter of user entry.
        
        louw = usedwords.length; // length of udeswords array.
      
        for(int v = 0; v < louw; v++) { // checks if the entry used or not.
            
        if (cpu.equals(usedwords[v])) { // SETH COULD YOU PLEASE CHECK HERE, IT DOES NOT COMPERE TWO WORDS.
         
        cpu = giveWordbyLetter(llu); // gives another random word starts with last letter of user for cpu.
        
        if (v == louw-1) {
            
        System.out.println("Player Wins!");
            
        System.exit(0);
            
        }
       
        }
        
        else {
            
        System.out.println("tried C");
            
        v = louw;
        
        }

        }
        
        System.out.println(cpu);
        
        usedwords[iou] = cpu;
        
        iou++;
        
        int a = cpu.length();
        
        String flc = String.valueOf(cpu.charAt(0));
        
        String llc = String.valueOf(cpu.charAt(a-1));
        
        d = flc.equals(llu);
        
        llu = llc;
       
        oe++;
        
        }
        
        else if(oe%2 == 1) {
                 
        System.out.print("Player is entering the next word: ");
        
        String player = scan.nextLine();
        
        louw = usedwords.length; // length of udeswords array.
      
        for(int v = 0; v < louw; v++) { // checks if the entry used or not.

        if (player.equals(usedwords[v])) {
           
        System.out.println("CPU Wins!");
        
        System.exit(0);
            
        }
        
        }
        
        usedwords[iou] = player;
        
        iou++;
        
        int a = player.length();
        
        String flp = String.valueOf(player.charAt(0)); // first letter of player.
        
        String llp = String.valueOf(player.charAt(a-1)); // last letter of player.
        
        d = flp.equals(llu);
        
        llu = llp; 
       
        oe++;
        
        }
       
        } while(d);
        
        System.out.println("CPU Wins!");
        
        }
    
}
