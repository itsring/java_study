package hashcode_this;

public class Fox {
	public String name;
	
	public Fox() { //fox�� ���������� this�� �� �ּ�
		System.out.println(this);
		this.name="����";
	}
}
