package application;

public class App {
	public static void main(String[] args) {
		// 행맨 프로그램 시작
		Hangman game = new Hangman();
		game.run(); //게임 시작
		game.close();//게임종료
	}

}
