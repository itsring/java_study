package nullpointException;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//null pointer  => runtime exception
		//1. 0으로 나누었을때
		try {
			System.out.println(5/0);			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		//2. 주소값 = null 일 때 (특히 많이 발생)
		Scanner scanner = null; //new Scanner(System.in);
		try {
			scanner.nextLine();
			scanner.close();			
		} catch (NullPointerException e) {
			System.out.println("객체의 null값이 null입니다.");
		}
	}

}
