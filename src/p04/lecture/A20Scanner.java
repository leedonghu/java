package p04.lecture;

import java.util.Scanner;

public class A20Scanner {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String d = scanner.next(); //토큰까지만 읽음
//		String c = scanner.nextLine(); //엔터까지 읽음
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(d);
//		System.out.println(c);
		
		scanner.close();
		System.out.println("프로그램 종료");
	}
}
