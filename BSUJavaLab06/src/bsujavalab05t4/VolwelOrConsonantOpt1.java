
package bsujavalab05t4;

public class VolwelOrConsonantOpt1 {
    
    public static String checkLetter (String letter) {
        
        String result;
        String volwels = "euioa";
        if (volwels.contains(letter)){
            result = "The letter /" + letter + "/ is a volwel.";
        }
        else{
             result = "The letter /" + letter + "/ is a consonant.";
        }
        return result;
    }
}
