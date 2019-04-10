/*
Натуральное число называют совершенным, если оно равно сумме всех своих
делителей, не считая только его самого (например, 28=1+2+3+7+14 – совер-
шенное число). Напишите программу, которая организует диалог с пользова-
телем и проверяет, является ли введённое натуральное число совершенным.
Для проверки работоспособности программы приводится список некоторых
совершенных чисел: 6, 28, 496, 8128.
 */
package bsujavalab06t2;

/**
 *
 * @author User
 * 
 */
public class BSUJavaLab05T2 {

    public static void main(String[] args) {
        
        int yesNo;
//        View.print("Do you want to know your mood?");
        yesNo = UserInput.input("Please write number: ");
                
        
        View.print(PerfectNumber.checkPerfectNumber(yesNo));
        
    }
    
}
