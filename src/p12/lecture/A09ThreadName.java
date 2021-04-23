package p12.lecture;

public class A09ThreadName {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		String name = thread.getName();
		
		System.out.println(name);
		
		Thread t1 = new Thread(new Thread9());
		t1.start();
		
		Thread t2 = new Thread(new Thread9());
		t2.start();
		
		Thread t3 = new Thread(new Thread9());
		t3.start();
	}
}

class Thread9 implements Runnable{
	@Override
	public void run() {
		Thread curruntThread = Thread.currentThread();
		String name = curruntThread.getName();
		
		System.out.println(name);
		
	}
}
