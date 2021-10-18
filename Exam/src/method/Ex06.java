package method;

public class Ex06 {

	public static void main(String[] args) {
		/*
		 * 주어진 성적 변수에 대한 학점을 반환하는 메소드 grade() 를 완성하여 출력예와 같은 결과를 얻으시오
		 * 
		 * 성적 변수 A+ : 95점 이상 A0 : 90점 이상 B+ : 80점 이상 B0 : 70점 이상 C+ : 그외
		 */
		int score1 = 96;
		int score2 = 85;
		int score3 = 76;
		System.out.printf("%d점 -> %s\n", score1, grade(score1));
		System.out.printf("%d점 -> %s\n", score2, grade(score2));
		System.out.printf("%d점 -> %s\n", score3, grade(score3));
	}

	public static String grade(int score) {
		if (score >= 95) {
			return "A+";

		} else if (score >= 90 && score < 95) {
			return "A0";
		} else if(score >= 80 && score < 90) {
			
			return "B+";
		}else if(score >= 70 && score < 80) {
			
			return "B0";
		}else if(score < 70) {
			
			return "C+";
		}


		return null;
	}
}
