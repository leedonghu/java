package p13.textbook.s130501;

public class Util {
	public static <T extends Number> int compare(T t1, T t2) {
		double v1 = t1.doubleValue(); //t1 과 t2의 타입은 상관없이 number의 메소드를 모두 사용 가능
		double v2 = t2.doubleValue();
		return Double.compare(v1, v2);
	}
}
