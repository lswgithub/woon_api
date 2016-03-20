package api.thread;

public class ThreadInterference {
	private int c = 0;
	
	
	public void increment() {
		c++;
	}
	
	public void decrement() {
		c--;
	}
	
	public int getValue() {
		return c;
	}
	
	public static void runIncrementValue(){
		new Thread(new IncrementValue()).run();
	}

	public static void runDecrementValue(){
		new Thread(new DecrementValue()).run();
	}
	
	private static class IncrementValue implements Runnable {
		@Override
		public void run() {
			ThreadInterference t1 = new ThreadInterference();
			t1.increment();
			System.out.println(t1.getValue());
		}
	}

	private static class DecrementValue implements Runnable {
		@Override
		public void run() {
			ThreadInterference t1 = new ThreadInterference();
			t1.decrement();
			System.out.println(t1.getValue());
		}
	}
	
	public static void main(String[] args) {
		ThreadInterference t1 = new ThreadInterference();
		synchronized (t1) {
			ThreadInterference.runIncrementValue();
			ThreadInterference.runDecrementValue();
		}
	}
	
}
