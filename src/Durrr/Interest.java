package Durrr;
import java.util.*;
public class Interest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p=1000;
		int n=2;
		double r = 0.05;
		int t=2;
		double first = 1+r/n;
		int sec= n*t;
		
		double A=p*Math.pow(first, sec);
		System.out.println("A : "+A);

	}

}
   