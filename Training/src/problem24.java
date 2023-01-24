import java.util.Scanner;

public class problem24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String x;
		x = sc.next();
		System.out.println("Reversed String = " + reverseString(x));

	}

	public static String reverseString(String x) {
		if (x.isEmpty()) {
			return x;
		}

		return reverseString(x.substring(1)) + x.charAt(0);

	}

}