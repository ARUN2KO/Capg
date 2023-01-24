
import java.util.Scanner;

public class problem08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter size");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter values");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter the value to search: ");
		int x;
		x = sc.nextInt();
		int t = 0;
		for (int i = 0; i < n; i++) {
			if (a[i] == x) {
				System.out.println("Element fount at the index " + i);
				t = 1;
				break;
			}
		}
		if (t == 0) {
			System.out.println("Element not present in the array");
		}

	}

}
