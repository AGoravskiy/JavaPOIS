/*
В молодом возрасте дракон каждый год отращивает по три головы, но после
того, как ему исполнится 200 лет – только по две, а после 300 лет – лишь по
одной. Разработайте программу, которая высчитывала бы, сколько голов и
глаз у дракона, которому N лет?
 */
package bsujavalab05t1;

/**
 *
 * @author User
 */


public class BSUJavaLab05T1 {

    public static void main(String[] args) {
        View.print("Calculate the heads and eyes of the dragon!");
        
        int dragonAge = UserInput.input("Input age: ");
        
        String dragonHeadsAndEyes = 
                DragonHeadsAndEyes.calculateDragonHeadsAndEyes(dragonAge);
        
        View.print("\n" + dragonHeadsAndEyes + "\n");
    }
    
}
