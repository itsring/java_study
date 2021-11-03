package lambda_return;

interface Joiner{
	String join(String text1, String text2);
}

public class App {

	public static void main(String[] args) {
		Joiner joiner = (s1, s2) -> {
			String text = s1+ "-" + s2;
			return text;
		
		};
		
		System.out.println(joiner.join("치킨", "맥주"));
		System.out.println(joiner.join("학원", "공부"));
		
		Joiner joiner2 = (s1, s2) -> s1+ "+" + s2; // 코드가 한줄일때 리턴이 생략가능
			
			
		
		System.out.println(joiner2.join("치킨", "맥주"));
		System.out.println(joiner2.join("학원", "공부"));
	}

}
