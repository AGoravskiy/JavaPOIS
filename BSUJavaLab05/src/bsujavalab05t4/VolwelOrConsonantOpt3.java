
package bsujavalab05t4;

public class VolwelOrConsonantOpt3 {
    
    public static String checkLetter (char letter) {
        
        String result;
        switch (letter){
            case 'e':{}
            case 'o':{}
            case 'u':{}
            case 'i':{}
            case 'a':{
                result = "The letter /" + letter + "/ is a volwel.";
                break;
            }
            default:{
            result = "The letter /" + letter + "/ is a volwel.";
            }
        }
        
        return result;
    }
}
