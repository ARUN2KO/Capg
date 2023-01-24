interface bat {
	public void bat();
}

interface ball {
	public void ball();
}

class game implements bat, ball {
	public void bat() {
		System.out.println("I am having bat");
	}

	public void ball() {
		System.out.println("I am having ball");
	}
}

public class problem28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		game a = new game();
		a.bat();
		a.ball();

	}

}
