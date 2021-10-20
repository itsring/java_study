package application;

import java.util.Scanner;

public class Hangman {

	private boolean running = true;
	private RandomWord word = new RandomWord();
	private Scanner scanner = new Scanner(System.in);
	private int remainTries = 7;
	private char lastGuess;

	public void run() {
		do {
			displayWord(); // ȭ�鿡 �ܾ�ǥ��
			getUserInput(); // �Է¹���
			checkUserInput(); // �´��� üũ �ٸ����� running = false

		} while (running);
	}

	private void checkUserInput() {
		// ������ �ܾ� ö�ڸ� �� ������� üũ �ؼ� ������ �����Ѵ�.
		// �������� Ȯ���ϴ� �޼ҵ� isComplete �����
		boolean isCorrect = word.addGuess(lastGuess);

		if (isCorrect) {
			if (word.isCompleted()) {
				System.out.println("�� ������");
				System.out.println("�õ�Ƚ��: "+ remainTries);				
				System.out.println("������ : " + word);
				running = false;
			}
		}
		else {
			remainTries--;
			if(remainTries == 0) {
				System.out.println("Game Over!");				
				running = false;
				showSelectWord();
			}
			System.out.println("���� Ƚ�� : "+remainTries);
		}
//		System.out.println("üũ");

	}

	

	private void showSelectWord() {
		// TODO Auto-generated method stub
		
		word.showSelectWord();
		
	}

	private void getUserInput() {
		// �������� �� ���� �Է� �䱸
		// �Է¹��� ���ڿ����� �� ���ڸ� �̾Ƽ� RandomWord ��ü�� ���� => addGuess(����) �޼ҵ�
		System.out.print("�� ���� �Է� : ");
		String guess = scanner.nextLine();
//		word.addGuess(guess.charAt(0));
		lastGuess = guess.charAt(0);

	}

	private void displayWord() {
		// ���� �ܾ� ���
		System.out.println(word.toString());
	}

	public void close() {
		// ���� ����� ��ĳ�� �ݱ�
		scanner.close();
	}

}
