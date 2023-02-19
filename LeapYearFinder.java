import java.util.Scanner;

public class LeapYearFinder{	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		System.out.print(year);
		System.out.println(isLeapYear(year)?" is a leap year." : " is not a leap year.");	
	}
public static boolean isLeapYear(int year) {
    if (year % 4 != 0) {
        return false; 
    } else if (year % 100 != 0) {
        return true; 
    } else if (year % 400 != 0) {
        return false; 
    } else {
        return true; 
    }
}
}
