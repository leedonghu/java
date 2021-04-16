package p09.lecture;

public class A04LocalClassAccess {
	void method(int param) {
		//param 과 localVar 는 묵시적 final(effectively final)
		final int localVar = 3;
		//localVar = 4;
		
		class LocalClass {
			void method1() {
				System.out.println(localVar);
				//로컬클래스에서는 final로 명시된것만 사용 가능
				//final이 안쓰여 있어도 쓸 수 있지만 값이 바뀌면 오류가 남
				//값을 복사해서 쓰기때문에 바뀌면 안됨
				System.out.println(param);
			}
		}
	}
}
