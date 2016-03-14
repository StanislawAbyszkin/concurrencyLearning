package bakeryAlgorithm;


public class MyMain {
	volatile static int np = 0;
	volatile static int nq = 0;
	
	public static void main(String[] args) {

		Thread p1 = new Process1();
		Thread p2 = new Process2();
		
		p1.start();
		p2.start();
		
		while (true) {
			System.out.println("np = " + np + ", nq = " + nq);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
