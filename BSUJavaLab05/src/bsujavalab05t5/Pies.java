
package bsujavalab05t5;

import java.lang.Math;

public class Pies {
    public static String choosePies(){
        
        String mood = null;
        
        switch ((int) (Math.random()*5)){
            case 0: mood = "surprise 1";
                break;
            
            case 1: mood = "surprise 2";
                break;
                
            case 2: mood = "surprise 3";
                break;
            
            case 3: mood = "surprise 4";
                break;
                
            default: mood = "surprise 5";
                break;
        }
        return mood;
    }
}
