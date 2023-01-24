import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class problem11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(3);
		a.add(5);
		a.add(7);
		a.add(9);
		Object[] b = a.toArray();
		System.out.println("Arraylist to array");
		for (Object i : b) {
			System.out.print(i + " ");
		}
		System.out.println();
		List c = Arrays.asList(b);
		System.out.println("Array to Arraylist");
		System.out.println(c);

	}

}