package p13.lecture;

public class A06BoundedTypeParameter {
	public static void main(String[] args) {
		Generic6<String> g1 = new Generic6<>();
		Generic6<StringBuffer> g2 = new Generic6();
		Generic6<StringBuilder> g3 = new Generic6();
		
//		Generic6<Object> g4 = new Generic6(); CharSequence 하위에 있는 클래스들만 타입으로 사용할 수 있음
	}
}

class Generic6<T extends CharSequence>{
	private T field;
	
	public void method() {
		field.charAt(6); // 상위타입에 있는 메소드를 쓸 수 있음
	}
}
