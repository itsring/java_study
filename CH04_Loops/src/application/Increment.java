package application;

public class Increment {

	public static void main(String[] args) {
		// 1�� ���� ����
		int count =0;
//		while(count<2) {
//			int count2 =1;
//			while(count2<4) {
//				++count2;
//				System.out.println(count2);
//			}
//			while(count2>0) {
//				System.out.println(count2);
//				--count2;
//			}
//			count+=1;
//		}
		count = count+1;
		System.out.println(count);
		count+=1;
		System.out.println(count);
		count++;
		System.out.println(count);
		++count;
		System.out.println(count);
//		++count = �ٸ� ���� ������ 1 ����
//		count++ = �ٸ� ���� ���� �� 1 ����
		--count;
		System.out.println(count);
		count--;
		System.out.println(count);
		count-=1;
		System.out.println(count);
		count= count-1;
		System.out.println(count);
	}

}
