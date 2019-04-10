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
        //option 1
//        String result = null;
//        String letter = UserInputOpt1.input("Enter the letter to check: ");
//        View.print(VolwelOrConsonantOpt1.checkLetter(letter));
       
        //option 2 and 3
        char letter = UserInputOpt2_3_4.input("Enter the letter to check: ");
        ViewOpt2_3_4.print(VolwelOrConsonantOpt2.checkLetter(letter));
    }
    
}
