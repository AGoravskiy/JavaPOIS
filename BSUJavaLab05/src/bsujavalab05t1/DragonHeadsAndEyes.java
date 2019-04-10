/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsujavalab05t1;

/**
 *
 * @author User
 */
import java.util.*;
public class DragonHeadsAndEyes {
    public static String calculateDragonHeadsAndEyes(int dragonAge) {
        String dragonHeadsAndEyes = null;
        int dragonHeads = 0;
        int dragonEyes = 0;
        int i = 0;
        if (dragonAge < 200){
            for (i = 0; i < dragonAge; i++) {
                dragonHeads += 3;
            }
            dragonEyes = dragonHeads*2;
            dragonHeadsAndEyes = "Dragon at the age " + dragonAge + " year(s) has " 
                    + dragonHeads + " heads and " + dragonEyes + " eyes";
        }
        else if (dragonAge >= 200 && dragonAge < 300){
                for (i = 0; i < 200; i++) {
                    dragonHeads += 3;
                }
                for(i = 200; i < dragonAge; i++){
                    dragonHeads += 2; 
                }
                dragonEyes = dragonHeads*2;
                dragonHeadsAndEyes = "Dragon at the age " + dragonAge 
                        + " year(s) has " + dragonHeads + " heads and " 
                        + dragonEyes + " eyes";
            }
        else if (dragonAge >= 300){
                for (i = 0; i < 200; i++) {
                    dragonHeads += 3;
                }
                for(i = 200; i < 300; i++){
                    dragonHeads += 2; 
                } 
                for(i = 300; i < dragonAge; i++){
                    dragonHeads++;
                }
                dragonEyes = dragonHeads*2;
                dragonHeadsAndEyes = "Dragon at the age " + dragonAge 
                        + " year(s) has " + dragonHeads + " heads and " 
                        + dragonEyes + " eyes";    
        }
        
        
        return dragonHeadsAndEyes;
    }
}
