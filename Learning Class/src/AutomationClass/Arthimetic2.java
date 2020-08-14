package AutomationClass;

import java.util.Scanner;

public class Arthimetic2 {
	
	private static Scanner s;
	public int sum(int a, int b) {
		
		int c = a+b;
		return c;
	}
	public int sub(int a, int b) {
		
		int d = a-b;
		return d;
	}
	public int mul(int a, int b) {
		int x = a*b;
		return x;	
	}
	public int div(int a, int b) {
		
		int y = a/b;
		return y;
	}
	public static void main(String[] args) {
		System.out.println("\nEnter two values to perform addition:");
		s = new Scanner(System.in);
		int x1= s.nextInt();
		int x2= s.nextInt();
		Arthimetic2 obj1 = new Arthimetic2();
		int Sum_Result = obj1.sum(x1,x2);
		System.out.println("Result:"+Sum_Result);
		System.out.println("Now enter one value to perform subtraction:");
		int x3 = s.nextInt();
		int Sub_result = obj1.sub(Sum_Result, x3);
		System.out.println("Result:"+Sub_result);
		System.out.println("Now enter one value to perform multiplication:\n");
		int x4 = s.nextInt();
		int mul_result = obj1.mul(Sub_result, x4);
		System.out.println("Result:"+mul_result);
		System.out.println("Now enter one value to perform addition:\n");
		int x5 = s.nextInt();
		int add_result = obj1.sum(mul_result, x5);
		System.out.println("Result:"+add_result);
		System.out.println("Now enter one value to perform divison:\n");
		int x6 = s.nextInt();
		int div_result = obj1.div(add_result, x6);
		System.out.println("Result:"+div_result);
		System.out.println("Final output for operation ((((x1+x2)-x3)*x4)+x5/x6):" +div_result);
	}
}