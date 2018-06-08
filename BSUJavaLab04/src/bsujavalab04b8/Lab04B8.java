/*
Написать программу, которая определяет номер
дня недели для K-го дня любого месяца текущего года. 
Дни недели пронумерованы следующим образом: 0 – понедельник, 1 – вторник, …,
5 – суббота, 6 – воскресенье.

 */
package bsujavalab04b8;
/**
 * @author Aleksey Goravskiy, POIS1709v2 
 * 02.06.2018
 */
import java.util.*;

public class Lab04B8 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     
        
        System.out.println("Enter any date of this year "
                + "as dd.MM.yyyy ");
        
        String dataIn;
        dataIn = sc.next();  
    
    switch (DayOfWeekCalculator.calculateDayOfWeek(dataIn)) {
        case 0:
            System.out.println("It's mondey");
                 break;
        case 1:
            System.out.println("It's tuesday");
                 break;
        case 2:
            System.out.println("It's wednesday");
                 break;
        case 3:
            System.out.println("It's thursday");
                 break;
        case 4:
            System.out.println("It's friday");
                 break;
        case 5:
            System.out.println("It's saturday");
                 break;
        case 6:
            System.out.println("It's sunday");
                 break;
        default: System.out.println("Oops...");
                 break;
        }
    }
}
