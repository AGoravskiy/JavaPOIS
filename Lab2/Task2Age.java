import java.util.*;
import java.text.*;
import java.lang.*;

public class  Task2Age {
	public static void main(String[] args) {
		Date currentDate = new Date();
		Date birthDate = new Date();

		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy kk:mm:ss");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your date of birth: ");
		String date = scanner.nextLine();

		try {
			birthDate = dateFormat.parse(date);
		}
		catch (Exception e) {
			System.out.println(e);
		}

		long lifeTime = lifeTime (currentDate, birthDate);

    	System.out.println("Your date of birth: " + birthDate);
		System.out.println("Today: " + currentDate);
		System.out.println("You've lived " + lifeTimeInYears(lifeTime) + " years!");
		System.out.println("You've lived " + lifeTimeInDays(lifeTime) + " days!");
		System.out.println("You've lived " + lifeTimeInHours(lifeTime) + " hours!");
		System.out.println("You've lived " + lifeTimeInMinutes(lifeTime) + " minutes!");
		System.out.println("You've lived " + lifeTimeInSeconds(lifeTime) + " seconds!");

    }

    public static long lifeTime(Date today, Date birthday) {
		return today.getTime() - birthday.getTime();
	}

	public static long lifeTimeInYears(long lifeTime) {
		return lifeTime/1000/60/60/24/365;		
	}

	public static long lifeTimeInDays(long lifeTime) {
		return lifeTime/1000/60/60/24;		
	}

	public static long lifeTimeInHours(long lifeTime) {
		return lifeTime/1000/60/60;		
	}

	public static long lifeTimeInMinutes(long lifeTime) {
		return lifeTime/1000/60;		
	}

	public static long lifeTimeInSeconds(long lifeTime) {
		return lifeTime/1000;		
	}
}