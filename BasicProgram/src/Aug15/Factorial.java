package Aug15;

import java.util.Scanner;

public class Factorial {
	private static Scanner s;
	
	public static void main(String[] args) {
		System.out.println("Enter a integer:" );
		s= new Scanner(System.in);
		
		int num = s.nextInt();
		int factorial = 1;
		for(int i=1; i<=num; i++)
		{
			factorial= factorial*i; 
		}
		System.out.println("Factorial of "+num +" = " +factorial);
	}
	
}
