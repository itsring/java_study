package enumSwitch;

public class App {

	public static void main(String[] args) {
		Fruit f1 = Fruit.ORANGE;

		switch (f1) {
		case ORANGE:
			System.out.println("오랜지");
			break;
			
		case BANANA:
			System.out.println("바나나");
			break;
		case APPLE:
			System.out.println("사과");
			break;
		default:
			System.out.println("없는 과일입니다.");
			break;
		}

	}

}
