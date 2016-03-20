package api.thread;

public class BadThread {
	static volatile String  message;
	
	private static class CorrectorThread extends Thread{

		@Override
		public void run() {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				message = "mares do eat oats.";
			}
		}
		
		public static void main(String[] args) throws InterruptedException {
			new CorrectorThread().start();
			
			message = "Mares do not eat oats.";
			
			Thread.sleep(2000);
			
			System.out.println(message);
					
		}
		
	}
}
