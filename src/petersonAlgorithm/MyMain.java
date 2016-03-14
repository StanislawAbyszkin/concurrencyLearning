package petersonAlgorithm;

public class MyMain {

	public static void main(String[] args) {
		Controller controller = new Controller();

		Thread p1 = new Process1(controller);
		Thread p2 = new Process2(controller);

		p1.start();
		p2.start();
	}

}
