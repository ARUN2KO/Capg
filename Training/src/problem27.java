class parent1 {
	void playing() {
		System.out.println("I am playing cricket");
	}
}

class child1 extends parent1 {

	void drinking() {
		System.out.println("I am drinking juice");
	}
}

public class problem27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent1 a = new child1();

		a.playing();
		// a.drinking();

	}

}