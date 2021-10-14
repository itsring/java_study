package returnValue;

public class App {

	public static void main(String[] args) {
		ReturnValue value1= new ReturnValue();
		System.out.println(value1.getAnimal());
		String ani = value1.getAnimal();
		System.out.println(ani);
	}

}
