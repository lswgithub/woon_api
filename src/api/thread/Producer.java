package api.thread;

import java.util.Random;

public class Producer implements Runnable{
	private Drop drop;
	
	public Producer(Drop drop) {
		this.drop = drop;
	}

	@Override
	public void run() {
		String importantInfo[] = {"this"," is"," very"," important"," infomation."};
		
		Random random = new Random();
		
		for (int i = 0; i < importantInfo.length; i++) {
			drop.put(importantInfo[i]);
			try {
				Thread.sleep(random.nextInt(5000));
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		
		drop.put("DONE");
	}
	
	
}
