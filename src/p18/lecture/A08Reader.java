package p18.lecture;

import java.io.FileReader;
import java.io.Reader;

public class A08Reader {
	public static void main(String[] args) throws Exception {
		String file = "src/p18/lecture/A02InputStream.java";
		Reader reader = new FileReader(file);
		
//		int c = reader.read();
//		System.out.println(c);
//		System.out.println(reader.read());
		
		int i = 0;
		int count = 0;
		while((i=reader.read()) != -1) {
			System.out.print((char) i);
			count++;
		}
		System.out.println(count);
		
		reader.close();
	}
}
