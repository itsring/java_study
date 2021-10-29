package question2;

public class Lotto {
//출력 예 
	//생성번호 : 6 16 11 30 24 44 
	public static void main(String[] args) {
		// 객체생성
		
		LottoMachine machine = new LottoMachine();
		int[] numbers = machine.getLottoNumbers();
		
		System.out.print("생성 번호 : ");
		for(int i : numbers) {
			System.out.printf("%d ",i);
		}
	}

}
