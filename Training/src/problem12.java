import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class problem12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> a = new HashMap<Integer, String>();
		a.put(1, "Mukesh");
		a.put(2, "Ranjith");
		a.put(3, "Arun kumar");
		a.put(4, "Praneeth");
		System.out.println("Hash map");
		System.out.println(a);
		List<Integer> b = new ArrayList(a.keySet());
		List<String> c = new ArrayList(a.values());
		System.out.println("key values : " + b);
		System.out.println("Values : " + c);

	}

}
