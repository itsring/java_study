package application;

public class Increment {

	public static void main(String[] args) {
		// 1씩 증가 감소
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
//		++count = 다른 연산 수행전 1 증가
//		count++ = 다른 연산 수행 후 1 증가
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
