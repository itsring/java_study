package application;

public class For {

	public static void main(String[] args) {
		// for 반복문 for(초기값;조건;증감) {order;}
		int d=1;		//초기값 1
		int e=0;		//합계의 초기값 0
		while(d<=100) {
			e = d+e;	// 0+1, 1+2, 3+3, 6+4, 10+5, 15+6.../e+=d 
			d = d+1;	// d를 증가 시켜서 e에 더함 / d+=1
		}				//while 문
		
		System.out.println("e : "+ e);
		int a=0;
		for(int i=1; i<=100; i++) {
			a = a+i;	//a+=i
		}				//for문
		
		System.out.println("a : "+ a);
//		for(;;) {
//			System.out.println("Hi");
//		} 	무한 반복
	}

}
