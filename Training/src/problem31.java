abstract class dog {
	abstract void legs();
}

class cat extends dog {
	void legs() {
		System.out.println("Dog has 4 legs");
	}
}

public class problem31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dog a = new cat();
		a.legs();

	}

}
