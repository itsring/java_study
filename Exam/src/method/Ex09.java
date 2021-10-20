package method;

public class Ex09 {

	public static void main(String[] args) {
		/*
		  출생 연도에 따른 12간지 동물의 띠를 출력하도록 printAnimal() 메소드를 완성하고
		  출력 예와 같은 결과를 얻으시오.
		  예 :
		  1986년 -> 호랑이 띠
		  1990년 -> 말띠
		  2000년 -> 용띠 
		 */ 
		printAnimal(1986);
		printAnimal(1990);
		printAnimal(2000);
	}
		private static void printAnimal(int birthYear) {
			String animal="";
			switch (birthYear %12) {
			case 0:
				animal = "원숭이";
				break;
			case 1:
				animal = "닭";
				break;
			case 2:
				animal = "개";
				break;
			case 3:
				animal = "돼지";
				break;
			case 4:
				animal = "쥐";
				break;
			case 5:
				animal = "소";
				break;
			case 6:
				animal = "호랑이";
				break;
			case 7:
				animal = "토끼";
				break;	
			case 8:
				animal = "용";
				break;
			case 9:
				animal = "뱀";
				break;
				
			case 10:
				animal = "말";
				break;
				
			case 11:
				animal = "양";
				break;
				
			default:
				animal = " ERROR!";
				break;
			}
			System.out.printf("%d년 -> %s 띠\n", birthYear, animal);
		}
		

	}


