package AutomationClass;

public class Day4Method extends Day3Method
{
	public void Day4Method() {
		super.Day3Method(55);
		super.Day3Method();
		super.Day3Method(11, 12);
		super.Day3Method(10, 11, 12);
		super.Day3Method(10,11,21,12);
		System.out.println("Child Default parameterized Method");
		this.Day4Method(12);
	}
	public void Day4Method(int a) {
		this.Day4Method(11,12);
		System.out.println("Child One parameterized Method");
	}
	public void Day4Method(int a, int b) {
		this.Day4Method(10,11,12,13);
		System.out.println("Child Two parameterized Method");
	}
	public void Day4Method(int a, int c, int b) {

		System.out.println("Child Three parameterized Method");
	}
	public void Day4Method(int a, int c, int b, int d) {
		this.Day4Method(10, 11,12);
		System.out.println("Child Four parameterized Method");
	}
	public static void main(String[] args) {
		Day4Method d4 = new Day4Method();
		d4.Day4Method();
	}

}
