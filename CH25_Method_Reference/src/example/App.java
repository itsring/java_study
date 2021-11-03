package example;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
	//객체없이 바로 사용하기 위해 static 
	public static void greet() {
		System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		// 
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		//람다식
		//service.scheduleAtFixedRate(() -> System.out.println("Hello"), 0, 1000, TimeUnit.MILLISECONDS);
		
		//메소드 레퍼런스
		/*
	(class name::static method name,delay time, time, timeunit.type)
			(매개변수) 는 안적음 / greet() x ,greet o 
		 */
		service.scheduleAtFixedRate(App::greet, 0, 1000, TimeUnit.MILLISECONDS);
		
	}

}
