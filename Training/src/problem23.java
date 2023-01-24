import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class problem23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		String x;
		Scanner sc = new Scanner(System.in);
		x = sc.next();
		try {
			Date y = formatter.parse(x);
			System.out.println(y);
		} catch (ParseException e) {
			e.printStackTrace();
		}

	}

}