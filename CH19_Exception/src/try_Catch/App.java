package try_Catch;
import java.util.*;
public class App {

	public static void main(String[] args) {
		//try catch���� ����� ���� ó��
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է�");
		String line = scanner.nextLine();
		int number = 0;
		try {
			number = Integer.parseInt(line);
			System.out.println("����� ������� �ʾƿ�.");//����ȵ�
		} catch (Exception e) {//try������ ���� �߻��� catch ������ ó���Ѵ�.
			System.out.println("���� �Է��� �ƴմϴ�."); 
			
		}
		System.out.println("�Է��� ���ڴ� : "+number);
		scanner.close();
	}

}
