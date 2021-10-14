package application;
import java.util.Scanner; // 스캐너 라이브러리 포함 / 스캐너 = 유저 input
public class Ex1 {

	public static void main(String[] args) {
		// 정수 배열을 new로 3개의 크기로 만듬
		// 스캐너를 사용해 사용자의 3개의 정수 입력
		// 입력한 값을 더해서 총합을 출력
		int[] numbers = new int[3];
		int total=0;
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<numbers.length; i++) {
			System.out.println("숫자를 입력");
			numbers[i]= scanner.nextInt();
			total +=numbers[i];
		}
		System.out.println("입력한 값은");
		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);
		System.out.println(total);
		scanner.close();
	}

}
