package method_innerClass;

public class App {
	private  String name;
	
	public String getName() {
		return name;
	}
	public App() {
		//�⺻ ������
		name = "�ٸ��ں���";
		
	}
	public void run() {
		class Printer{
			public void print() {
				System.out.println(name);
			}// ���� Ŭ�������� ���� Ŭ������ ������밡��
		}
		//Printer p = new Printer();
		//p.print();
		//==
		new Printer().print();
		
	}
	public static void main(String[] args) {
		//�޼ҵ� ���� Ŭ����
		App app = new App();
		app.run();
		
	}

}
