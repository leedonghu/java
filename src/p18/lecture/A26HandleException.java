package p18.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class A26HandleException {
	public static void main(String[] args) {
		String path = "src/p18/lecture/A26HandleException.java";
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			try {
				if (fis != null) {

					fis.close(); // fis가 파일을 찾지 못하면 null로 남아있어서 nullpointexception발생가능
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // 항상 닫혀야 하기때문에 finally블럭 안에서
		}

	}
}
