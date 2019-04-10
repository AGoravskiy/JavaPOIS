/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsujavalab06t1;

/**
 *
 * @author User
 */
import java.lang.Math;
public class HeadsAndTails {
    public static String calculateStatisticsThrows(int numbThrows) {
        String statisticsThrows = null;
        int heads = 0;
        int tails = 0;
        int i = 0;
        
        while (i < numbThrows) {
            if((int)(Math.random()*2) == 1){
                heads++;
            }
            else{
                tails++;
            };
            i++;
        }
        statisticsThrows = "heads = " + heads + ", tails = " + tails;  
        
        return statisticsThrows;
    }
}
