package api.stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BuffedIn {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("c:\\test.txt");
			
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			/*int i;
			while((i = bis.read()) != -1) {
				System.out.println(i);
			}*/
			
			while(bis.available() > 0) {
				System.out.print((char) bis.read());
			}
			
			fis.close();
		} catch (Exception e) {
			System.out.println("Exception : " + e);
		} 
	}
}
