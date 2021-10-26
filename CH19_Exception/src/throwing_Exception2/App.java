package throwing_Exception2;

public class App {

	public static void main(String[] args) {
		// 예외 처리를 넘김
		Thermostat stat = new Thermostat();
		// setTemperature 메소드에서 에외처리를 throw했기 때문에 호출 할 때 처리해야 한다.
		// try-catch는 바로 처리, throw는 우선넘김
		try {
			stat.setTemperature(36);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
