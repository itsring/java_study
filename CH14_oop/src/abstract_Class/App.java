package abstract_Class;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameObject[] objs = {
				new Player(), 
				new Monster()
		};
		for(GameObject obj: objs) {
			System.out.println(obj);
			obj.describe();
		}
		
//		GameObject go = new GameObject(); �߻� Ŭ������ ��ü�� ������
	}	

}
