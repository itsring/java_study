package anonymous_Class;

public class App {
	private String name = "���";
	
	public static void main(String[] args) {
		new App().start();
	}
	private void start() {
//		System.out.println(name);
//		Runnable runner = new Runnable() {//�̸� ���� Ŭ���� (�͸� Ŭ���� ����)
//			public void run() {
//				System.out.println(name);//���� Ŭ������ �ܺ� Ŭ�����Ǻ��� ��� 				
//			}
//		};
//		activate(runner);
		activate(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(name);
			}
		});
	}
	private void activate(Runnable runnable) {
		runnable.run();//�߻� �޼ҵ� ����
	}
}
