package application;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] values= {
				{1,5,7},
				{9,6,3},
				{2,4,6},
				{1,2,3,4,5}
		};
		int total =0;
		for(int i=0; i<values.length;i++) {
//			String[] innerArray=valus[i]; //�� ����
			
			for(int j=0; j<values[i].length;j++) {
				System.out.printf("%s\t", values[i][j]);
				total+=values[i][j];
			}// ���õ� �࿡ �ִ� �� ������ ����� ����
			System.out.println();
		}
		System.out.println("�� ���� : "+total);
	}

}
