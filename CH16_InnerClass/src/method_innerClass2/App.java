package method_innerClass2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

//import com.sun.tools.javac.code.Printer;

public class App {
	private String name;

	public String getName() {
		return name;
	}

	public App() {
		// �⺻ ������
		name = "�ٸ��ں���";

	}

	public void run() {
//		class Printer implements Runnable {
//
//			@Override
//			public void run() {
//				System.out.println(name); //Ÿ�̸ӷ� �ݺ��� �ڵ� 
//				
//			}// ���� Ŭ�������� ���� Ŭ������ ������밡��
//		}
		//Printer p = new Printer();
		//p.print();
		//==
//		new Printer().print();
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		service.scheduleAtFixedRate(new Runnable() {
			
			@Override
			public void run() {
				System.out.println(name);
				
			}
		}, 0, 1, TimeUnit.SECONDS);
		
	}

	public static void main(String[] args) {
		// �޼ҵ� ���� Ŭ����
		App app = new App();
		app.run();

	}

}
