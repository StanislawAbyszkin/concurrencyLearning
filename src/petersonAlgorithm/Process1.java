package petersonAlgorithm;

public class Process1 extends Thread {

	Controller controller;

	public Process1(Controller ctrl) {
		this.controller = ctrl;
	}

	public void run() {

		while (true) {
			// non-critical section here
			controller.setWantP(true);
			controller.setLast(1);
			if (!controller.isWantQ() || controller.getLast() == 2) {
				System.out.println("Critical section of process 1 was accessed.");

				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				controller.setWantP(false);

			}
		}
	}
}
