package AutomationClass;

public class Day3 {
	
	public Day3() {
		this(13,12,11);
		System.out.println("Parent Default parameterized");
	}
	public Day3(int a) {
		this(20,21,22,24);
		System.out.println("Parent One parameterized");
	}
	public Day3(int a, int b) {
		this(40);
		System.out.println("Parent Two parameterized");
	}
	public Day3(int a, int c, int b) {
		System.out.println("Parent Three parameterized");
	}
	public Day3(int a, int c, int b, int d) {
		this();
		System.out.println("Parent Four parameterized");
	}
	public static void main(String[] args) {
		Day3 d3 = new Day3(20,21);
	}
}