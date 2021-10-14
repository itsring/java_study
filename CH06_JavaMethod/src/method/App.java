package method;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.name); // nell이 초기값
		System.out.println(p1.age);//int 0이 초기값
		p1.sayHello();//메소드 호출
		
		p1.name="펭수";
		p1.age =10;
		System.out.println(p1.name); // nell이 초기값
		System.out.println(p1.age);//int 0이 초기값
		p1.sayHello();//메소드 호출
		
		Person p2= new Person();
		p2.name ="길동";
		p2.sayHello();//메소드 호출
		Person p3= new Person();
		p3.name = "라이언";
		p3.sayHello();//메소드 호출
	}

}
