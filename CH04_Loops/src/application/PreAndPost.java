package application;

public class PreAndPost {

	public static void main(String[] args) {
		// ������������ ��ġ�� ���� ���� �����ϰ� �Ҵ�(=), �Ҵ�(=)�ϰ� ����
		int cats=5;
		System.out.println(cats++); // ���� �� 1���ؼ� ����� 5
		System.out.println(cats);	// ������ 1���Ѱ� ���� ��µǼ� 6
		
		int dogs=3;
		System.out.println(++dogs);	// ������ 1 ���ؼ� ����� 4
		
		int chickens =10;
		
		int animals=cats + chickens++;	// ����̴� ������ 6 ġŲ�� ���� �� ���ϴ� 10
		
		System.out.println(animals);	// 6+10
		
		int apples=5;
		int bananas=4;
		
		int fruits=++apples+ bananas++;	//����� ���� ���� ���ؼ� 6 �ٳ����� ������ ���ؼ� 4
		System.out.println(fruits);		//����� 6+4
	}

}
