package p18.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class A02InputStream {
	public static void main(String[] args) throws Exception {
		String fileName = "src/p18/lecture/A02InputStream.java";
		InputStream is = new FileInputStream(fileName);
		
//		int b1 = is.read();//파일의 첫번째 byte 읽음. package 의 p
//		int b2 = is.read();//그 다음 byte 읽음. package 의 a 
//		int b3 = is.read();//package 의 c
//		System.out.println(b1);
//		System.out.println(b2);
//		System.out.println(b3);
//		읽을것이 없다면 -1 리턴
		int b = 0;
		int cnt = 0;
		while((b = is.read())!= -1) {
			System.out.println(b);
			cnt++;
		}
		System.out.println(cnt);
		is.close();
	}
}
