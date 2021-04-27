package p13.lecture;

public class A09Inheritance {
	
}

class Generic9<T>{
	
}

class ChildGeneric9<T> extends Generic9<T> {
	//타입파라미터를 명시하지 않으면 상속받는 클래스도 반드시 써줘야함
}

class ChildGeneric92<T, U> extends Generic9<T>{
	//타입파라미터를 여러개 쓸 수 있음
}

class ChildGeneric93 extends Generic9<String>{
	//타입 파라미터를 명시하면 상속받는 클래스에서 명시할 필요 없음
}
