package class_programs;

public class sum_of_arr {

	public static void main(String[] args) {

		System.out.println("This program is written by\nAshik MR, 4NI19IS017, B section");
		
		int[] arr= new int[5];
		arr[0]=32;
		arr[1]=99;
		arr[2]=69;
		arr[3]=84;
		arr[4]=3;
		
		int sum=0;
		
		for(int i=0;i<5;i++) {
			sum=sum+arr[i];
		}
		
		System.out.print("\nThe sum of elements in the array is " + sum);
	}

}
