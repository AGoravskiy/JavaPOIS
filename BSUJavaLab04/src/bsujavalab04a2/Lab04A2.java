/*
Lab04A2
Разработайте программу, которая проверяет, 
что среди чисел А, В и С есть хотя бы одна пара совпадающих чисел. 
 */
package bsujavalab04a2;

import java.util.Scanner;
/**
 * @author Aleksey Goravskiy, POIS1709v2 
 * 02.06.2018
 */
public class Lab04A2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        boolean result = Logic.solve(a, b, c);
        
        System.out.println("a = " + a + "; b = " + b + "; c = " + c);
        System.out.println("Result: " + result);
    }
}
