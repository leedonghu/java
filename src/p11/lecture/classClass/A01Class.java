package p11.lecture.classClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class A01Class {
	public static void main(String[] args) throws Exception {
		MyClass o1 = new MyClass();
		
		Class c1 = Class.forName("p11.lecture.classClass.MyClass");
		
		System.out.println(c1.getName());
		Field[] field = c1.getDeclaredFields();
		System.out.println(field.length);
		System.out.println(field[0].getName());
		System.out.println(field[1].getName());
		
		Constructor[] constructor = c1.getDeclaredConstructors();
		System.out.println(constructor.length);
		System.out.println(constructor[0].getName());
		System.out.println(constructor[1].getName());
		
		Method[] methods = c1.getDeclaredMethods();
		System.out.println(methods.length);
		System.out.println(methods[0].getName());
		System.out.println(methods[1].getName());
	}
}

class MyClass{
	private int field1;
	private int field2;
	
	MyClass(){
		
	}
	
	MyClass(int param1){
		
	}
	
	public void method1() {
		
	}
	
	public void method2() {
		
	}
}
