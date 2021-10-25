package enummethod;

public class App {

	public static void main(String[] args) {
//		Fruit[] fruits = Fruit.values();// values 메소드 : 해당 enum의 모든 상수를 저장한 배열을 리턴
				
		for (Fruit f : Fruit.values()) {
			System.out.println(f);

		}
		System.out.println(Fruit.APPLE.ordinal());
		System.out.println(Fruit.BANANA.ordinal());
		System.out.println(Fruit.ORANGE.ordinal());
		//valueOf("String") 메소드는 상수의 순서를 리턴 
		Fruit f1 = Fruit.valueOf("ORANGE");
				//문자열 ORANGE와 같은 값을 가진 enum 상수를 찾음 
		System.out.println(f1);
		System.out.println(f1==Fruit.ORANGE);
	}
	
}
