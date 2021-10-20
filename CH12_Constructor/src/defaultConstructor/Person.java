package defaultConstructor;

public class Person {
	private String name; //이름
	private int age; 	 //나이
	
	public Person() {	//생성자 이름은 클래스 이름과 같아야된다.
						//생성자는 리턴이 없다.
		System.out.println("디폴트 생성자로 생성됨!");
		name = "모름";
		age = 0;
	}

	public Person(String name) {
		System.out.println("person 생성됨!");
		this.name = name;
		age = 0;
	}
	
	public Person(String name, int age) {
		System.out.println("person 생성됨!");
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

}
