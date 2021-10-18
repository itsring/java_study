package casting;
public class HouseCat extends Cat {
	@Override
	public void vocal() {
		System.out.printf("야");
		System.out.printf("옹\n");
	}
	public void call() { // 집고양이의 메소드
		System.out.println("집사야");
	}
}
