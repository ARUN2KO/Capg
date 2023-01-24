import java.util.Scanner;

public class problem22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String x;
		x = sc.next();
		char y = sc.next().charAt(0);
		int m = 0;
		for (int i = 0; i < x.length(); i++) {
			if (x.charAt(i) == y) {
				m++;
			}
		}
		System.out.println("Frequency of character " + y + " = " + m);

	}

}