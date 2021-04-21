package p06.lecture.paAnnotation;

public class A04Annotation {
	@MyAnnotation3(999) // 하나만 쓰고 그 엘레멘트 이름이 value일때만 이름 생략
	public void method1() {
		
	}
	
	@MyAnnotation3(value = 999)
	public void mehtod2() {
		
	}
	@MyAnnotation3(value = 999, attr1 = 75)
	public void mehtod3() {
		
	}
}
