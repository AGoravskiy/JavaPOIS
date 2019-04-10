package bsujavalab05t4;


import java.util.Scanner;

public class UserInputOpt1 {
    
    private static  Scanner sc = new Scanner(System.in);
    
    public static String input(String msg){
        System.out.println(msg);
        return sc.nextLine();
    }
}
