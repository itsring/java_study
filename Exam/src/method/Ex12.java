package method;

public class Ex12 {

	/*
	 * 당신은 Java 카페의 사장이 되었고, 며칠 후 앙ㄹ바생들에게 급여를 주어야한다.
	 * 급여 조건 및 제약사항은 아래와 같다.
	 * 급여는 주급으로 정산하며(근무시간 )X(기본시급)을 기준으로 한다.
	 * 주당 근무가 40시간을 초과시, 초과분에 대하여 1.5배의 급여를 지급한다.	
	 * hours>40 && hours<60
	 * basePay*40 + (hours-40)*1.5*basePay
	 * 기본시급은 최저 $8.00 이며, 이보다 작은 경우 경고문을 출력한다.
	 * 	8.00<basePay
	 * 주당 근무가 60시간을 넘을 시, 경고문을 출력한다.
	 * 	hours>60
	 * 위 내용을 만족하는 printPay() 메소드를 완성하여, 출력 예와 같은 결과를 얻으시오.
	 * 
	 *  출력 예 :
	 *  $400.00
	 *  $550.00
	 *  최저 시급 에러!
	 *  초과 근무시간 에러!
	 */ 
	public static void main(String[] args) {
		printPay(10.00, 40);
		printPay(10.00, 50);
		printPay(7.50, 38);
		printPay(8.50, 66);
	}

	private static void printPay(double basePay, int hours) {
		double pay=0.0;
		if(basePay<8.00) {
			System.out.println("최저 시급 에러!");
		}else if(basePay>8.00 && hours>40 && hours<60) {
			pay=basePay*40+(hours-40)*1.5*basePay;
			System.out.printf("$ %.2f\n", pay);
		}else if(hours>=60) {
			System.out.println("초과 근무시간 에러!");
		}else {
			pay=basePay*hours;
			System.out.printf("$ %.2f\n", pay);			
		}
	}

}
