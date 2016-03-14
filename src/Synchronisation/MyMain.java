package Synchronisation;

public class MyMain {

	public static void main(String[] args) {
		Buffer buffer = new Buffer(10);
		Thread p1 = new Producer(buffer, 1);
		Thread p2 = new Producer(buffer, 2);

		p1.start();
		p2.start();
	}

}
