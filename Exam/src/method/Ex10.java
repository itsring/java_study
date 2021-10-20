package method;

public class Ex10 {

	public static void main(String[] args) {
		/*
		 * ���л��� �Ǿ� ������ ���̾�Ʈ ���� ����¯(20) �л�. ������ ��� �ϰ� �Ĵ� ������ �ϰ��ִµ�.. ���� ���ϰ� �ִ°ɱ�?
		 * ü��(kg)�� Ű(m)�� �Է¹޾� BMI������ ��ȯ�ϴ� calculate()�� BMI������ ���� �񸸵� ����� ��ȯ�ϴ� result()
		 * �޼ҵ带 �ϼ��Ͽ�, ��� ���� ���� ����� �����ÿ�.
		 * 
		 * �� : BMI : 26.34(81.6kg, 1.76m) ��� : ��ü�� �Դϴ�.
		 * �� : 30�̻�
		 * ��ü�� 25�̻�~30�̸�
		 * ���� 18.5�̻� 25�̸�
		 * ��ü�� 18.5 �̸�
		 */
		double w = 81.6;
		double t = 1.76;
		double bmi = calculate(w, t);
		
		System.out.printf("BMI: %.2f(%.1fkg, %.2fm)\n", bmi,w,t);
		System.out.printf("��� : %s�Դϴ�.\n",result(bmi));
	}

	private static double calculate(double weight, double tall) {
		double BMI = weight/(tall*tall);
		return BMI;
	}
	private static String result(double bmi) {
		String result="";
		if(bmi>=30) {
			return result="��";
		}else if(bmi<30 && bmi>=25) {
			return result="��ü��";
		}else if(bmi<25 && bmi>=18.5) {
			return result="����";
		}else if(bmi<18.5) {
			return result="��ü��";
		}else {
			return result ="�� �� ��";
		}
		
	}

}
