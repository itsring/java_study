package throwing_Exception;

public class App {

	public static void main(String[] args) throws Exception {
		// ���� ó���� �ѱ�
		Thermostat stat = new Thermostat();
		//setTemperature �޼ҵ忡�� ����ó���� throw�߱� ������ ȣ�� �� �� ó���ؾ� �Ѵ�.
		//try-catch�� �ٷ� ó��, throw�� �켱�ѱ�
		stat.setTemperature(36);
		}

}
