package Aug15;

import java.util.Scanner;

public class Prime {

	private static Scanner s;

	public static void main(String[] args) {
		System.out.println("Enter any number : ");
		s = new Scanner(System.in);
		int num =  s.nextInt();
		boolean flag = false;
			for(int i=2; i<= num/2 ; i++) {
				if (num%i == 0) {
					flag =true;
					break;
				}
			}
			if (!flag)
				System.out.println(num+ " is a Prime number");
			else 
				System.out.println(num+ " is not a Prime number");
	}
}
