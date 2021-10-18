package staticMethod;

public class App {

	public static void main(String[] args) {
		// 스태틱 메소드 getCount사용
		final String CAT_COUNT = "고양이 숫자 : %d\n";
		// String.format은 printf를 문자열로 리턴 , static 메소드 사용
		String catCount = String.format(CAT_COUNT, Cat.getCount());
		System.out.println(catCount);
		Cat cat1=new Cat("야옹이");
		Cat cat2=new Cat("노랭이");
		Cat cat3=new Cat("네로");
		
		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(cat3);

		catCount = String.format(CAT_COUNT, Cat.getCount());
		System.out.println(catCount);
		
		int x = add(1,1);
		System.out.println(x);
	}

	private static int add(int a, int b) {
		// 메소드 자동완성시 static을 알아서 만들어줌
		return a+b;
	}

	

}
