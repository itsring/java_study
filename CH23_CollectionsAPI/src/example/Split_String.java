package example;

public class Split_String {

	public static void main(String[] args) {
		// 문자열 분리 / 문자열.split(" ") => 문자열을 공백(space)로 쪼개서 배열로 return
		String text1 = "She was sold to a stranger so her family could eat as Afghanistan crumbles";
		String text2 = "미국을 대상으로 하는 CNN US와 전세계로 방송되는 CNN International(CNNI)이 따로 제작편성된다."
				+ " 전자는 미국 국내용 방송이고, 후자는 국제판이다.";
		
		String[] words = text1.split("[^a-zA-Z]+");
	//"[]+" : 정규 표현식 / ^시작하는 글자가 a~z 까지 대문자로 시작하는 글자가 A~Z 까지 넣는다.
	//,나 특수문자가 있을수도 있어서 단어만 쪼개고 싶을때 사용	
		String[] words2 = text2.split("[^가-힣a-zA-Z]+");
		
		for(var word:words) {
			if(word.length()<2) {
				continue;
			}//한 철자이하는 빼기
			System.out.println(word.toLowerCase());//소문자로 출력
		}
		System.out.println();
		for(var word:words2) {
			if(word.length()<1) {
				continue;
			}
			System.out.println(word.toLowerCase());
		}
	}

}
