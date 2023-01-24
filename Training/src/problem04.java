
import java.util.Scanner;

public class problem04 {

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
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
		}
		System.out.println("Average=" + sum / n);

	}

}
