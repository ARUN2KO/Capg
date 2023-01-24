import java.util.Scanner;

public class problem02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x;
		System.out.println("Enter the number of terms to print fibonacci series");
		x = sc.nextInt();
		int a = 0, b = 1, c;
		for (int i = 0; i < x; i++) {
			c = a + b;
			System.out.println(a);
			a = b;
			b = c;

		}

	}

}
