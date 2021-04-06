package p06.lecture.p2field;

public class A02Field {
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.name = "제네시스";
		car1.model = "G70";
		
		Car car2 = new Car();
		car2.name = "쉐보레";
		car2.model = "카마로";
		
		System.out.println(car1.name);
		System.out.println(car1.model);
		
		System.out.println(car2.name);
		System.out.println(car2.model);
	}
}
