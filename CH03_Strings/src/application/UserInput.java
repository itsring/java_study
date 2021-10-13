package application;

import java.util.Scanner; // 스캐너 라이브러리 포함

public class UserInput {

	public static void main(String[] args) {
		// 입력 받기 scanner이용
		Scanner scanner = new Scanner(System.in);// 스캐너를 사용할 수 있게 생성
		System.out.println("온도를 입력해 주세요 :");
		double celsius = scanner.nextDouble();// 객체의 netxtInt() 메소드로 정수값을 입력
		scanner.close();
		double fahrenheit = (celsius * 9 / 5) + 32; // 화씨
		System.out.println("섭씨 " + celsius + "℃는 화씨 " + fahrenheit + "℉ 이다");
	}

}
