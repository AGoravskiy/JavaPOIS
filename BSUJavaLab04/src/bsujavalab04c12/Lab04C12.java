/*
Разработайте программу, которая меняет местами содержимое 
двух переменных a и b, не используя для этого дополнительные переменные.  
 */
package bsujavalab04c12;

/**
 * @author Aleksey Goravskiy, POIS1709v2 
 * 03.06.2018
 */

import java.util.Scanner;

public class Lab04C12 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter two variables a and b");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        
        System.out.println("a = " + a + ", b = "  + b);
        
        System.out.println("Changing the values of variables");
        a = Logic.calculateVariableC(a, b);
        b = Logic.calculateChangedVariableValue(a, b);
        a = Logic.calculateChangedVariableValue(a, b);
        
        System.out.println("a = " + a + ", b = " + b);
    }
    
}
