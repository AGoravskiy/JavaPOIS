/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsujavalab06t4;

import java.util.LinkedList;
import java.util.List;


class Calculations {
    public static int CalcSum(int num){
        int sum = 0;
        
        do{
            sum = sum + num % 10;
            num /= 10;
        }
        while(num > 0);
        
        return sum;
    }
    
    public static int CalcNumbertOfDigits(int num){
        int numOfDigit = 0;
        
        do{
            numOfDigit++;
            num /= 10;
        }
        while(num > 0);
        
        return numOfDigit;
    }
    
    public static int CalcNumberVariousDigits(int num){
        List<Integer> nums = new LinkedList<>();
        
        do{
            if (!nums.contains(num % 10)) {
                nums.add(num % 10);
            }
            num /= 10;
        }
        while(num > 0);
        
        return nums.size();
    }
    
    public static int CalcMaxDigit(int num){
        int maxDigit = 0;
        
        do{
            if (maxDigit < num % 10) {
                maxDigit = num % 10;
            }
            num /= 10;
        }
        while(num > 0);
        
        return maxDigit;
    }
    
    public static boolean CheckPalindrome(int num){
        int contraryNum = 0;
        int oldNum = num;
        
        do{
            contraryNum = contraryNum * 10 + oldNum % 10;
            oldNum /= 10;
        }
        while(oldNum > 0);
        
        return contraryNum == num;
    }
    
    public static boolean CheckSimple(int num){
        if (num % 2 == 0) {
            return num == 2;
        }
        
        int divisor = 3;
       
        while(divisor * divisor <= num && num % divisor != 0){
            divisor += 2;
        }
        
        return divisor * divisor > num;
    }
    
    public static void FindOllSimpleDivisors(int num){
        int divisor = 3;
        List<Integer> ollDivisors = new LinkedList<>();
        ollDivisors.add(1);
        while(divisor <= num){
            if(num % divisor == 0 && CheckSimple(divisor)){
                ollDivisors.add(divisor);
            }
            divisor +=2;
        }
        
        for (Integer div : ollDivisors) {
            System.out.print(div + " ");
        }
    }
    
    public static int CalcNod(int firstNum, int secondNum){
        if (secondNum < 0)
                secondNum = -secondNum;
            if (firstNum < 0)
                firstNum = -firstNum;
            while (secondNum > 0)
            {
                int temp = secondNum;
                secondNum = firstNum % secondNum;
                firstNum = temp;
            }
            return firstNum;
    }
    
    public static int CalcNok(int firstNum, int secondNum){
        return Math.abs(firstNum * secondNum) / CalcNod(firstNum, secondNum);
    }
}
