package AutomationClass;
public class Student {
	int rollno, age;
	public void method1()
	{
		System.out.println("Welcome All!");
	}
	public void method2()
	{
		System.out.println("Automation is easy");
	}
	public static void main(String[] args) {
		Student value = new Student();
		value.method1();
		value.method2();
		value.rollno = 24;
		value.age = 5;
		System.out.println("Roll number of student= " +value.rollno);
		System.out.println("Age of student= " +value.age);
	}
}
