
package bsujavalab04b8;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DayOfWeekCalculator {

    
    public static int calculateDayOfWeek(String dataIn){
        String dataFirstDayInYear = "01.01.2018";
        
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        
        Date dateOne = null;
        Date dateTwo = null;
        
        try {
            dateOne = format.parse(dataFirstDayInYear);
            dateTwo = format.parse(dataIn);
        } 
        catch (ParseException e) {
        }
        // Number of days between dates in milliseconds
        long difference = dateTwo.getTime() - dateOne.getTime();

        // Translating the number of days 
        // between dates from milliseconds to days
        int dayNumbOfYear =  (int)(difference / (24 * 60 * 60 * 1000));
        
        //geting a number of the day in a week
        //the first day in 2018 year is mondey
        int numbOfWeek;
        return numbOfWeek = dayNumbOfYear%7;
    }
}