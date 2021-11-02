package hello;

import java.util.ArrayList;

public class Main12 {

	public static void main(String[] args) {
		// for and continue
		int i;
		for(i=0; i<5; i++) {
			if(i==3) {
				continue;
			}
			System.out.println(i); // 3뺴고 나옴 3일때는 다음 실행문으로 넘어가란 뜻
		}
		
	}

}
