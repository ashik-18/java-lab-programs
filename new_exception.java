package class_programs;

import java.util.*;

class Custom_exception extends Exception{
	
	public Custom_exception(String str) {
		
		super(str);
		
	}
}

public class new_exception {

	public static void main(String[] args) throws Custom_exception {
		
		Scanner sc= new Scanner(System.in);
		int age;
		
		System.out.println("Enter your age:");
		age=sc.nextInt();
		
		try {
			
			if(age<1) {
			
				throw new Custom_exception("Age not valid");
			
			}
			
			else {
				System.out.println("Age = "+age);
			}	
		}
		
		catch(Custom_exception e) {
			
			System.out.println("Exception is caught "+ e);
			
		}
	}
}	