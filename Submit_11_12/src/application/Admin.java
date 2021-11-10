package application;

import java.util.ArrayList;
import java.util.Scanner;

class Admin {
	static String id;
	static String Password;
	static String job;
	private static ArrayList<Account> mAccounts = new ArrayList<>();
	

	public static String getJob() {
		return job;
	}

	public void setJob(String job) {
		Admin.job = job;
	}

	public static String getId() {
		return id;
	}

	public void setId(String id) {
		Admin.id = id;
	}

	public static String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Admin.Password = password;
	}

	static void admin() {
		boolean stay = true;
		
		Scanner scanner = new Scanner(System.in);
		while (stay) {
			boolean yOrN = true;
			System.out.printf("등록 신청된 회원 : ID : %s, PW : %s, JOB : %s \n",
					getId(), getPassword(), getJob());
			mAccounts.add(new Account(getId(), getPassword()));
			System.out.println("확인");
			
			while (yOrN) {
				System.out.println("======================================");
				System.out.println("로그아웃 하시겠습니까? (y,n)");
				System.out.println("======================================");
				String answer = scanner.next();
				if (answer.equals("y")) {
					scanner.close();
					stay = false;
					yOrN = false;
				} else if (answer.equals("n")) {
					stay = true;
					yOrN = false;
				} else {
					System.out.println("======================================");
					System.out.println("y또는 n을 입력해주세요");
					System.out.println("======================================");
					yOrN = true;
				}
			}
		}
	}

}