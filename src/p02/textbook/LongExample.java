package p02.textbook;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 10000000000; // 컴파일 에러
		long var4 = 10000000000L; // int 범위 넘어갈땐 마지막에 L붙임
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}
