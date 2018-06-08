/*
Разработать программу вычисления расстояния между двумя автомобилями 
через T часов, если они удаляются друг от друга с соответствующими 
скоростями V1 км/ч и V2 км/ч, а первоначальное расстояние между ними S км.
 */
package bsujavalab04c19;
/**
 * @author Aleksey Goravskiy, POIS1709v2 
 * 03.06.2018
 */

import java.util.Scanner;

public class Lab04C19 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the distance S0 between cars in kilometers");
        double S0 = sc.nextDouble(); 
        System.out.println("Enter the speed V1 of the first car "
                + "in kilometers per hour");
        double V1 = sc.nextDouble();
        System.out.println("Enter the speed V2 of the second car "
                + "in kilometers per hour");
        double V2 = sc.nextDouble();
        System.out.println("Enter the time T of cars on the road in hours");
        double T = sc.nextDouble();
        
        System.out.println("S0 = " + S0 + ", V1 = "  + V1 
                + ", V2 = "  + V2 + ", T = "  + T);
        
        System.out.println("Calculate the distance S between cars "
                + "after T hours on the road");
        System.out.println("S = " 
                + Logic.calculateDistanceBetweenCars(S0, V1, V2, T) + "  km");
    }
    
}
