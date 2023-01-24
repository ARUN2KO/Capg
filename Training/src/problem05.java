
import java.util.Scanner;

public class problem05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the dimesion of the array");
		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();
		int a[][] = new int[x][y];
		int b[][] = new int[x][y];
		System.out.println("Enter the elements of array 1");
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				a[i][j] = sc.nextInt();
			}
		}
		System.out.println("Enter the elements of array 2");
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		int c[][] = new int[x][y];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		System.out.println("summation matrix");
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

	}

}
