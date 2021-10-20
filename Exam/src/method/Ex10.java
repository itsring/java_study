package method;

public class Ex10 {

	public static void main(String[] args) {
		/*
		 * 대학생이 되어 열심히 다이어트 중인 나몸짱(20) 학생. 열심히 운동도 하고 식단 조절도 하고있는데.. 과연 잘하고 있는걸까?
		 * 체중(kg)과 키(m)를 입력받아 BMI지수를 반환하는 calculate()와 BMI지수를 통해 비만도 결과를 반환하는 result()
		 * 메소드를 완성하여, 출력 예와 같은 결과를 얻으시오.
		 * 
		 * 예 : BMI : 26.34(81.6kg, 1.76m) 결과 : 과체중 입니다.
		 * 비만 : 30이상
		 * 과체중 25이상~30미만
		 * 정상 18.5이상 25미만
		 * 저체중 18.5 미만
		 */
		double w = 81.6;
		double t = 1.76;
		double bmi = calculate(w, t);
		
		System.out.printf("BMI: %.2f(%.1fkg, %.2fm)\n", bmi,w,t);
		System.out.printf("결과 : %s입니다.\n",result(bmi));
	}

	private static double calculate(double weight, double tall) {
		double BMI = weight/(tall*tall);
		return BMI;
	}
	private static String result(double bmi) {
		String result="";
		if(bmi>=30) {
			return result="비만";
		}else if(bmi<30 && bmi>=25) {
			return result="과체중";
		}else if(bmi<25 && bmi>=18.5) {
			return result="정상";
		}else if(bmi<18.5) {
			return result="저체중";
		}else {
			return result ="초 고도 비만";
		}
		
	}

}
