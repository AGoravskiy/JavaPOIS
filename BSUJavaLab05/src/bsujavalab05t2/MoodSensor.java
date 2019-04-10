
package bsujavalab05t2;


import java.lang.Math;

public class MoodSensor {
    public static String MS(){
        
        String mood = null;
        
        switch ((int) (Math.random()*3)){
            case 0: mood = ":-)";
                break;
            
            case 1: mood = ":-(";
                break;
                
            default: mood = ":-/";
                break;
        }
        return mood;
    }
}
