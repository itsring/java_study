package application;

public class For {

	public static void main(String[] args) {
		// for �ݺ��� for(�ʱⰪ;����;����) {order;}
		int d=1;		//�ʱⰪ 1
		int e=0;		//�հ��� �ʱⰪ 0
		while(d<=100) {
			e = d+e;	// 0+1, 1+2, 3+3, 6+4, 10+5, 15+6.../e+=d 
			d = d+1;	// d�� ���� ���Ѽ� e�� ���� / d+=1
		}				//while ��
		
		System.out.println("e : "+ e);
		int a=0;
		for(int i=1; i<=100; i++) {
			a = a+i;	//a+=i
		}				//for��
		
		System.out.println("a : "+ a);
//		for(;;) {
//			System.out.println("Hi");
//		} 	���� �ݺ�
	}

}
