package staticMethod;

public class Cat {
	private String name; // 고양이 이름
	private int id; // 고양이 id
	private static int count=0;//생성한 고양이의 숫자
	//final 은 변하지 않는 상수 지정
	//static 의미 : 객체에서 공유가능
	public static final String FOOD = "고양이 사료";
	public Cat(String name) {//생성자는 리턴 타입이 없음
		this.name = name;
		//코드 추가
		count++;//고양이 객체 생성시 스테틱 count가 1+됨
		id =count;
	}

	public String toString() {//toString 메소드 자동생성 
		return "고양이 [아이디 = " + id + ", 이름 = "+ name + "]";
	}
	public static int getCount() { //static 메소드
//		String n = name; static 메소드에서 인스턴스(객체) 변수를 사용할 수 없다.
		
		return count;
	}
	
	
}
