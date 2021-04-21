package p11.textbook.s110601;

import p09.textbook.exercise.ex04.Car;

public class ClassExample {
	public static void main(String[] args) {
		Car car = new Car();
		Class clazz1 = car.getClass();
		System.out.println(clazz1.getName());
		System.out.println(clazz1.getSimpleName());
		System.out.println(clazz1.getPackage().getName());
		System.out.println();
		
		Class clazz2;
		try {
			clazz2 = Class.forName("p09.textbook.exercise.ex04.Car");
			System.out.println(clazz2.getName());
			System.out.println(clazz2.getSimpleName());
			System.out.println(clazz2.getPackage().getName());
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
