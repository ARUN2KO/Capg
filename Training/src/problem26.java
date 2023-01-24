class parent {
	void playing() {
		System.out.println("I am playing cricket");
	}
}

class child extends parent {

	void drinking() {
		System.out.println("I am drinking juice");
	}
}

public class problem26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child a = new child();

		a.playing();
		a.drinking();

	}

}