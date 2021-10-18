package method;

public class Ex03 {

	public static void main(String[] args) {
		/*
		 * 가솔린 8.86L를 충전한 A자동차는 총 182.736Km를 운행할 수 있다고 한다.
		 * 이 차의 연비를 계산하는 메소드를 완성하고, 
		 * 출력 예와 같은 결과를 얻으시오
		 * 출력 예 : 연비 : 20.62km/L 
		 */
		double gasolin = 8.86;
		double carCanGoDistancs = 182.736;
		double result = calculateOilCell(gasolin, carCanGoDistancs);
		System.out.println("연비 : "+ result+ "km/L");
		
	}
	private static double calculateOilCell(double fuel, double distance) {
		return Math.round(distance/fuel*100)/100.0;
	}

}
