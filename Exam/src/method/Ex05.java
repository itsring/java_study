package method;

public class Ex05 {

	public static void main(String[] args) {
		/*
		 * 체력과 마력이동시에 2000이상이여야만 착용이 가능한 아이템이 있다.
		 * 체력과 마력을 입력하여 착용 결과를 출력하는 메소드 wear()을 오나성하고
		 * 출력 예와 같은 결과를 얻으시오.
		 * 예
		 * 아이템장착완료!
		 * 아이템을 착용할 수 없습니다. 
		 */
		wear(2400,3000);
		wear(3800,1200);
	}
	public static void wear(int hp, int mp) {
		if(hp>=2000 && mp >= 2000) {
			System.out.println("아이템 장착 완료!");
		}else {
			System.out.println("아이템을 착용할 수 없습니다.");			
		}
	}
}
