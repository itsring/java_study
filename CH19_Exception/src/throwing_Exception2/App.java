package throwing_Exception2;

public class App {

	public static void main(String[] args) {
		// ���� ó���� �ѱ�
		Thermostat stat = new Thermostat();
		// setTemperature �޼ҵ忡�� ����ó���� throw�߱� ������ ȣ�� �� �� ó���ؾ� �Ѵ�.
		// try-catch�� �ٷ� ó��, throw�� �켱�ѱ�
		try {
			stat.setTemperature(36);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
