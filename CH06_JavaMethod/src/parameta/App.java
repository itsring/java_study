package parameta;

public class App {

	public static void main(String[] args) {
		//
		Calculator calc = new Calculator();
		int number = 7;
		int result = calc.square(number);

		System.out.printf("%d �� ������ %d �̴�.\n", number, result);
		
		result = calc.plus(number, 15);
		System.out.printf("�μ��� ���� %d �̴�.\n", result);
		
		result = calc.minus(number, 4);
		System.out.printf("�μ��� ���� %d �̴�.\n", result);
	}

}
