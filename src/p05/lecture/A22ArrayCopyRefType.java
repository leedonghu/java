package p05.lecture;

import java.util.Arrays;

public class A22ArrayCopyRefType {
	public static void main(String[] args) {
		//그림08.참조타입배열 복사.png
		String[] s = {"java", "abc"};
		String[] t = new String[2];
		
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.toString(t));
		
		System.arraycopy(s, 0, t, 0, 2);// 문자열 객체 참조값을 복사
		                                // "java"와 "abc"
		System.out.println(Arrays.toString(s));
		System.out.println(Arrays.toString(t));
	}
}
