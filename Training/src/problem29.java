class parent2 {
	void cultural() {
		System.out.println("I can sing");
	}
}

class child2 extends parent2 {
	void cultural() {
		System.out.println("I can sing and dance");
	}
}

public class problem29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent2 a = new child2();
		a.cultural();

	}

}