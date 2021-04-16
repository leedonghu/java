package p09.textbook.exercise.ex04;

public class NestedClassExample {
	public static void main(String[] args) {
		Car myCar = new Car();
		
		Car.Tire tire = myCar.new Tire();//tire사 non-static class여서
		Car.Engine engine = new Car.Engine();//engine이 static class여서
	}
}
