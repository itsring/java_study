package timer_Example;

import java.util.Timer;
import java.util.TimerTask;
// �ϳ��� ���Ͽ� �������� Ŭ������ ���� �� �ֵ�. 
//�׷��� public class �� �� �ϳ��̰� ������ �̸��� ����.
class Task extends TimerTask{
	@Override
	public void run() {
		// TODO Auto-generated method stub
	System.out.println("��ο�");	
	}	
};

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task(), 0, 1000);
		//���� : run(), �ð� 0�ʵ� ���� > �ݺ� 1�� �ֱ�
	}

}


