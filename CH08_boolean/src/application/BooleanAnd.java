package application;

public class BooleanAnd {

	public static void main(String[] args) {
		// == ����, != �����ʴ�, ! not , && and , || or 
		boolean isRaining = true;//�� ����?
		boolean haveUmbrella =false;//��� �����Գ�?
		boolean takeUmbrella=false;//��� ����?

		if(isRaining) {
			if(haveUmbrella) {
				takeUmbrella = true;
				
			}
		}
		System.out.println("ù��° : " + takeUmbrella);
		if(isRaining&&haveUmbrella) {
			takeUmbrella=true;
		}
		System.out.println("�ι�° : " + takeUmbrella);
		
		//�������� ������
		takeUmbrella=isRaining&&haveUmbrella ? true:false;
		System.out.println("����° : " + takeUmbrella);
		
		
	}

}
