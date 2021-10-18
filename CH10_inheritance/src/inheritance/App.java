package inheritance;

public class App {

	public static void main(String[] args) {
		// Bird는 Animal을 상속받음
		Animal animal1 = new Animal();
		animal1.eat();
		
		Bird bird1= new Bird();
		bird1.eat();
		bird1.fly();
		
	}

}
