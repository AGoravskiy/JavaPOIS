package bsujavalab05t5;

import java.util.Scanner;

public class UserInput {
    
    private static  Scanner sc = new Scanner(System.in);
    
    public static int input(String msg){
        System.out.println(msg);
        return sc.nextInt();
    }
}