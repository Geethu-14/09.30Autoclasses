package Aug15;

import java.util.Scanner;

public class SwapwithoutVariable {
	private static Scanner s2;
	public static void main(String[] args) {
		System.out.println("Enter two integers: ");
		s2 = new Scanner(System.in);
		int a = s2.nextInt();
		int b = s2.nextInt();
		System.out.println("Before swapping: "+a +" " +b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swapping: "+a +" " +b);
	}
}
