package p12.lecture;

public class A12Concurrency {
	
	static long shareValue=0;
	
	public static void main(String[] args) {
		Thread t = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i<1000000; i++) {
					shareValue++;
				}
			}
		});
		t.start();
		for(int i=0; i<1000000; i++) {
			shareValue++;
		}
		try {
			t.join();
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		
		
		System.out.println(shareValue); //join 이 없으면 shareValue가 0인 것을 바로 출력
		                                //join이 있기때문에 thread가 다 실행되고 나서 shareValue 값이 10000000된 후 출력
	}
}


class Thread12 implements Runnable {
	@Override
	public void run() {
			
	}
}