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
			displayWord(); // 화면에 단어표시
			getUserInput(); // 입력받음
			checkUserInput(); // 맞는지 체크 다맞으면 running = false

		} while (running);
	}

	private void checkUserInput() {
		// 유저가 단어 철자를 다 맞췄는지 체크 해서 게임을 종료한다.
		// 게임종료 확인하는 메소드 isComplete 만들기
		boolean isCorrect = word.addGuess(lastGuess);

		if (isCorrect) {
			if (word.isCompleted()) {
				System.out.println("잘 맞췄어요");
				System.out.println("시도횟수: "+ remainTries);				
				System.out.println("정답은 : " + word);
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
			System.out.println("남은 횟수 : "+remainTries);
		}
//		System.out.println("체크");

	}

	

	private void showSelectWord() {
		// TODO Auto-generated method stub
		
		word.showSelectWord();
		
	}

	private void getUserInput() {
		// 유저에게 한 문자 입력 요구
		// 입력받은 문자열에서 그 문자를 뽑아서 RandomWord 객체에 전달 => addGuess(문자) 메소드
		System.out.print("한 문자 입력 : ");
		String guess = scanner.nextLine();
//		word.addGuess(guess.charAt(0));
		lastGuess = guess.charAt(0);

	}

	private void displayWord() {
		// 랜덤 단어 출력
		System.out.println(word.toString());
	}

	public void close() {
		// 게임 종료시 스캐너 닫기
		scanner.close();
	}

}
