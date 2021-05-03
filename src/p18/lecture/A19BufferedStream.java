package p18.lecture;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class A19BufferedStream {
	public static void main(String[] args) throws Exception {
		String file = "src/p18/lecture/A19BufferedStream.java";
		FileInputStream fis = new FileInputStream(file);
		
		int b = 0;
		long start = System.nanoTime();
		
		while((b = fis.read()) != -1 ) {
			
		}
		long end = System.nanoTime();
		System.out.println(end - start);
		
		fis.close();
		
		fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis); //다른 inputstream으로부터 읽는 것
		
		int a = 0;
		long start1 = System.nanoTime();
		
		while((a = bis.read()) != -1 ) {
			
		}
		long end1 = System.nanoTime();
		System.out.println(end1 - start1);
		
		bis.close();
		fis.close();
		
	}
}
