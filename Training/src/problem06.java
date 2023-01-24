
import java.util.Scanner;

public class problem06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x, y;
		System.out.println("Enter array 1 size");
		x = sc.nextInt();
		System.out.println("Enter elements");
		int a[] = new int[x];
		for (int i = 0; i < x; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter array 2 size");
		y = sc.nextInt();
		System.out.println("Enter elements");
		int b[] = new int[y];
		for (int i = 0; i < y; i++) {
			b[i] = sc.nextInt();
		}

		int c[] = new int[x + y];
		int i;
		for (i = 0; i < x; i++) {
			c[i] = a[i];
		}
		for (int j = 0; j < y; j++) {
			c[i++] = b[j];
		}
		for (int j = 0; j < x + y; j++) {
			System.out.print(c[j] + " ");
		}

	}

}
