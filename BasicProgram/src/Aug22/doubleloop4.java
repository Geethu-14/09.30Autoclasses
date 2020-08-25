package Aug22;

public class doubleloop4 {
	public static void main(String[] args) {
		int count=1;
		for (int i=0; i<=4; i++) { //i=2
			for (int j=0;j<i;j++) { //0<2
				System.out.print(" "+count);
				count++;
		}
		System.out.println(" ");		
	}	
}
}
