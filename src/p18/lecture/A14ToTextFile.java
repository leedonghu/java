package p18.lecture;

import java.io.FileWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.util.Scanner;

public class A14ToTextFile {
	public static void main(String[] args) throws Exception {
		
		String file = "src/p18/lecture/output4.txt";
		Scanner scanner = new Scanner(System.in);
		Writer wt = new FileWriter(file);
		
		String line = "";
		
		
		while (!line.equals("종료")) {
			System.out.print("입력>");
			line = scanner.nextLine();
			//write시 끝에 enter 추가 "\n"
			wt.write(line + "\n");
			}
		
		wt.close();
		
		scanner.close();
		}
}
	
	
	
		
	