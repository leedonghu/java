package p11.textbook.exercise.ex11;

public class IntegerCompareExample {
	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1==obj2);
		System.out.println(obj3==obj4);
		System.out.println(System.identityHashCode(obj3));
		System.out.println(System.identityHashCode(obj4));
		System.out.println(System.identityHashCode(obj2));
		System.out.println(System.identityHashCode(obj1));
	}
}
