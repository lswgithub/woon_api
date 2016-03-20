package api.thread;

public class HelloRunable implements Runnable {

	@Override
	public void run() {
		System.out.println("Hello Runnable ...");
	}
	
	public static void main(String[] args) {
		new Thread(new HelloRunable()).start();
	}

}
