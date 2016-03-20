package api.stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class BufferedInByte {
	public static void main(String[] args) throws Exception{
		byte[] buffer = new byte[1024];
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("c:\\test.txt"));
		
		int read = 0;
		
		while((read = bis.read(buffer)) != -1) {
			String chunk = new String(buffer, 0 , read);
			System.out.println(chunk);
		}
		
		bis.close();
	}
}
