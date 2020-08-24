package Aug15;
import java.util.Scanner;
public class Armstrong {

		private static Scanner s;
		
		public static void main(String[] args) {
			int reverse = 0,reminder;
			System.out.println("Orginal Number is ");
			s = new Scanner(System.in);
			int n=s.nextInt();
			int orginalnum =n;
			while(n>0) {
				reminder= n %10;
				reverse= (reverse)+reminder*reminder*reminder;
				n= n/10;
			}
			if(orginalnum==reverse) 
				System.out.println(orginalnum+ " is a Armstrong");
			else 
				System.out.println(orginalnum+ " is not a Armstrong");
		}
		
}

