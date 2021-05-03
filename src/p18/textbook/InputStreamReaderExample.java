package p18.textbook;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {
	public static void main(String[] args) throws Exception {
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);//다른 stream을 감싸는 stream 존재
		
		int readCharNo;
		char[] cbuf = new char[100];
		while((readCharNo = reader.read(cbuf)) != -1) {
			String data = new String(cbuf, 0, readCharNo);
			
			System.out.println(data);
		}
		reader.close();
	}
}
