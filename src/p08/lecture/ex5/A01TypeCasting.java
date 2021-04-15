package p08.lecture.ex5;

public class A01TypeCasting {
	public static void main(String[] args) {
		Malamute d1 = new Malamute();
		d1.bark();
		d1.sit();
		d1.pull();
		
		Pet p1 = d1;
		p1.sit(); // o
//		p1.pull();// x pet interface에는 pull과 bark 메소드 없음
//		p1.bark();// x
		
		SledDog s1 = d1;
//		s1.sit();  // x
		s1.pull(); // o
//		s1.bark(); // x
		
		KindaDog k1 = d1;
//		k1.sit();  // x
//		k1.pull(); // x
		k1.bark(); // o
		
		Malamute d2 = (Malamute)k1; // KindaDog 타입을 Malamute 타입으로 강제 형변환
		d2.bark();
		d2.sit();
		d2.pull();
		
		Wolf w1 = (Wolf)k1; //k1은 malamute인데 wolf로 강제형변환하여 오류발생
		w1.bark();
		
		System.out.println("프로그램 종료");
	}
}
