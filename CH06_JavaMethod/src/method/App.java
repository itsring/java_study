package method;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1.name); // nell�� �ʱⰪ
		System.out.println(p1.age);//int 0�� �ʱⰪ
		p1.sayHello();//�޼ҵ� ȣ��
		
		p1.name="���";
		p1.age =10;
		System.out.println(p1.name); // nell�� �ʱⰪ
		System.out.println(p1.age);//int 0�� �ʱⰪ
		p1.sayHello();//�޼ҵ� ȣ��
		
		Person p2= new Person();
		p2.name ="�浿";
		p2.sayHello();//�޼ҵ� ȣ��
		Person p3= new Person();
		p3.name = "���̾�";
		p3.sayHello();//�޼ҵ� ȣ��
	}

}
