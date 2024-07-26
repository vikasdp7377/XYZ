package Durrr;
import java.util.*;
public class AreaOfSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int side;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of Side : ");
		side = sc.nextInt();
		
		int area = side*side;
		
		System.out.println("Area of Square : "+area);

	}

}
