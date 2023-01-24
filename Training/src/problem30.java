class parent3 {
	void cultural() {
		System.out.println("Parent : I can sing");
	}
}

class child3 extends parent3 {
	void cultural() {
		super.cultural();
		System.out.println("Child : I can sing and dance");
	}
}

public class problem30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parent3 a = new child3();
		a.cultural();

	}

}
