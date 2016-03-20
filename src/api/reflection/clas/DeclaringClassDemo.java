package api.reflection.clas;

import java.lang.reflect.Method;

public class DeclaringClassDemo {
	public static void main(String[] args) {
		Method[] method = String.class.getMethods();
		for (int i = 0; i < method.length; i++) {
			System.out.println(method[i] + 
					" declared by "
					+ method[i].getDeclaringClass());
		}
	}
}
