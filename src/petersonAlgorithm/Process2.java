package petersonAlgorithm;

public class Process2 extends Thread {
	Controller controller;

	public Process2(Controller ctrl) {
		this.controller = ctrl;
	}

	public void run() {
		while (true) {
			// non-critical section here

			controller.setWantQ(true);
			controller.setLast(2);

			if (!controller.isWantP() || controller.getLast() == 1) {
				System.out.println("Critical section of process 2 was accessed.");
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				controller.setWantQ(false);
			}
		}
	}
}