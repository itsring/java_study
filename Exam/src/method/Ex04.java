package method;
import java.util.Random;
public class Ex04 {

	public static void main(String[] args) {
		/*
		 *어떤 게임이 있다. 이 게임은 주사위를 던져 나온느 눈의 수 만큼 달러를 획득한다.
		 *주사위를 총 3번 던져 얻은 달러.
		 *이를 환전한 결과를 출력하시오.
		 *
		 *요구사항 : Math.random() 1과 6사이의 숫자를 반환하는 dice() 메소드를 구현할 것
		 *			1달러의 환율은 1082.25108 원으로 한다.
		 *출력 예 : 획득금액 : $12.00(12987원)
		 */ 
		double dollar = dice()+ dice() +dice();
		double won = exchange(dollar);
		System.out.println("$"+dollar+ "("+won+"원)");
	}
	private static int dice() {
		return (int) (Math.random()*6)+1 ;
	}
	public static double exchange(double dollar) {
		double dollarToKorea = 1082.25108*dollar;
		return Math.round(dollarToKorea);
	}
}
