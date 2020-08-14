package AutomationClass;

public class Day4 extends Day3
{
	public Day4() {
		super(30,31);
		System.out.println("Child Default parameterized");
	}
	public Day4(int a) {
		this(20,21,22);
		System.out.println("Child One parameterized");
	}
	public Day4(int a, int b) {
		this(21);
		System.out.println("Child Two parameterized");
	}
	public Day4(int a, int c, int b) {
		this(30,31,32,34);
		System.out.println("Child Three parameterized");
	}
	public Day4(int a, int c, int b, int d) {
		this();
		System.out.println("Child Four parameterized");
	}
	public static void main(String[] args) {
		Day4 d4 = new Day4(11,12);
	}

}
