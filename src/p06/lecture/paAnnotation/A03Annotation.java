package p06.lecture.paAnnotation;

import p05.textbook.s050701.Week;

public class A03Annotation {
	@MyAnnotation2(value = "java", 
			attr1 = 10, attr2 = {1, 2}, 
			attr3 = {"java"}, attr4 = Week.MONDAY,
			attr6 = "spirng")
	public void method1(){
		
	}
}
