//한글
package p18.lecture;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;

public class A09Reader {
	public static void main(String[] args) throws Exception {
		String file = "src/p18/lecture/A09Reader.java";
		InputStream is = new FileInputStream(file);
		
		System.out.println((char) is.read());
		System.out.println((char) is.read());
		System.out.println((char) is.read());//'한'이라는 글자를 한 바이트로 표현하지 못함
		System.out.println((char) is.read());
		
		
		is.close();
		
		//문자단위
		Reader rd = new FileReader(file);
		
		System.out.println((char) rd.read());
		System.out.println((char) rd.read());
		System.out.println((char) rd.read());//문자단위로 읽기 때문에 '한'이라는 글자가 나옴
		System.out.println((char) rd.read());
		
		rd.close();
		
	}
}
