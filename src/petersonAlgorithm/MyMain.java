package petersonAlgorithm;

public class MyMain {

	public static void main(String[] args) {
		int last = 1;
		boolean wantP = false;
		boolean wantQ = false;
		
		Thread p1 = new Process1(last, wantP, wantQ);
		Thread p2 = new Process2(last, wantP, wantQ);
		
		p1.start();
		p2.start();
	}

}
