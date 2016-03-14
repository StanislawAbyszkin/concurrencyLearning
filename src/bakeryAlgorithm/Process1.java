package bakeryAlgorithm;

public class Process1 extends Thread {

	public void run() {
		while (true) {
			// non-critical section
			MyMain.np = MyMain.nq + 1;
			
			while (MyMain.nq != 0 && MyMain.np > MyMain.nq) {
				try {
					
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			System.out.println(
					"Entered critical section of process 1. value of np = " + MyMain.np + ", nq = " + MyMain.nq);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			MyMain.np = 0;
			System.out.println("Process1 set np to 0");
			notifyAll();
		}
	}
}
