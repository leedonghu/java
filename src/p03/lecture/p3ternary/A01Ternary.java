package p03.lecture.p3ternary;

public class A01Ternary {
	public static void main(String[] args) {
		// 1항 ? 2항 : 3항
		// 결과는 2항 또는 3항
		// 1항이 true이면 2항, false 이면 3항이 결과
		
		boolean b = true;
		// b ? 3 : 4 -->3
		System.out.println(b ? 3 : 4);
		b = false;
		// b ? 3 : 4 -->4
		System.out.println(b ? 3 :4);
		
		int a =5;
		// (a >0) ? "양수" : "음수 또는 0"
		System.out.println((a >0) ? "양수" : "음수 또는 0");
	}
}
