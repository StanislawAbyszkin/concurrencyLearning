package petersonAlgorithm;

public class Controller {
	public int getLast() {
		return last;
	}

	public void setLast(int last) {
		this.last = last;
	}

	public boolean isWantP() {
		return wantP;
	}

	public void setWantP(boolean wantP) {
		this.wantP = wantP;
	}

	public boolean isWantQ() {
		return wantQ;
	}

	public void setWantQ(boolean wantQ) {
		this.wantQ = wantQ;
	}

	volatile int last;
	volatile boolean wantP;
	volatile boolean wantQ;

	public Controller() {
		last = 1;
		wantP = false;
		wantQ = false;
	}
}
