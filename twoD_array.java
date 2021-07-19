package class_programs;
import java.util.*;
public class twoD_array {

	public static void main(String[] args) {
		
		System.out.println("This program is written by\nAshik MR, 4NI19IS017, B section");

		int[][] arr = new int[][] {
            {3, 0, 6, 5, 0, 8, 4, 0, 0},
            {5, 2, 0, 0, 0, 0, 0, 0, 0},
            {0, 8, 7, 0, 0, 0, 0, 3, 1},
            {0, 0, 3, 0, 1, 0, 0, 8, 0},
            {9, 0, 0, 8, 6, 3, 0, 0, 5},
            {0, 5, 0, 0, 9, 0, 6, 0, 0},
            {1, 3, 0, 0, 0, 0, 2, 5, 0},
            {0, 0, 0, 0, 0, 0, 0, 7, 4},
            {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
		
		Scanner sc=new Scanner(System.in);
		
//		for(int i=0;i<2;i++) {
//			for(int j=0;j<2;j++) {
//				arr[i][j]=sc.nextInt();
//			}
//		}
		System.out.println("\nThe elements in the 2D array are");
		for (int i=0;i<9;i++) {
			
			for(int j=0;j<9;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			
			System.out.println();
		}
	}

}
