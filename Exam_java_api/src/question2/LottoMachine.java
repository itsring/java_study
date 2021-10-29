package question2;

import java.util.Arrays;
import java.util.Collection;
import java.util.Random;

public class LottoMachine {
	private int[] LottoNumbers;

	public LottoMachine() {
		// 로또 번호 생성 초기화
		LottoNumbers = new int[6];
	}

	public int[] generate() {
		int[] pickedNumbers = new int[6];
		Random rand = new Random();
		// 임의의 숫자 6개
		for (int i = 1; i < 6; i++) {
			pickedNumbers[0] = rand.nextInt(46);
			int num = rand.nextInt(46);
			System.out.println(num);
			if (num != 0) {
				for (int j = 0; j < i; j++) {
					if (pickedNumbers[i] != pickedNumbers[j]) {
						pickedNumbers[i] = num;
					} else if (pickedNumbers[i] == pickedNumbers[j]) {
						num = rand.nextInt(46);
						pickedNumbers[i] = num;
					}
				}
			}
		}

		return pickedNumbers;
	}

	public int[] getLottoNumbers() {
		LottoNumbers = generate();
		return LottoNumbers;
	}

}
