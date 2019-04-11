package by.bsu.model.entity;

import java.util.List;

public class View {
    public static void print(String msg){
        System.out.println(msg);
    }
    
    public static void printList(List<Transport> list){
        
        for (Transport transport : list) {
            System.out.println(transport.toString());
        }
    }
}
