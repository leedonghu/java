package p18.lecture;

import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class A18FilterStream {
	public static void main(String[] args) throws Exception {
		String file = "src/p18/lecture/output7.txt";
		OutputStream os = getOutputStream(file);
		OutputStreamWriter osw = new OutputStreamWriter(os);
		
		osw.write('a');
		osw.write('b');
		osw.write('가');//OutputStream으로는 byte 단위여서 출력안됨, OutputStreamWriter으로 OutputStream을 다시 작성하면 출력됨
		osw.write('c');
		
		osw.close();
		os.close();
		
	}
	
	
	public static OutputStream getOutputStream(String file) throws Exception {
		return new FileOutputStream(file);
	}
}
