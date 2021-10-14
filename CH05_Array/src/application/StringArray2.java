package application;

public class StringArray2 {

	public static void main(String[] args) {
		// String은 참조자료형, 참조 변수는 주소값을 갖는다
		String text = null;
		text = "헬로우";
		System.out.println(text);

		String[] texts = null;
		System.out.println(texts);
		texts = new String[3];//3개의 문자열 배열공간 생성
		System.out.println(texts);
		System.out.println();
		texts[0]= new String("하이!");
		texts[1]="안녕?";
		texts[2]="굿바이!";
		for(String x : texts) {
			System.out.println(x);
			
		}
	}

}
