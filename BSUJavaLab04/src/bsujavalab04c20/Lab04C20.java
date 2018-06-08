/*
Разработать программу решения линейного уравнение, 
заданного в виде Ax + B = 0 (коэффициент A не равен 0). 
 */
package bsujavalab04c20;
/**
 * @author Aleksey Goravskiy, POIS1709v2 
 * 03.06.2018
 */

import java.util.Scanner;

public class Lab04C20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("The solution of the equation A*x + B = 0, "
                + "where a A and B are variable and A != 0");
        System.out.println("Enter two variables A and B");
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        
        System.out.println("The equation has the form:");
        System.out.println(A + "*x + " + B + " = 0");
        
        System.out.println("The root of the equationis: ");
        System.out.println("x = " + Logic.calculeteEquationRoot(A, B));
    }
    
}
