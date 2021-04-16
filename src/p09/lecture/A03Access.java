package p09.lecture;

public class A03Access {
	class NonStaticClass{
		
	}
	
	static class StaticClass{
		
	}
	
	NonStaticClass o1 = new NonStaticClass();
	StaticClass o2 = new StaticClass();
	
//	static NonStaticClass o4 = new NonStaticClass(); //static member에서 instance member 접근 불가
	static StaticClass o3 = new StaticClass();
	
	
	
	
	void instanceMethod() {
		staticMethod();//instance member에서 static member에 접근 가능
	}
	
	static void staticMethod() {
//		instanceMethpd();  static member에서 instance member 접근 불가능
	}
}
