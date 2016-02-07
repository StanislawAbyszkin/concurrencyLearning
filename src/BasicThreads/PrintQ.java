package BasicThreads;

public class PrintQ implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.println("Q");
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
