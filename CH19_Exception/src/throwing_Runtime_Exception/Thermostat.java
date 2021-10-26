package throwing_Runtime_Exception;

public class Thermostat {
	public void setTemperature(double temperature) throws Exception{
		setMachineTemperature(temperature);
		System.out.println("占승듸옙 占쏙옙占쏙옙 : "+temperature);//占승듸옙 占쏙옙占쏙옙占쏙옙 占쏙옙占?占쏙옙占?
	}

	private void setMachineTemperature(double temperature) throws Exception {
		if(temperature<0 || temperature>35) {
			//占승듸옙占쏙옙 占쏙옙占쏙옙占쏙옙占쏙옙占쏙옙 占쏙옙占쏙옙처占쏙옙占쏙옙 占싼댐옙. / throw占쏙옙 占싹댐옙 占쏙옙占싱몌옙 占쏙옙占쌩울옙 처占쏙옙
			//( 占쏙옙 占쌨소드를 호占쏙옙 占쏙옙 占쏙옙 처占쏙옙 )
			throw new Exception("占승듸옙占쏙옙 占쏙옙占쏙옙占쏙옙占쌉니댐옙.");//占쏙옙占쌤삼옙占쏙옙
		}
	}
	
	
	
}
