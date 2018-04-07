
package programming_project;

import java.util.Scanner;
import static programming_project.Dictionary.giveWord;

public class SpaceOPlex {
    
public static void main(String[] args) {
    
Scanner scan = new Scanner(System.in);
    
String wfg = giveWord(); // word for guess.

//System.out.println(wfg);

int low = wfg.length(); // length of the word for guess(wfg).

System.out.print("Guess the word: ");

for(int i = 0; i < low; i++) {
    
System.out.print("_ ");

}

System.out.println();

System.out.println("You have " + low + " chance to guess the word!");

int lou = 0;

String user;

do { // checks both length if they are equal or not.
    
System.out.print("Your 1st guess: ");

user = scan.nextLine(); // gets user's answer.

low = wfg.length(); // length of the word for guess(wfg).

lou = user.length(); // length of the user's estimation.

if(lou != low) {
    
System.out.println("Check length of your guess!");

}

} while(lou != low);

System.out.println("Let's check!");

if(user.equalsIgnoreCase(wfg)) {
    
System.out.println("You are lucky!");

}

else {
    
for(int x = 2; x < low+1; x++) {
    
System.out.print("Continue to guess: ");

for(int i = 0; i < low; i++) {

if((user.substring(i, i+1)).equalsIgnoreCase((wfg.substring(i, i+1)))) {
    
System.out.print((user.substring(i, i+1)));

}

else {
    
System.out.print("_ ");

}

}

System.out.println();

do {
    
System.out.print("Make your guess " + x + ":");
    
user = scan.nextLine();

System.out.println();

if(wfg.length() != user.length()) {
    
System.out.println("Check length of your guess!");

}

}while(wfg.length() != user.length());

}

}

if(!user.equalsIgnoreCase(wfg)) {

System.out.println("GAME OVER!");

}

else {
    
System.out.println("YOU WON!");

}

}
    
}
