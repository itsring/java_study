package hello;

import java.util.ArrayList;

public class Main13 {

	public static void main(String[] args) {
		//for, break
		int i;
		for(i=0; i<5; i++) {
			if(i==3) {
				break;
			}
			System.out.println(i); //3부터 출력안됨
		}
	}

}
