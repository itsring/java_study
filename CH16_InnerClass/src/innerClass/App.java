package innerClass;

public class App implements Runnable {

	private String name = "��Ű���콺";

	public static void main(String[] args) {
		new App().start();
	}

	private void start() {
		/*
		 * activate �޼ҵ� ���� ��� 
		 * 1. App Ŭ������ Runnable ����
		 */
		activate(this);//this = App.start()�� �����ϱ� ���� run �޼ҵ� ���� 
		/*
		 * 2. �͸�Ŭ����
		 */
		activate(new Runnable() { // new Runnable() �� �̸��� ���� Ŭ����

			@Override
			public void run() {
				System.out.println(name);

			}
		});
		/*
		 * 3. �޼ҵ� �̳� Ŭ����
		 */
		class Runner1 implements Runnable {
			public void run() {
				System.out.println(name);
			}
		} // Ŭ���� �ȿ� �޼ҵ带 �ְ� �״�� ��� 

		activate(new Runner1());
	}
	public void activate(Runnable runnable) {
		runnable.run();
	}

	@Override
	public void run() {
		System.out.println(name);
	}
}
