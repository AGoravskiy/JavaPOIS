/*
Напишите программу, которая бы определяла, является ли введённая буква
гласной или согласной (постарайтесь сделать минимум четырьмя способами,
разрешается и больше).
 */
package bsujavalab05t4;


/**
 *
 * @author User
 */
public class BSUJavaLab05T3 {

    public static void main(String[] args) {
        
//        String result = null;
        String letter = UserInput.input("Enter the letter to check: ");
        View.print(VolwelOrConsonantOpt1.checkLetter(letter));
    }
    
}
