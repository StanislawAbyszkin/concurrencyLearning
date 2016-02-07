package petersonAlgorithm;

public class Process1 extends Thread {
	int last;
	boolean wantP, wantQ;

	public Process1(int setLast, boolean wantP, boolean wantQ) {
		this.last = setLast;
		this.wantP = wantP;
		this.wantQ = wantQ;
	}

	public void run() {

		// non-critical section here
		while (true) {
			wantP = true;
			last = 1;
			if (wantQ == false || last == 2) {
				System.out.println("Critical section of process 1 was accessed.");
				wantP = false;
				
				try {
					Thread.sleep(150);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
