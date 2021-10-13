package application;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// 조건이 여러개일때는 스위치 케이스 문이 더 보기 쉬움
		
		//예제
		Scanner scanner = new Scanner(System.in);// 스캐너를 사용할 수 있게 생성
		System.out.println("메뉴");
		System.out.println("====");
		System.out.println("1. 프린트 '헬로우'");
		System.out.println("2. 프린트 '안녕?'");
		System.out.println("3. 프로그램 종료\n");
		System.out.print("옵션을 선택 >");
		int option = scanner.nextInt();
		scanner.close();
		switch(option) {
		case 1 :
			System.out.println("헬로우");
			break;
		case 2:
			System.out.println("안녕?");
			break;
		case 3:
			System.out.println("종료합니다.");
			break;
		case 10000:
			System.out.println("이스터에그 발견!");
			break;
		default :
			System.out.println("잘못된 옵션을 선택하였습니다.");
			break;
		}
			
//		scanner.close();
//		if (option == 1) {
//			System.out.println("헬로우");
//		} 
//		else if(option == 2) {
//			System.out.println("안녕?");
//		}else if(option == 3) {
//			System.out.println("종료합니다.");
//		}
//		else if(option == 10000){
//			System.out.println("이스터에그 발견!");
//		}else{
//			System.out.println("잘못된 옵션을 선택하였습니다.");
//		}
	}

}
