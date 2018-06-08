/*
Разработайте программу нахождения площади и периметра треугольника, 
который задан на координатной плоскости тремя вершинами: 
(x1, y1), (x2, y2), (x3, y3).
 */
package bsujavalab04c11;

import java.util.Scanner;

/**
 * @author Aleksey Goravskiy, POIS1709v2 
 * 02.06.2018
 */

import static java.lang.Math.*;

public class Lab04C11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                
        System.out.println("Enter the first vertex of the triangle");        
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.println("Enter the second vertex of the triangle");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        
        System.out.println("Enter the third vertex of the triangle");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        System.out.println("(x1, y1) = " + "(" + x1 + ", " + y1 + ")");
        System.out.println("(x2, y2) = " + "(" + x2 + ", " + y2 + ")");
        System.out.println("(x3, y3) = " + "(" + x3 + ", " + y3 + ")");
        
        //betwen (x1, y1) and (x2, y2)
        double Segment1 = Logic.calculateLineLenght(x1, y1, x2, y2);
        
        //betwen (x2, y2) and (x3, y3)
        double Segment2 = Logic.calculateLineLenght(x2, y2, x3, y3);
        
        //betwen (x3, y3) and (x1, y1)
        double Segment3 = Logic.calculateLineLenght(x3, y3, x1, y1);
        
        double Perimetr = Segment1 + Segment2 + Segment3;
        System.out.println("Perimetr of the triangle P = " + Perimetr);
        
        // using Heron's formula to find a space of the triangle
        // calculating semiperimeter
        System.out.print("Semiperimetr of the triangle is P/2 = ");
        System.out.println(Perimetr/2);
        
        double Space = sqrt(Perimetr/2*(Perimetr/2-Segment1)
                *(Perimetr/2-Segment2)*(Perimetr/2-Segment3));
        System.out.print("Space of the triangle S = " + Space);
        
    }
}