
import java.util.Scanner;

public class problem01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x, t = 1;
		x = sc.nextInt();
		for (int i = 2; i < x / 2; i++) {
			if (x % i == 0) {
				t = 0;
				System.out.println("Not a prime");
				break;
			}
		}
		if (t == 1) {
			System.out.println("Prime");
		}

	}

}
