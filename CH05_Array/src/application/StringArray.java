package application;

public class StringArray {

	public static void main(java.lang.String[] args) {
		// 문자열로 만든 배열
		String[] animals = { "고양이", "개", "말", "소" };
		System.out.println(animals[0]);
		System.out.println(animals[1]);
		System.out.println(animals[2]);
		System.out.println(animals[3]);
		
		animals[0]="닭";
		System.out.println(animals[0]);
		System.out.println(animals[1]);
		System.out.println(animals[2]);
		System.out.println(animals[3]);
		
	}

}
