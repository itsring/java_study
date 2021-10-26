package custom_Exception;

import custom_Exception.exception.TempTooHighException;
import custom_Exception.exception.TempTooLowException;

public class App {

	public static void main(String[] args) {
		// 占쏙옙占쏙옙 처占쏙옙占쏙옙 占싼깍옙
		Thermostat stat = new Thermostat();
		// setTemperature 占쌨소드에占쏙옙 占쏙옙占쏙옙처占쏙옙占쏙옙 throw占쌩깍옙 占쏙옙占쏙옙占쏙옙 호占쏙옙 占쏙옙 占쏙옙 처占쏙옙占쌔억옙 占싼댐옙.
		// try-catch占쏙옙 占쌕뤄옙 처占쏙옙, throw占쏙옙 占쎌선占싼깍옙
		try {
			stat.setTemperature(-5);

		} catch (TempTooHighException e) {
			// ?⑤룄媛 ??쓣寃쎌슦 泥섎━ 肄붾뱶
			System.out.println(e.getMessage());
		} catch (TempTooLowException e) {
			// ?⑤룄媛 ?믪쓣寃쎌슦 泥섎━ 肄붾뱶
			System.out.println(e.getMessage());
		}
	}
}
