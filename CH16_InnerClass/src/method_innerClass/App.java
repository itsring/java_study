package method_innerClass;

public class App {
	private  String name;
	
	public String getName() {
		return name;
	}
	public App() {
		//기본 생성자
		name = "앨리자베스";
		
	}
	public void run() {
		class Printer{
			public void print() {
				System.out.println(name);
			}// 내부 클래스에서 상위 클래스의 변수사용가능
		}
		//Printer p = new Printer();
		//p.print();
		//==
		new Printer().print();
		
	}
	public static void main(String[] args) {
		//메소드 안의 클래스
		App app = new App();
		app.run();
		
	}

}
