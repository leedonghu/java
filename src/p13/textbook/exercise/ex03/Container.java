package p13.textbook.exercise.ex03;

public class Container<T, S> {
	private T t;
	private S s;
	public T getKey() {
		return t;
	}
	public void set(T t, S s) {
		this.t = t;
		this.s = s;
	}
	public S getValue() {
		return s;
	}
	
	
}
