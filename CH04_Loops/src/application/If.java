package application;

import java.util.Scanner; // 스캐너 라이브러리 포함 / 스캐너 = 유저 input 

public class If {

	public static void main(String[] args) {
		// 조건문 if
		int apples = 10;
		int bananas = 5;
		if (apples > bananas) {
			System.out.println("사과가 바나나보다 많음");
		} else {
			System.out.println("사과가 바나나보다 많지 않음");
		}
		System.out.println("프로그램 종료");
		
		// 예제
		Scanner scanner = new Scanner(System.in);// 스캐너를 사용할 수 있게 생성
		System.out.print("사과의 개수는?");
		int apple = scanner.nextInt();// 객체의 netxtInt() 메소드로 정수값을 입력
		System.out.print("바나나의 개수는?");
		int banana = scanner.nextInt();
		scanner.close();
		if (apple > banana) {
			System.out.println("사과가 바나나보다 많음");
		} 
		if(apple<banana) {
			System.out.println("바나나가 사과보다 많음");
		}
	}
}
