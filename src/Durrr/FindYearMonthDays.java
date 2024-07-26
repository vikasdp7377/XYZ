package Durrr;
import java.util.*;
public class FindYearMonthDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int days;
		System.out.println("Enter value of Days ROCKET= : ");
		Scanner sc = new Scanner(System.in);
		days = sc.nextInt();
		
		int year = days/365;
		System.out.println("Year : "+year);
		int rem = days%365;
		
		int month = rem/30;
		System.out.println("month : "+month);
		int rem2 = rem%30;
		
		int week=rem2/7;
		System.out.println("Weeks : "+week);
		
		int day = rem2%7;
		System.out.println("Days : "+day );

	}

}
