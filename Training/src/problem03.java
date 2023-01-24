
import java.util.Scanner;

public class problem03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String x;
		x = sc.next();
		int i = 0, j = x.length() - 1, t = 0;
		while (i < j) {
			if (x.charAt(i) != x.charAt(j)) {
				System.out.println("Not a palindrome");
				t = 1;
				break;
			}
			i++;
			j--;
		}
		if (t == 0) {
			System.out.println("Palindrome");
		}

	}

}
