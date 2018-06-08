package bsujavalab04c12;

import static java.lang.Math.*;

public class Logic {
    public static double calculateVariableC(double a, double b){
        return sqrt(pow(a, 2) + pow(b, 2));
    }
    
    public static double calculateChangedVariableValue(double VariableC, 
            double ChangedVariable) {
        return sqrt(pow(VariableC, 2) - pow(ChangedVariable, 2));
    }
    
}
