
package bsujavalab04a12;

public class Logic { // класс Logic реализует бизнес-логику программы 
        public static boolean solve(int n){
            // 
            boolean answer;
            
            answer = n/1000 < n/100 -(n/1000)*10 && 
                    n/100 -(n/1000)*10 < n/10 -(n/100)*10 &&
                    n/10 -(n/100)*10 < n -(n/10)*10;  
            
            return answer;
    }
    
}
