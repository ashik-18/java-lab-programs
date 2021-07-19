package class_programs;
import java.util.*;

public class factorial {

	public static void main(String[] args) {
		
		System.out.println("This program is written by\nAshik MR, 4NI19IS017, B section");
	
		int n;
		int factorial = 1;
		n = 10;
		
		while(n!=0) {
			factorial = factorial*n;
			n--;
		}
		
		System.out.println("factorial of 10 is "+ factorial);
	}
