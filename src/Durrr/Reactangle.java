package Durrr;

import java.util.Scanner;

public class Reactangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int l;
		int b;
		System.out.println("Enter value of l and b : ");
		Scanner sc = new Scanner(System.in);
		
		l=sc.nextInt();
		b=sc.nextInt();
		
		int area = l*b;
		System.out.println("Area of rectangle is : "+area);
		
		float perimeter = 2 * (l+b);
		System.out.println("perimeter of rectangle is : "+perimeter);

	}

}
