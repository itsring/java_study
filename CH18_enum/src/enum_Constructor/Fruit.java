package enum_Constructor;

public enum Fruit {//enum�� ������� ���� / ��� : ������ �ʴ� ��
	APPLE("�ʷ�"), BANANA("���"), ORANGE("��������"); // ��� �ٳ��� ������ ����
	private String color;
	Fruit(String color) {
		this.color = color;
		System.out.println("�⺻ enum ������");
	}
	public String toString() {
		return super.toString()+"("+color+")";
	}
}
