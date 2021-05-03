package p18.lecture;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class A12FileCopy {
	public static void main(String[] args) throws Exception {
		//파일복사 Reader Writer
		String src = "src/p18/lecture/A12FileCopy.java";
		String des = "src/p18/lecture/A12FileCopy.copy";
		
		Reader rd = new FileReader(src);
		Writer wt = new FileWriter(des);
		
		int i = 0;
		while((i = rd.read()) != -1) {
			wt.write(i);
		}
//		int len = 0;
//		char[] ch = new char[10];
//		while((len =rd.read(ch)) != -1) {
////			wt.write(ch);
//			wt.write(ch, 0, len);
//		}
		
		
		rd.close();
		wt.close();
		
	}
}
