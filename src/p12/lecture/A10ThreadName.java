package p12.lecture;

public class A10ThreadName {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Thread10());
		t1.setName("thread99");
		t1.start();
		
		Thread t2 = new Thread(new Thread10(), "ad_thread");
		t2.start();
		
		
	}
	
}

class Thread10 implements Runnable{
	@Override
	public void run() {
		Thread curruntThread = Thread.currentThread();
		System.out.println(curruntThread.getName());
				
	}
}
