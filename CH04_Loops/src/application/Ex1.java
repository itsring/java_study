package application;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);// 스캐너를 사용할 수 있게 생성
		System.out.println("메뉴");
		System.out.println("====");
		System.out.println("1. 프린트 '헬로우'");
		System.out.println("2. 프린트 '안녕?'");
		System.out.println("3. 프로그램 종료\n");
		System.out.print("옵션을 선택 >");
		int option = scanner.nextInt();
		scanner.close();
		if (option == 1) {
			System.out.println("헬로우");
		} 
		else if(option == 2) {
			System.out.println("안녕?");
		}else if(option == 3) {
			System.out.println("종료합니다.");
		}
		else if(option == 10000){
			System.out.println("이스터에그 발견!");
		}else{
			System.out.println("잘못된 옵션을 선택하였습니다.");
		}
	}

}
