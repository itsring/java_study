package throwing_Runtime_Exception;

public class App {

	public static void main(String[] args) {
		// 占쏙옙占쏙옙 처占쏙옙占쏙옙 占싼깍옙
		Thermostat stat = new Thermostat();
		// setTemperature 占쌨소드에占쏙옙 占쏙옙占쏙옙처占쏙옙占쏙옙 throw占쌩깍옙 占쏙옙占쏙옙占쏙옙 호占쏙옙 占쏙옙 占쏙옙 처占쏙옙占쌔억옙 占싼댐옙.
		// try-catch占쏙옙 占쌕뤄옙 처占쏙옙, throw占쏙옙 占쎌선占싼깍옙
		try {
			stat.setTemperature(36);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
