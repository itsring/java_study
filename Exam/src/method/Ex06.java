package method;

public class Ex06 {

	public static void main(String[] args) {
		/*
		 * �־��� ���� ������ ���� ������ ��ȯ�ϴ� �޼ҵ� grade() �� �ϼ��Ͽ� ��¿��� ���� ����� �����ÿ�
		 * 
		 * ���� ���� A+ : 95�� �̻� A0 : 90�� �̻� B+ : 80�� �̻� B0 : 70�� �̻� C+ : �׿�
		 */
		int score1 = 96;
		int score2 = 85;
		int score3 = 76;
		System.out.printf("%d�� -> %s\n", score1, grade(score1));
		System.out.printf("%d�� -> %s\n", score2, grade(score2));
		System.out.printf("%d�� -> %s\n", score3, grade(score3));
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
