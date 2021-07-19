package class_programs;
import java.io.*;

class exception {
	
	void unchecked()  {
		
		int[] a= {3,2,4,2,1};
		
		try {
			
			System.out.println(a[9]);
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("Array out of bound exception was thrown inside unchecked method");
		}
		
	}
	
	void checked() {
		
		FileInputStream file;
		try {
			
			file = new FileInputStream("c:/desktop/java/no_file.txt"); 
			
		}
		
		catch(FileNotFoundException e) {
			
			System.out.println("File is not found in the system. Exception thrown inside checked method");
		}
		
	}
	
}
public class checked_unchecked {

	public static void main(String[] args) {

		System.out.println("This program is written by Ashik MR, 4NI19IS017, B section");
		
		exception obj=new exception();

		obj.unchecked();
		
		obj.checked();
		
		
		
	}

}
