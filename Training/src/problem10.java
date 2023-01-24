
import java.util.ArrayList;
import java.util.List;

public class problem10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> x = new ArrayList<String>();
		List<String> y = new ArrayList<String>();
		x.add("ab");
		x.add("cd");
		y.add("1");
		y.add("2");
		List<String> xy = new ArrayList<String>();
		xy.addAll(x);
		xy.addAll(y);
		System.out.println("joined list : " + xy);

	}

}
