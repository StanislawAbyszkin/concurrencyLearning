package petersonAlgorithm;

public class Process2 extends Thread {
	int last;
	boolean wantP, wantQ;

	public Process2(int setLast, boolean wantP, boolean wantQ) {
		this.last = setLast;
		this.wantP = wantP;
		this.wantQ = wantQ;
	}

	public void run() {

		// non-critical section here
		while (true) {
			wantQ = true;
			last = 2;
			if (wantP == false || last == 1) {
				System.out.println("Critical section of process 2 was accessed.");
				wantQ = false;
				
				try {
					Thread.sleep(150);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}