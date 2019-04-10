
package bsujavalab05t4;

public class VolwelOrConsonantOpt2 {
    
    public static String checkLetter (char letter) {
        
        String result;
        if (letter == 'e' || letter == 'u' || letter == 'i' || letter == 'o'
                || letter == 'a'){
            result = "The letter /" + letter + "/ is a volwel.";
        }
        else{
             result = "The letter /" + letter + "/ is a consonant.";
        }
        return result;
    }
}
