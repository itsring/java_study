package innerClass;

public class App implements Runnable {

	private String name = "미키마우스";

	public static void main(String[] args) {
		new App().start();
	}

	private void start() {
		/*
		 * activate 메소드 실행 방법 
		 * 1. App 클래스에 Runnable 구현
		 */
		activate(this);//this = App.start()를 동작하기 위한 run 메소드 실행 
		/*
		 * 2. 익명클래스
		 */
		activate(new Runnable() { // new Runnable() 의 이름이 없는 클래스

			@Override
			public void run() {
				System.out.println(name);

			}
		});
		/*
		 * 3. 메소드 이너 클래스
		 */
		class Runner1 implements Runnable {
			public void run() {
				System.out.println(name);
			}
		} // 클래스 안에 메소드를 넣고 그대로 사용 

		activate(new Runner1());
	}
	public void activate(Runnable runnable) {
		runnable.run();
	}

	@Override
	public void run() {
		System.out.println(name);
	}
}
