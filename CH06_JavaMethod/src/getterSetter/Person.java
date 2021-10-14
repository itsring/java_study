package getterSetter;

public class Person {

	private String name;
	private int age;
	// get,set 메소드로 변수에 접근
	void setName(String name) {
		this.name = name;
	}
	void setAge(int age) {
		this.age=age;
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
}
