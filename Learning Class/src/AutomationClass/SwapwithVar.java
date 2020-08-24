package AutomationClass;

import java.util.Scanner;

public class SwapwithVar{
	private static Scanner s;

	public static void main(String[] args) {
		System.out.println("Enter two integers :");
		s = new Scanner(System.in);
		int x= s.nextInt();
		int y= s.nextInt();
		System.out.println("Before swapping numbers"+x +"" +y);
		int temp = x;
		x = y;
		y = temp;
		System.out.println("After swapping number"+x +"" +y);
	}
	
}
