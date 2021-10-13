package application;

public class PreAndPost {

	public static void main(String[] args) {
		// 증감연산자의 위치에 따라 먼저 증감하고 할당(=), 할당(=)하고 증감
		int cats=5;
		System.out.println(cats++); // 연산 후 1더해서 결과값 5
		System.out.println(cats);	// 위에서 1더한게 지금 출력되서 6
		
		int dogs=3;
		System.out.println(++dogs);	// 연산전 1 더해서 결과값 4
		
		int chickens =10;
		
		int animals=cats + chickens++;	// 고양이는 위에서 6 치킨은 연산 후 더하니 10
		
		System.out.println(animals);	// 6+10
		
		int apples=5;
		int bananas=4;
		
		int fruits=++apples+ bananas++;	//사과는 연산 전에 더해서 6 바나나는 연산후 더해서 4
		System.out.println(fruits);		//결과값 6+4
	}

}
