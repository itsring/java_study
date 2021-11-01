package equals;

class Person {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	public String toString() {

		return name;
	}

	@Override
	public boolean equals(Object other) {
		// override
		// Object클래스의 equals 오버라이드 해서 Person 클래스의 이름으로 비교하도록 수정
		String a = "abc";
		String b = "def";
		a.equals(b);

		if (other == null) {
			return false;
		} // 널 값이면 리턴값

		if (other == this) {
			return true;
		} // 같은 객체면 리턴값
		if (!(other instanceof Person)) {
			return false;
		} // 같은 타입이 아니면 리턴값
		if (this.name == null) {
			return false;
		} // 이름값이 널값이면 리턴값
		Person p = (Person) other;
		if (p.name == null) {
			return false;
		}	// other 객체의 이름값이 널값이면 리턴값
		return name.equals(other);
	}

}

public class App {

	public static void main(String[] args) {
		// equals 메소드 추가
		Person p1 = new Person("펭수");
		Person p2 = new Person("펭수");
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));

	}

}
