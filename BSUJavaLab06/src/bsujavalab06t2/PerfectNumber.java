
package bsujavalab06t2;


import java.lang.Math;

public class PerfectNumber {
    public static String checkPerfectNumber(int number){
        
        String result;
        int numberTemp = 0;
        for (int i = 1; i < number; i++){
            if (number%i == 0){
                numberTemp = numberTemp + i;
            }
        }
        if (number == numberTemp){
            result = number + " is the perfect number!";
        }
        else{
            result = number + " is not the perfect number!"; 
        }
        
        return result;
    }
}
