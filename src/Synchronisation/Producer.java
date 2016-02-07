package Synchronisation;

public class Producer extends Thread {
	int value;
	Buffer buffer;
	
	public Producer(Buffer toUse, int toProduce)
	{
		value = toProduce;
		buffer = toUse;
	}
	
	public void run()
	{
		for(int i = 0; i < 5; i++)
		{
			buffer.add(value);
			buffer.printBuffer();
			
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
