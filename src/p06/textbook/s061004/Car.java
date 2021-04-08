package p06.textbook.s061004;

public class Car {
	int speed;
	
	void run() {
		System.out.println(speed + "으로 달립니다.");
	}
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.speed = 60;
		myCar.run();
		//speed = 7; main method가 static이기 때문에 바로 
		//           instance method나 field에 접근할 수 없음 
	}
}
