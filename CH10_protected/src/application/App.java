package application;
import entities.Apple;
import entities.Banana;
import entities.Fruit;

public class App {

	public static void main(String[] args) {
		// f1.id = 다른 패키지의 클래스들은 import로 불러온다.
		Fruit fruit1 =new Apple();
		System.out.println(fruit1);
		
		
		Fruit fruit2 =new Banana();
		System.out.println(fruit2);

	}

}
