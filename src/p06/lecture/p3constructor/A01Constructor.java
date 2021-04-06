package p06.lecture.p3constructor;

public class A01Constructor {
	//생성자(constructor)
	//객체(instance)가 생성될 때 해야하는 일들이 작성되는 코드블럭
	//주로 필드를 초기화하는 데 사용됨
	
	//생성자명은 클래스명과 같음
	//다른 파라미터를 갖는 여러 생성자가 만들어 질 수 있음
	
	public static void main(String[] args) {
//		Car car1 = new Car();
//		car1.name = "제네시스";
//		car1.model = "G70";
//		
//		Car car2 = new Car();
//		car2.name = "쉐보레";
//		car2.model = "카마로";
		
		Car car1 = new Car("제네시스", "G70");
		System.out.println(car1.name);
		System.out.println(car1.model);
		
		Car car2 = new Car("쉐보레", "카마로");
		System.out.println(car2.name);
		System.out.println(car2.model);
	}
}
