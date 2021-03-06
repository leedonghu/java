package p07.lecture.p6polymorphism.ex2;

public class A05Parameter {
	public static void main(String[] args) {
		KindaCat k1 = new Cat();
		method(k1);
		KindaCat k2 = new Tiger();
		method(k2);
		
		Cat c = new Cat();
		method(c);
		
		Tiger t = new Tiger();
		method(t);
		
		method(new Cat());
		method(new Tiger());
	}
	
	public static void method(KindaCat k) {
		k.cry();
	}
}
