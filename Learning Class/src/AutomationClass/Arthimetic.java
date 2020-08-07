package AutomationClass;

public class Arthimetic {
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
		Arthimetic obj=new Arthimetic();
		int Sum1_Result= obj.sum(10, 2);
		int Sum2_Reult= obj.sum(Sum1_Result,2);
		int Sub_Reult= obj.sub(Sum2_Reult, 2);
		int Mul_Result= obj.mul(Sub_Reult, 2);
		obj.div(Mul_Result, 2);
	
	}
}
