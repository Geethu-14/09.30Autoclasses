package AutomationClass;

public class Day3Method {

	public void Day3Method() {
		//this(13,12,11);
		System.out.println("Parent Default parameterized Method");
	}
	public void Day3Method(int a) {
		//this(20,21,22,24);
		System.out.println("Parent One parameterized Method");
	}
	public void Day3Method(int a, int b) {
		//this(40);
		System.out.println("Parent Two parameterized Method");
	}
	public void Day3Method(int a, int c, int b) {
		System.out.println("Parent Three parameterized Method");
	}
	public void Day3Method(int a, int c, int b, int d) {
		System.out.println("Parent Four parameterized Method");
	}
	public static void main(String[] args) {
		Day3Method d3 = new Day3Method();
		//d3.Day3Method(10, 11);
		//d3.Day3Method(10);
		//d3.Day3Method(10, 11, 12, 13);
		//d3.Day3Method();
		//d3.Day3Method(10, 11, 12);
	}

}
