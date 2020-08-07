package AutomationClass;

public class Arthimetic1 {
	
	public int sum(int a, int b)
	{
		int c = a+b;
		System.out.println("Sum of a & b= " +c);
		return c;
	}
	public int sub(int a, int b)
	{
		int d = a-b;
		System.out.println("Sub of a & b= " +d);
		return d;
	}
	public int mul(int a, int b)
	{
		int y = a*b;
		System.out.println("Mul of a & b= " +y);
		return y;
	}
	public void div(int a, int b)
	{
		int z = a/b;
		System.out.println("Div of a & b= " +z);
		
	}
	public static void main(String[] args) {
		Arthimetic1 obj2=new Arthimetic1();
		int Sub_Result= obj2.sub(10, 2);
		int Sum1_Result= obj2.sum(Sub_Result, 2);
		int Sub1_Result= obj2.sub(Sum1_Result,2);
		int Mul_Result= obj2.mul(Sub1_Result, 2);
		obj2.div(Mul_Result, 2);
	}
}
