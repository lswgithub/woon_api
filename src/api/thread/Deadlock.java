package api.thread;

public class Deadlock {

	static class Friend{
		private final String name;
		
		public Friend (String name) {
			this.name = name;
		}
		
		public String getName() {
			return name;
		}
		
		public synchronized void bow(Friend bower) {
			System.out.format("%s: %s has bowed to me ! %n", this.name, bower.getName());
			
			bower.bowBack(this);
		}
		
		public synchronized void bowBack(Friend bower) {
			System.out.format("%s: %s has bowed back to me ! %n", this.name, bower.getName());
			
		}
	}
	
	public static void main(String[] args) {
		final Friend alphonse = new Friend("Alphonse");
		final Friend gaston = new Friend("gaston");

		int idx = 100;
		
		for (int i = 0; i < idx; i++) {
			new Thread(new Runnable() {
				public void run() {
					alphonse.bow(gaston);
				}
			}).start();
	
			new Thread(new Runnable() {
				public void run() {
					alphonse.bow(alphonse);
				}
			}).start();
			
			System.out.println("finish thread index : " + i);
		}
		
		
	}
}
