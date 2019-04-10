/*
Напишите программу «Mood Sensor» (эмулировать датчика настроения), кото-
рая «залазит» в душу пользователя и определяет его настроение в текущий
момент времени. Приложение будет генерировать случайное число, в зави-
симости от значения которого на экран выводится одно из псевдографических
«лиц», которое и будет отображать настроение пользователя.
 */
package bsujavalab05t2;

/**
 *
 * @author User
 * 
 */
public class BSUJavaLab05T2 {

    public static void main(String[] args) {
        
        int yesNo = 0;
        View.print("Do you want to know your mood?");
        yesNo = UserInput.input("Please write 1 - yes or 2 - no: ");
                
        if (yesNo == 1){
            View.print(MoodSensor.MS());
        }
        else{
            View.print("Good luck!");
        }
    }
    
}
