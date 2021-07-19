package class_programs;
import java.util.*;

class random implements Runnable{
	
	public void run() {
		
		Random rand= new Random();
		try {
			
			for(int i=0;i<10;i++) {
				
				System.out.println(rand.nextInt(100));      //printing random numbers 
				Thread.sleep(1000);
			}
		}
		
		catch(InterruptedException e) {
			System.out.println("interruped "+ e);
		}
		
	} 
	
}

class square implements Runnable{
	
	
	int n;
	square(int n){
		this.n=n;
	}
	
	public void run() {
		
		System.out.println("square of " + n + " is " + n*n);
		
	}
	
}

class cube implements Runnable{
	
	int n;
	
	cube(int n){
		this.n=n;
	}
	public void run() {
		
		System.out.println("cube of "+ n + " is " + n*n*n);
		
	}

}



public class threads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("This program is written by\nAshik MR, 4NI19IS017, B section");

		random robj = new random();
		Thread t1 = new Thread(robj);
		t1.start();
		
		Thread t2 = new Thread(new square(10));
		t2.start();
		
		Thread t3 = new Thread(new cube(20));
		t3.start();
	}

}
