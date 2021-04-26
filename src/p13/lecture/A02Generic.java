package p13.lecture;

public class A02Generic {
	//generic 없던 시절
	public static void main(String[] args) {
		Generic2 g2 = new Generic2();
		g2.setO("java");
		String s = (String) g2.getO();
		System.out.println(s);
		
		g2.setO(22); // int -> Integer 로 auto boxing
		Integer i =(Integer) g2.getO();
		System.out.println(i);
		
		g2.setO(3.14); // double -> Double 로 auto boxing
		Integer d = (Integer) g2.getO();
	}
}


class Generic2 {
	private Object o;
	
	public void setO(Object o) {
		this.o = o;
	}
	
	public Object getO() {
		return o;
	}
}