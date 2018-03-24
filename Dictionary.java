
package programming_project;

public class Dictionary {
    
    public static String giveWord() {
    
    String[] dict = new String[75];
 
    dict[0] = "elephant"; dict[1] = "aeroplane"; dict[2] = "chicago"; dict[3] = "giraffe"; dict[4] = "microscope";
    dict[5] = "vegetable"; dict[6] = "biological"; dict[7] = "purple"; dict[8] = "desire"; dict[9] = "space";
    dict[10] = "article"; dict[11] = "accomplishment"; dict[12] = "beach"; dict[13] = "brave"; dict[14] = "curriculum"; 
    dict[15] = "card"; dict[16] = "development"; dict[17] = "delicious"; dict[18] = "geography"; dict[19] = "gigabyte"; 
    dict[20] = "hesitation"; dict[21] = "history"; dict[22] = "insect"; dict[23] = "incredible"; dict[24] = "importing";
    dict[25] = "jansen"; dict[26] = "jungle"; dict[27] = "justify"; dict[28] = "kid"; dict[29] = "kenya";
    dict[30] = "kangroo"; dict[31] = "lung"; dict[32] = "linguistic"; dict[33] = "local"; dict[34] = "massive"; 
    dict[35] = "mandatory"; dict[36] = "nephew"; dict[37] = "newspaper"; dict[38] = "north"; dict[39] = "optimistic"; 
    dict[40] = "optimal"; dict[41] = "oligarchy"; dict[42] = "pearl"; dict[43] = "philosophy"; dict[44] = "realistic";
    dict[45] = "report"; dict[46] = "recognize"; dict[47] = "selfy"; dict[48] = "scientific"; dict[49] = "telegraph";
    dict[50] = "trasportation"; dict[51] = "traffic"; dict[52] = "universe"; dict[53] = "ultimate"; dict[54] = "ultimatum";
    dict[55] = "virtual"; dict[56] = "vertical"; dict[57] = "yankee"; dict[58] = "yatching"; dict[59] = "yesterday";
    dict[60] = "zoo"; dict[61] = "zeppelin"; dict[62] = "zipper"; dict[63] = "washington"; dict[64] = "welding";
    dict[65] = "wall"; dict[66] = "xenon"; dict[67] = "xray"; dict[68] = "xylography"; dict[69] = "enemy";
    dict[70] = "eclipse"; dict[71] = "yield"; dict[72] = "contrast"; dict[73] = "global"; dict[74] = "neon";
    
    
    double rd = Math.random()*75;
    
    int ri = (int)rd;
    
    return dict[ri];
    
    }
    
    public static String giveWordbyLetter(String s) {
    
    String[] dict = new String[75];
 
    dict[0] = "elephant"; dict[1] = "aeroplane"; dict[2] = "chicago"; dict[3] = "giraffe"; dict[4] = "microscope";
    dict[5] = "vegetable"; dict[6] = "biological"; dict[7] = "purple"; dict[8] = "desire"; dict[9] = "space";
    dict[10] = "article"; dict[11] = "accomplishment"; dict[12] = "beach"; dict[13] = "brave"; dict[14] = "curriculum"; 
    dict[15] = "card"; dict[16] = "development"; dict[17] = "delicious"; dict[18] = "geography"; dict[19] = "gigabyte"; 
    dict[20] = "hesitation"; dict[21] = "history"; dict[22] = "insect"; dict[23] = "incredible"; dict[24] = "importing";
    dict[25] = "jansen"; dict[26] = "jungle"; dict[27] = "justify"; dict[28] = "kid"; dict[29] = "kenya";
    dict[30] = "kangroo"; dict[31] = "lung"; dict[32] = "linguistic"; dict[33] = "local"; dict[34] = "massive"; 
    dict[35] = "mandatory"; dict[36] = "nephew"; dict[37] = "newspaper"; dict[38] = "north"; dict[39] = "optimistic"; 
    dict[40] = "optimal"; dict[41] = "oligarchy"; dict[42] = "pearl"; dict[43] = "philosophy"; dict[44] = "realistic";
    dict[45] = "report"; dict[46] = "recognize"; dict[47] = "selfy"; dict[48] = "scientific"; dict[49] = "telegraph";
    dict[50] = "trasportation"; dict[51] = "traffic"; dict[52] = "universe"; dict[53] = "ultimate"; dict[54] = "ultimatum";
    dict[55] = "virtual"; dict[56] = "vertical"; dict[57] = "yankee"; dict[58] = "yatching"; dict[59] = "yesterday";
    dict[60] = "zoo"; dict[61] = "zeppelin"; dict[62] = "zipper"; dict[63] = "washington"; dict[64] = "welding";
    dict[65] = "wall"; dict[66] = "xenon"; dict[67] = "xray"; dict[68] = "xylography"; dict[69] = "enemy";
    dict[70] = "eclipse"; dict[71] = "yield"; dict[72] = "contrast"; dict[73] = "global"; dict[74] = "neon";
    
    double rd = Math.random()*75;
    
    int ri = (int)rd;
    
    String rw = dict[ri];
    
    if (s.equals(rw.substring(0,1))) {
        
    return rw;
    
    }
    
    return giveWordbyLetter(s);
    
    }
    
}
