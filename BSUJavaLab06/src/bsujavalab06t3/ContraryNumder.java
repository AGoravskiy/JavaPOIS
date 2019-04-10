
package bsujavalab06t3;

import java.lang.Math;

public class ContraryNumder {
    public static int colculateContraryNumber(int number){
        int contraryNumber = 0;
        int numberOrder = 0;
        int numeral;
        
        do{
            numeral = number % 10;
            number = number / 10;
            contraryNumber = contraryNumber * (int)Math.pow(10, numberOrder) 
                    + numeral;
            numberOrder++;
        }
        while (number != 0);
        return contraryNumber;
    }
}
