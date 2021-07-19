package class_programs;

interface testing{
	
	void square(int n);
	
}

class arithmetic implements testing{
	
	public void square(int n) {
		
		System.out.println("The square of " + n + " is " + n*n);
	}
}


public class interfaces {

	public static void main(String[] args) {
		
		System.out.println("This program is written by\nAshik MR, 4NI19IS017, B section");

		testing obj = new arithmetic();
		
		obj.square(32);
		
	}

}
