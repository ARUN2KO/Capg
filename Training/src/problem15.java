import java.util.Scanner;

public class problem15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		if (x % 4 != 0) {
			System.out.println("Not a leap year");
		} else {
			if (x % 400 != 0 && x % 100 == 0) {
				System.out.println("Not a leap year");
			} else {
				System.out.println("Leap year");
			}
		}

	}

}
