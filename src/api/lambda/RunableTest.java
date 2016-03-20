package api.lambda;

public class RunableTest {
	public static void main(String[] args) {
		System.out.println("===RunnableTest===");
		
		//Anonymous Runable
		
		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				System.out.println("Hello world one!");
			}
			
		};
		
		//Lanbda Runnable
		//Runnable r2 = () -> System.out.println("Hello world two!");
		
		r1.run();
	}
}
