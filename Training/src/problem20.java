import java.util.Scanner;

public class problem20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x, y;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		y = sc.nextInt();
		int t = x;
		x = y;
		y = t;
		System.out.println("x = " + x + " y = " + y);

	}

}