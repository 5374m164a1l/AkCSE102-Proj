package themadgabfly;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Seth Michail & Ekin Sert, CSE MSc program
 */
public class Dictionary {
        public static String[] dict = new String[4213];//string array is better for searching and accessing randomly
        
        //the dictionary source file
        public static File file1 = new File("/home/iridium/NetBeansProjects/TheMadGabfly/src/themadgabfly/Dictionary.txt");

        public static void populate(){//fills the array
            int i = 0;
            try {
                BufferedReader reader = new BufferedReader(new FileReader(file1));
                while(reader.ready() && i < 4213){
                    dict[i] = reader.readLine();
                    i++;
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Dictionary.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Dictionary.class.getName()).log(Level.SEVERE, null, ex);
            }
       }

    public static String giveWord() {
        
        double rd = Math.random()*4213;
        int ri = (int)rd;
        return dict[ri];
        
    }
    
    public static String giveWordbyLetter(String s) {
                

        double rd = Math.random()*4213;
        int ri = (int)rd;
        String rw = dict[ri];
        if (s.equals(rw.substring(0,1))) {
        return rw;
    
    }
    
    return giveWordbyLetter(s);
    
    }
    
    public static boolean preezent(String s1){
               

        boolean b = false;
        for (int q = 0; q < dict.length; q++){
        if(dict[q].equalsIgnoreCase(s1)){b = true; break;}
        
    }
        return b;
    }
    
    
}
