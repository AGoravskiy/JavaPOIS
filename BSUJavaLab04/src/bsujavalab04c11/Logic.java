package bsujavalab04c11;

import static java.lang.Math.*;


public class Logic {
    public static double calculateLineLenght(double x, double y, 
            double x1, double y1){
        return sqrt(pow((x-x1), 2) + pow((y-y1), 2));
    }
}
