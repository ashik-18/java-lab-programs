package class_programs;

public class prime_numbers {

	public static void main(String[] args) {
		
		System.out.println("This program is written by\nAshik MR, 4NI19IS017, B section");
		
		int flag=1;
		System.out.println("\nThe prime numbers in the range 1 to 100 are ");
		
		for(int n=1;n<=100;n++) {
			flag=1;
			for(int i=2;i<=n/2;i++) {
				
				if(n%i==0) {
					flag=0;
					break;
				}
				
			}
			
			if(flag==1) {
				if(n!=1) {
					System.out.print(n + " ");
				}
			}
		}
	}

}
