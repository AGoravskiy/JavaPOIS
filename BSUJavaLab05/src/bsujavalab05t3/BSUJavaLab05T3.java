/*
Напишите программу, которая бы эмулировала игру «Dice» (игра в кости). Суть
игры заключается в броске двух шестигранных кубиков (костей) и подсчёта
общей суммы очков, которые выпали на первой и второй костей.
 */
package bsujavalab05t3;

/**
 *
 * @author User
 */
public class BSUJavaLab05T3 {

    public static void main(String[] args) {
        String result= null;
        result = Dice.throwDice(UserInput.input("How many dice do you want to throw?"));
        View.print(result);
    }
    
}
