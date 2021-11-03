package example;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

@FunctionalInterface
interface Greeter{
	void greet();
}

public class App2 {
	//객체없이 바로 사용하기 위해 static 
	
	
	public static void main(String[] args) {
		// 람다식을()-> 메소드 레퍼런스로 대체 ::
		Greeter g = App2::sayHello;
		g.greet();
	}
	private static void sayHello() {
		System.out.println("세이 호");
	}

}
