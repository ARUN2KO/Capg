import java.util.Scanner;

public class problem16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc = new Scanner(System.in);
		x = sc.nextInt();
		System.out.println("Multiplication table");
		for (int i = 1; i <= 10; i++) {
			System.out.println(x + " * " + i + " = " + x * i);
		}

	}

}
