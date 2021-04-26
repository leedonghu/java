package p13.lecture;

public class A03Generic {
	public static void main(String[] args) {
		Generic3<String> g3 = new Generic3<>();
		g3.setO("java");
		String s = g3.getO(); //형변환 필요 없음
		System.out.println(s);
		
		Generic3<Integer> g4 = new Generic3<>();
		//g4.setO("java"); T가 Integer로 결정되었기 때문에 String 들어가지 못함
		g4.setO(999);
		int i = g4.getO();//auto unboxing
		System.out.println(i);
		
		Generic3<Double> g5 = new Generic3<>();
		g5.setO(3.14);
		double d = g5.getO();
		System.out.println(d);
	}
}

class Generic3<T>{
	private T o;
	
	public T getO() {
		return o;
	}
	
	public void setO(T o) {
		this.o = o;
	}
}
