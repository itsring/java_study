package enum_Constructor;

public enum Fruit {//enum은 상수들의 집합 / 상수 : 변하지 않는 값
	APPLE("초록"), BANANA("노랑"), ORANGE("오렌지색"); // 사과 바나나 오랜지 열거
	private String color;
	Fruit(String color) {
		this.color = color;
		System.out.println("기본 enum 생성자");
	}
	public String toString() {
		return super.toString()+"("+color+")";
	}
}
