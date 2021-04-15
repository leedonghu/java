package p08.lecture.ex5;

public class A02Instanceof {
	public static void main(String[] args) {
		KindaDog d1 = new Malamute();
		
		System.out.println(d1 instanceof KindaDog);
		System.out.println(d1 instanceof Malamute);
		System.out.println(d1 instanceof Pet);
		System.out.println(d1 instanceof SledDog);
		System.out.println(d1 instanceof Wolf); // false
		
		Malamute m1 = (Malamute) d1;
		Pet p1 = (Pet)d1;
		SledDog s1 = (SledDog) d1;
//		Wolf w1 = (Wolf) d1; 강제형변환 안됨
		
		System.out.println("프로그램 종료");
	}
}
