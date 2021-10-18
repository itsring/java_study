package overwritingMethod;

public class App {

	public static void main(String[] args) {
		// 같은 vocal() 메소드를 오버라이팅(내용은 다름)
		HouseCat cat1 = new HouseCat();
		cat1.vocal();
		cat1.hunt();
		
		RoadCat cat2 = new RoadCat();
		cat2.vocal();
		cat2.hunt();
		
		Tiger cat3 = new Tiger();
		cat3.vocal();
		cat3.hunt();
		
	}

}
