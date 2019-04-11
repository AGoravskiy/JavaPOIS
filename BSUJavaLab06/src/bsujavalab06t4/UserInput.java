package bsujavalab06t4;

import java.util.Scanner;

public class UserInput {
    
    private static  Scanner sc = new Scanner(System.in);
    
    public static int input(String msg){
        System.out.println(msg);
        return sc.nextInt();
    }
    
    public static String inputChar(String msg){
        System.out.println(msg);
        return sc.toString();
    }
}
