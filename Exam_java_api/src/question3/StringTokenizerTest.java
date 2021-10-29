package question3;
import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		// 입력 문자열
		String str = "치킨, 피자, 보쌈, 족발, 초밥, 떡볶이 , 탕수육";
		String delim=", ";
		StringTokenizer st = new StringTokenizer(str,delim);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}

}
