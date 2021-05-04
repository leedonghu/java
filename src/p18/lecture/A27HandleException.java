package p18.lecture;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class A27HandleException {
	public static void main(String[] args) {
		String path = "src/p18/lecture/A27HandleException.java";
		
		//autoclosable 인터페이스를 구현하면 try앞의 괄호안에서 객체생성
		try (
				FileInputStream fis = new FileInputStream(path);
				FileOutputStream fos = new FileOutputStream(path);
				BufferedInputStream bis = new BufferedInputStream(fis);) {
			fis.close();
			bis.close();
			fos.write('a');
		} catch (Exception e) {
			
			e.printStackTrace();
		} 
	}
}
