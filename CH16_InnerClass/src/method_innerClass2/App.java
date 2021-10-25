package method_innerClass2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//import com.sun.tools.javac.code.Printer;

public class App {
	private String name;

	public String getName() {
		return name;
	}

	public App() {
		// 기본 생성자
		name = "앨리자베스";

	}

	public void run() {
//		class Printer implements Runnable {
//
//			@Override
//			public void run() {
//				System.out.println(name); //타이머로 반복할 코드 
//				
//			}// 내부 클래스에서 상위 클래스의 변수사용가능
//		}
		// Printer p = new Printer();
		// p.print();
		// ==
//		new Printer().print();
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		service.scheduleAtFixedRate(new Runnable() {

			@Override
			public void run() {
				System.out.println(name);

			}
		}, 0, 1, TimeUnit.SECONDS);

	}

	public static void main(String[] args) {
		// 메소드 안의 클래스
		App app = new App();
		app.run();

	}

}
