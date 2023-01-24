
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class problem13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> a=new HashMap<Integer,String>();
		a.put(1,"ArunKuamr");
		a.put(2,"Ranjith Kumar");
		a.put(3,"Mukesh kumar");
		a.put(4,"Praneeth Varma");
		LinkedHashMap<Integer,String> b=new LinkedHashMap<Integer,String>();
		a.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEachOrdered(x->b.put(x.getKey(),x.getValue()));
		System.out.println("Sorted hash map");
		System.out.println(b);

	}

}
