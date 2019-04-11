/*
Разработать наиболее эффективные алгоритмы и написать код для решения следующих 
задач (каждый программист должен как минимум решать данного рода задачи): 
 найти сумму и количество цифр у заданного натурального числа; 
 найти количество различных цифр у заданного натурального числа; 
 найти наибольшую цифру натурального числа; 
 задано натуральное число, проверить, является ли оно палиндромом; 
 определить является ли заданное натуральное число простым; 
 найти все простые делители заданного натурального числа; 
 найти НОД и НОК двух натуральных чисел a и b. 
Предусмотреть возможность повторного выполнения всех разработанных программ 
без необходимости запускать их заново.
 */
package bsujavalab06t4;

import java.util.Scanner;
//import bsujavalab06t4.View;

public class BSUJavaLab06T4 {
    public static void main(String[] args) {
        int number;
        int sum;
        int numOfDigit;
        int numVariousDigits;
        int maxDigit;
        boolean palindrome;
        boolean simple;
        int firstNum;
        int secondNum;
        int nod;
        int nok;
        
        Scanner sc = new Scanner(System.in);
        
        do {
            number = UserInput.input("Enter the number: ");
        
            sum = Calculations.CalcSum(number);
            View.print("The sum of number: " + sum);
        
            numOfDigit = Calculations.CalcNumbertOfDigits(number);
            View.print("The number of digits: " + numOfDigit);
        
            numVariousDigits = Calculations.CalcNumberVariousDigits(number);
            View.print("The number of various digits: " + numVariousDigits);
        
            maxDigit = Calculations.CalcMaxDigit(number);
            View.print("The maximum of digits: " + maxDigit);
        
            palindrome = Calculations.CheckPalindrome(number);
            View.print("Is the number palidrome: " + palindrome);
        
            simple = Calculations.CheckSimple(number);
            View.print("Is the number simple: " + simple);
        
            View.print("Oll simple divisors:");
            Calculations.FindOllSimpleDivisors(number);
            View.print(" ");
            
            View.print("NOK & NOD for two natural numbers.");
            firstNum = UserInput.input("Enter first number: ");
            secondNum = UserInput.input("Enter second number: ");
            
            nod = Calculations.CalcNod(firstNum, secondNum);
            View.print("NOD: " + nod);
            
            nok = Calculations.CalcNok(firstNum, secondNum);
            View.print("NOK: " + nok);
            
            View.print("Repeat? (Enter 'y')");
        } while (sc.next().charAt(0) == 'y');
    }
}
