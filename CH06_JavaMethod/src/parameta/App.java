package parameta;

public class App {

	public static void main(String[] args) {
		//
		Calculator calc = new Calculator();
		int number = 7;
		int result = calc.square(number);

		System.out.printf("%d 의 제곱은 %d 이다.\n", number, result);
		
		result = calc.plus(number, 15);
		System.out.printf("두수의 합은 %d 이다.\n", result);
		
		result = calc.minus(number, 4);
		System.out.printf("두수의 차는 %d 이다.\n", result);
	}

}
