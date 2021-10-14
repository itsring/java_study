package application;

public class MultiArray2 {

	public static void main(String[] args) {
		// 이중배열 part2
		String[][] texts= {
				{"하나","둘","셋"},
				{"넷","다섯","여섯"},
				{"일곱","여덟","아홉"},
		};
		for(int i=0; i<texts.length;i++) {
//			String[] innerArray=texts[i]; //행 선택
			
			for(int j=0; j<texts[i].length;j++) {
				System.out.printf("%s\t", texts[i][j]);
			}// 선택된 행에 있는 열 탭으로 띄워서 열거
			System.out.println();
		}

	}

}
