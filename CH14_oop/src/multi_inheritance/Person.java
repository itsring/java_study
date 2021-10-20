package multi_inheritance;

public class Person implements Speaker, Greeter{
	//인터페이스는 다중 구형 가능, 상속은 하나만 가능
	@Override
	public void greet() {
		// TODO Auto-generated method stub
		System.out.println("환영합니다.");
	}

	@Override
	public void speak() {
		// TODO Auto-generated method stub
		System.out.println("나는 Person입니다.");
		
	}

}
