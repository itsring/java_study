package staticMethod;

public class Cat {
	private String name; // ����� �̸�
	private int id; // ����� id
	private static int count=0;//������ ������� ����
	//final �� ������ �ʴ� ��� ����
	//static �ǹ� : ��ü���� ��������
	public static final String FOOD = "����� ���";
	public Cat(String name) {//�����ڴ� ���� Ÿ���� ����
		this.name = name;
		//�ڵ� �߰�
		count++;//����� ��ü ������ ����ƽ count�� 1+��
		id =count;
	}

	public String toString() {//toString �޼ҵ� �ڵ����� 
		return "����� [���̵� = " + id + ", �̸� = "+ name + "]";
	}
	public static int getCount() { //static �޼ҵ�
//		String n = name; static �޼ҵ忡�� �ν��Ͻ�(��ü) ������ ����� �� ����.
		
		return count;
	}
	
	
}
