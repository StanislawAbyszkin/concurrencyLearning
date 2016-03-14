package bakeryAlgorithm;

public class Process2 extends Thread {

	public void run() {
		while (true) {
			// non-critical section
			MyMain.nq = MyMain.np + 1;
			while (MyMain.np != 0 && MyMain.nq >= MyMain.np) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			System.out.println(
					"Entered critical section of process 2.value of np = " + MyMain.np + ", nq = " + MyMain.nq);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			MyMain.nq = 0;
			System.out.println("Process2 set nq to 0");
			notifyAll();
		}
	}
}