package application;

public class MultiArray {

	public static void main(String[] args) {
		// 이중 배열
		String[][] texts= {
				{"하나","둘","셋"},
				{"넷","다섯","여섯"},
				{"일곱","여덟","아홉"},
		};
		for(int i=0; i<texts.length;i++) {
			String[] innerArray=texts[i]; //행 선택
			
			for(int j=0; j<innerArray.length;j++) {
				System.out.printf("%s\t", innerArray[j]);
			}// 선택된 행에 있는 열 탭으로 띄워서 열거
			System.out.println();
		}
	}

}
