
package programming_project;

import java.util.Scanner;

public class FindingWordFromLastSentence {
    
    public static void main(String[] args) {
        
        boolean d = false;
        
        int oe = 0; // odd or even.
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please enter the first word: ");
        
        String user = scan.nextLine();
        
        int i = user.length();
        
        String llu = String.valueOf(user.charAt(i-1));
        
        do {
            
        if(oe%2 == 0) {
                 
        System.out.print("CPU is entering the next word: ");
        
        String cpu = scan.nextLine();
        
        int a = cpu.length();
        
        String flc = String.valueOf(cpu.charAt(0));
        
        String llc = String.valueOf(cpu.charAt(a-1));
        
        d = flc.equals(llu);
        
        llu = llc;
       
        oe++;
        
        }
        
        else if(oe%2 == 1) {
                 
        System.out.print("Player is entering the next word: ");
        
        String cpu = scan.nextLine();
        
        int a = cpu.length();
        
        String flc = String.valueOf(cpu.charAt(0));
        
        String llc = String.valueOf(cpu.charAt(a-1));
        
        d = flc.equals(llu);
        
        llu = llc;
       
        oe++;
        
        }
       
        } while(d);
        
        }
    
}
