package instanceOf;

import java.io.Serializable;

//크리쳐 클래스는 시리얼 인터페이스를 수현하여 디폴트 id를 만들었음
class Creature implements Serializable{
	private static final long serialVersionUID = 1L;
	
	//Cat 클래스는 크리처 클래스를 상속해서 디폴트 id를 생성했음
}class Cat extends Creature{
	private static final long serialVersionUID = 1L;
	
}



public class App {

	public static void main(String[] args) {
		// 객체의 타입을 판별한다.
		Creature c1 = new Creature();
		Object c2 =c1; // Object는 최상위 클래스 타입으로 어느 클래스 타입에도 선언가능(업캐스팅)
		
		Cat c3 = new Cat();
		
		Serializable c4 = (Serializable)c3;
		
		// c1은 Object의 객체인가? true/false
		// Object는 최상위 클래스이므로 
		System.out.println(c1 instanceof Object); //true 
		System.out.println(c1 instanceof Serializable); //true
		System.out.println(c1 instanceof Creature); //true
		System.out.println(c1 instanceof Cat); //false
		System.out.println();
		System.out.println(c2 instanceof Object); //true 
		System.out.println(c2 instanceof Serializable); //true
		System.out.println(c2 instanceof Creature); //true
		System.out.println(c2 instanceof Cat); //false
		System.out.println();
		System.out.println(c3 instanceof Object); //true 
		System.out.println(c3 instanceof Serializable); //true
		System.out.println(c3 instanceof Creature); //true
		System.out.println(c3 instanceof Cat); //true
		System.out.println();
		System.out.println(c4 instanceof Object); //true 
		System.out.println(c4 instanceof Serializable); //true
		System.out.println(c4 instanceof Creature); //true
		System.out.println(c4 instanceof Cat); //true
		
	}

}
