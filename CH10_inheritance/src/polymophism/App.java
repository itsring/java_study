package polymophism;

public class App {

	public static void main(String[] args) {
		// ��ü�� ��ӹ��� Cat Ÿ������ ���� 
		/*Cat cat1 = new HouseCat();
		cat1.vocal();
		cat1.hunt();
		
		Cat cat2 = new RoadCat();
		cat2.vocal();
		cat2.hunt();
		
		Cat cat3 = new Tiger();
		cat3.vocal();
		cat3.hunt();
		*/
		Cat[] cats= {new HouseCat(), new RoadCat(), new Tiger()};
		//				cats[0] 	   cats[1]		  cats[2]
		cats[0].vocal();
		cats[0].hunt();
		cats[1].vocal();
		cats[1].hunt();
		cats[2].vocal();
		cats[2].hunt();
		
		for(int i=0; i<cats.length;i++) {
			cats[i].vocal();
			cats[i].hunt();
		}
		
		for(Cat c:cats) {
			c.vocal();
			c.hunt();
		}
		//����ȯ casting
		//�⺻Ÿ��
		int b = (int)1.123456;
		System.out.println(b);
		
		//����Ÿ�� : �⺻�� ������Ŭ���� Ÿ�� ��
		Cat cat1 = new HouseCat(); // ��ĳ����
		cat1.vocal();
		cat1.hunt();
		
		//�ٿ� ĳ����  (Ÿ���� �ٽ� ���� Ŭ������ ��ȯ)
		HouseCat cat2 = (HouseCat)cat1;
		cat2.vocal();
		/*======================================================*/
		
		
	}

}
