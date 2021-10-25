package throwing_Exception2;

public class Thermostat {
	public void setTemperature(double temperature) throws Exception{
		setMachineTemperature(temperature);
		System.out.println("온도 세팅 : "+temperature);//온도 정상일 경우 출력
	}

	private void setMachineTemperature(double temperature) throws Exception {
		if(temperature<0 || temperature>35) {
			//온도가 비정상으로 예외처리를 한다. / throw는 일단 예이를 나중에 처리
			//( 이 메소드를 호출 할 때 처리 )
			throw new Exception("온도가 비정상입니다.");//예외생성
		}
	}
	
	
	
}
