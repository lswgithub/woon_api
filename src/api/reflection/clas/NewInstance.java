package api.reflection.clas;

public class NewInstance {
	public static void main(String[] args) {
		try {
			String pc = String.class.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
