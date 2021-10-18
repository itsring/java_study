package application;

public class App {

	public static void main(String[] args) {
		//고양이 클래스 불러오기 
//		App app=new App();
//		app.main(args);
		Cat cat1=new Cat("야옹이");
		Cat cat2=new Cat("노랭이");

		System.out.println(cat1);
		System.out.println(cat2.toString());
		//스태틱 변수는 객체와 상관없이 클래스명.변수명 으로 불러온다.
		System.out.println(Cat.FOOD);
		System.out.println(Math.PI);
		System.out.println(cat1.getCount());
		Cat cat3=new Cat("네로");
		System.out.println(cat2.getCount());
	}

}
