package api.reflection.clas;

public class GetName {
	public static void main(String[] args) {
		System.out.println(GetName.class.getName());
		System.out.println(int.class.getName());
		System.out.println(GetName[].class.getName());
		System.out.println(GetName.class.getPackage());
	}
}
