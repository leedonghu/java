package p07.lecture.p6polymorphism.ex2;

public class A01Override {
	public static void main(String[] args) {
		KindaCat k1 = new Cat();
		KindaCat k2 = new Tiger();
		
		k1.cry();
		k2.cry();
		
		KindaCat k3 = new KindaCat();
		k3.cry();
				
	}
}
