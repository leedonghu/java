package p03.textbook;

public class OverflowExample {
	public static void main(String[] args) {
		long x = 1000000;
		long y = 1000000;
		
		long z = x * y;
		System.out.println(z);
		//int로 계산하면 표현할 수 있는 범위를 넘어서서 원하는 값 나오지 않음
	}
}
