package anonymous_Class;

public class App {
	private String name = "펭수";
	
	public static void main(String[] args) {
		new App().start();
	}
	private void start() {
//		System.out.println(name);
//		Runnable runner = new Runnable() {//이름 없는 클래스 (익명 클래스 생성)
//			public void run() {
//				System.out.println(name);//내부 클래스로 외부 클래스의변수 사용 				
//			}
//		};
//		activate(runner);
		activate(new Runnable() {
			@Override
			public void run() {
				System.out.println(name);
			}
		});
	}
	private void activate(Runnable runnable) {
		runnable.run();//추상 메소드 실행
	}
}
