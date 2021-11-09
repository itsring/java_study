package application;

import java.util.ArrayList;
import java.util.Scanner;

class Admin {
	String id;
	String Password;
	private static ArrayList<Account> mAccounts = new ArrayList<>();
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	static void admin() {

		while (true) {
			System.out.println("회원 등록을 진행합니다.");

			String id = input(1);
			String password = input(2);

			System.out.println("등록신청 되었습니다.");
			mAccounts.add(new Account(id, password));
			break;

		}
	}

	static String input(int mode) {
		Scanner scanner = new Scanner(System.in);
		String result = null;

		switch (mode) {
		case 1:
			while (true) {
				System.out.println("id를 입력하세요!");
				result = scanner.nextLine();

				if (result.trim().isEmpty()) {
					System.out.println("id는 공백을 허용하지 않습니다!");
				} else {
					break;
				}
			}
			break;
		case 2:
			while (true) {
				System.out.println("비밀번호를 입력하세요!");
				result = scanner.nextLine();

				System.out.println("비밀번호 확인을 입력하세요!");
				String passwordCheck = scanner.nextLine();

				if (result.trim().isEmpty() || passwordCheck.trim().isEmpty()) {
					System.out.println("비밀번호 또는 비밀번호 확인이 공백입니다!");
				} else if (!result.equals(passwordCheck)) {
					System.out.println("비밀번호와 비밀번호 확인이 일치하지 않습니다!");
				} else {
					break;
				}
			}
			break;
		}
		return result;
	}
}