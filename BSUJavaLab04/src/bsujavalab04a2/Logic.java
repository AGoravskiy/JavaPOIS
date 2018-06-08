package bsujavalab04a2;

public class Logic { // класс Logic реализует бизнес-логику программы 
        public static boolean solve(double a, double b, double c){
            // 
            boolean answer;
            
            answer = a == b || a == c || b == c;  
            
            return answer;
    }
    
}
