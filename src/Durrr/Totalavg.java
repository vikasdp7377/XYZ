package Durrr;
import java.util.*;
public class Totalavg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1,s2,s3,s4,s5,s6;
		System.out.println("Enter marks of 6 subject : ");
		Scanner sc = new Scanner(System.in);
		
		s1=sc.nextInt();
		s2=sc.nextInt();
		s3=sc.nextInt();
		s4=sc.nextInt();
		s5=sc.nextInt();
		s6=sc.nextInt();
		
		int sum = s1+s2+s3+s4+s5+s6;
		
		System.out.println("Addition of All subject : "+sum);
		
		float avg = sum/6;
		System.out.println("Average of All subject : "+avg);
		
		

	}

}
