
package bsujavalab05t4;

public class VolwelOrConsonantOpt4 {
    
    public static String checkLetter (char letter) {
        
        String result = null;
        char volwels[] = {'e', 'u', 'i', 'o', 'a'};
        for(char c: volwels){
            if(letter == c){
                result = "The letter /" + letter + "/ is a volwel.";
            }
            else{
                result = "The letter /" + letter + "/ is a consonant.";
            }
            
        } 
        return result;
    }
}
