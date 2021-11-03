package multiThread;

public class App {

	public static void main(String[] args) throws InterruptedException {
		// 
		Runnable runnable = ()-> {
			for(int i=0;i<100; i++) {
				System.out.println("i : "+i);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					
				}
			}
		};
		
		
		Thread t1 =new Thread(runnable);
		Thread t2 =new Thread(runnable);
		
		//t1의 runnable 람다식 실행
		t1.start();
		t2.start();
		t1.join();//메인 쓰레드 마지막에 실행
		t2.join();
		
		System.out.println("안녕");

	}

}
