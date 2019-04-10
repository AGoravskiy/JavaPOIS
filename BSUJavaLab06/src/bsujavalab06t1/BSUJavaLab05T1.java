/*
Написать программу «Heads or Tails?» («Орёл или решка?»), которая бы «под-
брасывала» условно монету, к примеру, 1000 раз и сообщала, сколько раз вы-
пал орёл, а сколько – решка.
 */
package bsujavalab06t1;

/**
 *
 * @author User
 */


public class BSUJavaLab05T1 {

    public static void main(String[] args) {
        int numbThrows = UserInput.input("How many times to throw a coin? ");
        
        String statisticsThrows = 
                HeadsAndTails.calculateStatisticsThrows(numbThrows);
        
        View.print("\n" + statisticsThrows + "\n");
    }
    
}
