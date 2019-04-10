package bsujavalab05t4;


import java.util.Scanner;

public class UserInputOpt2_3_4 {
    
    private static  Scanner sc = new Scanner(System.in);
    
    public static char input(String msg){
        System.out.println(msg);
        return sc.next().charAt(0);
    }
}
