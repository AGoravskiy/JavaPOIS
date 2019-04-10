/*
Напишите программу, которая организует диалог с пользователем и с помо-
щью соответствующих арифметических операций для натурального числа N
вычисляет число M, записываемое теми же цифрами, что и N, но в обратном
порядке (все незначащие нули в числе M не выводятся, например, если N =
2900, то M=92).
 */
package bsujavalab06t3;

/**
 *
 * @author User
 */
public class BSUJavaLab06T3 {

    public static void main(String[] args) {
        int contraryNumber;
        contraryNumber = ContraryNumder.colculateContraryNumber(UserInput
                .input("Enter the number: "));
        View.print("The number of the contrary " + contraryNumber);
    }
    
}
