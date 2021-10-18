package application;

public class Cat {
	private String name; // ����� �̸�
	private static int count=0;//������ ������� ����
	//final �� ������ �ʴ� ��� ����
	//static �ǹ� : ��ü���� ��������
	public static final String FOOD = "����� ���";
	public Cat(String name) {//�����ڴ� ���� Ÿ���� ����
		this.name = name;
		count++;//����� ��ü ������ ����ƽ count�� 1+��
	}

	public String toString() {//toString �޼ҵ� �ڵ����� 
		return "Cat [name=" + name + "]";
	}
	public static int getCount() { //static �޼ҵ�
//		String n = name; static �޼ҵ忡�� �ν��Ͻ�(��ü) ������ ����� �� ����.
		
		return count;
	}
	
	
}
