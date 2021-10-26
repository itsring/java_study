package try_Catch;
import java.util.*;
public class App {

	public static void main(String[] args) {
		//try catch문을 사용해 예외 처리
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력");
		String line = scanner.nextLine();
		int number = 0;
		try {
			number = Integer.parseInt(line);
			System.out.println("여기는 실행되지 않아요.");//실행안됨
		} catch (Exception e) {//try문에서 에러 발생시 catch 문에서 처리한다.
			System.out.println("숫자 입력이 아닙니다."); 
			
		}
		System.out.println("입력한 숫자는 : "+number);
		scanner.close();
	}

}
