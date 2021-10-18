package casting;


public class App {

	public static void main(String[] args) {
		//참조타입 : 기본을 제외한클래스 타입 등
				Cat cat1 = new HouseCat(); // 집고양이 객체
				cat1.vocal();
				cat1.hunt();
				//Cat 타입이기 때문에 cat1.call();은 사용 안됨
				//Cat메소드만 사용 가능 / Overriding 됨
				
				
				//다운 캐스팅  (타입을 다시 하위 클래스롤 변환)
				HouseCat cat2 = (HouseCat)cat1;
				cat2.call(); // 위에서 선언된 집고양이 객체의 call메소드 실행
	}

}
