package custom_Exception;

import custom_Exception.exception.TempOutOfRangeException;
import custom_Exception.exception.TempTooHighException;
import custom_Exception.exception.TempTooLowException;
public class Thermostat {
	public void setTemperature(double temperature) throws TempTooLowException, TempTooHighException{
		setMachineTemperature(temperature);
		System.out.println("占승듸옙 占쏙옙占쏙옙 : "+temperature);//占승듸옙 占쏙옙占쏙옙占쏙옙 占쏙옙占?占쏙옙占?
	}

	private void setMachineTemperature(double temperature) throws TempTooLowException, TempTooHighException {
		if(temperature<0) {
			//占승듸옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙처占쏙옙占쏙옙 占싼댐옙. / throw占쏙옙 占싹댐옙 占쏙옙占싱몌옙 占쏙옙占쌩울옙 처占쏙옙
			//( 占쏙옙 占쌨소드를 호占쏙옙 占쏙옙 占쏙옙 처占쏙옙 )
			throw new TempTooLowException("?⑤룄媛 ?덈Т ??뒿?덈떎.");//?덉쇅 ?앹꽦
		}else if(temperature>35){
			throw new TempTooHighException("?⑤룄媛 ?덈Т ?믪뒿?덈떎.");//?덉쇅 ?앹꽦
		}
	}
	
	
	
}
