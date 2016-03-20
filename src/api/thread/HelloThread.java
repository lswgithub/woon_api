package api.thread;

public class HelloThread extends Thread{
//Thread class itself implements Runnable.
	
	@Override
	public void run() {
		System.out.println("run Thread...");
	}
	
	public static void main(String[] args) {
		new HelloThread().start();
	}
}
