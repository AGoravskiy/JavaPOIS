/*
Разработайте программу, которая проверяет, 
что цифры четырёхзначного числа N образуют возрастающую 
последовательность (к примеру, число 1357 удовлетворяет условию, 
т.к. его цифры соответствуют следующему неравенству: 1 < 3 < 5 < 7, 
т.е. идут в порядке возрастания).
 */
package bsujavalab04a12;


import java.util.Scanner;
/**
 * @author Aleksey Goravskiy, POIS1709v2 
 * 02.06.2018
 */
public class Lab04A12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Введите четырёхзначное число");
        int n = sc.nextInt();
        
        System.out.println("n = " + n);
        
        boolean result = Logic.solve(n);
        
        System.out.println((n/1000) + "<" + (n/100 -(n/1000)*10) + " and " +
                    (n/100 -(n/1000)*10) + "<" + (n/10 -(n/100)*10) + " and " +
                    (n/10 -(n/100)*10) + "<" + (n -(n/10)*10));
        System.out.println("Result: " + result);
    }
    
}
