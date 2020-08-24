package Aug15;

import java.util.Scanner;

public class Mulitplication { 

	private static Scanner s;
	public static void main(String[] args) {
		System.out.println("Multiplication Table of: ");
		s= new Scanner(System.in);
		int  num = s.nextInt();
		for (int i=1; i <=10; ++i) {
			int x=num*i;
			System.out.println(+num +" * " +i +" = " +x);
			
		}
		
	}
}
