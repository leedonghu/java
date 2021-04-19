package p10.lecture;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class A13TryWithResources {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			 fis = new FileInputStream("src/p10/lecture/A13TryWithResources.java");
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}
}
