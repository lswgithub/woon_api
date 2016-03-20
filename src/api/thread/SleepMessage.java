package api.thread;

public class SleepMessage {

	public static void main(String[] args) {
		String messages[] = {"it is"," so"," very"," fun",", really"};
		
		for(String message : messages) {
			//Pause for 4seconds
			try {
				if(Thread.interrupted()) {
					throw new InterruptedException();
				}
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				//e.printStackTrace();
				return;
			} finally {
				System.out.print(message);
			}
		}
	}
}
