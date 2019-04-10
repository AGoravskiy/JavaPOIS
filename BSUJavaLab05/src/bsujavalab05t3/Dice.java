
package bsujavalab05t3;

import java.lang.Math;

public class Dice {
    public static String throwDice(int numbDice){
        String result = "Cave-in: ";
        int caveIn[];
        int sumCaveIn = 0;
        caveIn = new int[numbDice];
        
        for(int i = 0; i < numbDice; i++ ){
            caveIn[i] = (int)(1+Math.random()*6);
        }
        
        for(int i = 0; i < numbDice; i++ ){
            result = result + caveIn[i] + " ";
            sumCaveIn = sumCaveIn + caveIn[i];
        }
        
        result = result + "sum of cave-in dices is " + sumCaveIn;
        
        return result;
    }
}
