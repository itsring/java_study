package method;

public class Ex02_2 {

	public static void main(String[] args) {
		/*
		 * 삼겹살 1인분의 무게는 180g 이고, 또 삼겹살 1g의 칼로리는 5.179kcal 이다.
		 *  이를 참고하여 삼겹살 3인분의 칼로리르 소수점 이하 둘째자리까지 출력하시오 
		 */ 
		double result = calculateCalory(3);
		System.out.println(result + " kcal");
		
	}
	private static double calculateCalory(int walk) {
		return Math.round(180*walk*5.179*1000)/1000.0;
	}
}
