package BasicThreads;

public class MyMain {

	public static void main(String[] args) {
		Thread p = new PrintP();
		Thread q = new Thread(new PrintQ());
		p.start();
		q.start();
		try {
			q.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < 200; i++) {
			System.out.print("R");
		}
	}

}
