/*
Написать программу нахождения количества квадратов со стороной a, 
размещённых на прямоугольнике со сторонами b и c, 
а также площадь незанятой части прямоугольника.
 */
package bsujavalab04b9;
/**
 * @author Aleksey Goravskiy, POIS1709v2 
 * 02.06.2018
 */
import java.util.*;

public class Lab04B9 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
        System.out.println("Enter the length of the square side in metres");        
        double a = sc.nextDouble();
        System.out.println("The square side a = " + a + " m");
        
        System.out.println("Enter the length of the first rectangle side "
                + "in metres");
        double b = sc.nextDouble();
        
        System.out.println("Enter the length of the second rectangle side "
                + "in metres");
        double c = sc.nextDouble();
        System.out.println("The rectangle sides b = " + b + " m" + " and" 
                + " c = " + c + " m");
        
        System.out.println("In the rectangle is placed " 
                + Logic.calculateSquareIn(a, b ,c) + " square(s)");
        
        System.out.print("Space of the rectangle without squares is "); 
        System.out.println((Logic.calculateRectangleSpace(b, c) 
                - (Logic.calculateSquareSpace(a) * Logic.calculateSquareIn(a, b ,c))) 
                + " m^2");
    }
    
}
