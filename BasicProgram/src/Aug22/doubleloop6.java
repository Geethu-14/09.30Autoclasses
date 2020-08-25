package Aug22;

public class doubleloop6 {
	public static void main(String[] args) {
		for (int i=0; i<5; i++) { 
			for (int j=5-i;j>=1;j--) {
				System.out.print(" ");
			}
			for (int j=0;j<=i;j++) {
				if (j==i) {
					System.out.print("* ");	
				}
				else{
					System.out.print("**");	
				}
		}
			System.out.println();			
}			
}
}
