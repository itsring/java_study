package application;

public class StringArray2 {

	public static void main(String[] args) {
		// String�� �����ڷ���, ���� ������ �ּҰ��� ���´�
		String text = null;
		text = "��ο�";
		System.out.println(text);

		String[] texts = null;
		System.out.println(texts);
		texts = new String[3];//3���� ���ڿ� �迭���� ����
		System.out.println(texts);
		System.out.println();
		texts[0]= new String("����!");
		texts[1]="�ȳ�?";
		texts[2]="�¹���!";
		for(String x : texts) {
			System.out.println(x);
			
		}
	}

}
