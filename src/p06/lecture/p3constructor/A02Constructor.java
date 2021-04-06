package p06.lecture.p3constructor;

public class A02Constructor {
	//클래스는 적어도 하나의 생성자를 가짐
	//만약 생성자를 직접 장성하지 않으면 
	//파라미터가 없는 생성자(아규먼트가 없는 생성자, 기본 생성자)
	//가 자동으로 추가됨
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "java";
		
		Student s2 = new Student("java");
	}
}
