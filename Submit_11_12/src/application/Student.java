package application;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
	static String id;
	static String Password;
	static ArrayList<Account> subject = new ArrayList<>();
	static Professor professor = new Professor();
	public static String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public static String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
	static void student() {
		System.out.println("학생 아이디로 접속하였습니다.");
		boolean stay = true;
		while (stay) {
			boolean yOrN = true;
			System.out.println("======================");
			System.out.println("원하시는 기능을 선택해주세요.");
			System.out.println("1. 수강신청");
			System.out.println("2. 성적확인");
			System.out.println("======================");
			Scanner scanner = new Scanner(System.in);
			int action = scanner.nextInt();
			boolean repeat = true;
			String pw = null;
			switch (action) {
			case 1:
				System.out.println("======================");
				System.out.println("1. 수강신청를 선택하였습니다.");
				System.out.println("수업 리스트 ==========");
				
				subject.add(new Account(getId(), getPassword()));
				int count=1;
				for (Account n : subject) {
					repeat = true;
					while (repeat) {
						System.out.println(n.getPassword()+". "+n.getId());
						pw = scanner.next();
						if (pw.equals("o") || pw.equals("x")) {
							System.out.println("수강신청이 완료되었습니다.");
							repeat = false;
						} else {
							System.out.println("======================");
							System.out.println(" 'o' 또는 'x' 를 입력해주세요");
							System.out.println("======================");
							repeat = true;
						}
						count++;
					}
				}
				System.out.println("======================");
				break;
			case 2:
				System.out.println("======================");
				System.out.println("2. 성적 환인을 선택하였습니다.");
				System.out.println("======================");
				Professor.Result();
				break;
			default:
				break;
			}
			while (yOrN) {
				System.out.println("======================");
				System.out.println("로그아웃 하시겠습니까? (y,n)");
				System.out.println("======================");
				pw = scanner.next();
				if (pw.equals("y")) {
					stay = false;
					yOrN = false;
				} else if (pw.equals("n")) {
					stay = true;
					yOrN = false;
				} else {
					System.out.println("======================");
					System.out.println("y또는 n을 입력해주세요");
					System.out.println("======================");
					yOrN = true;

				}
			}
		}
	}
}
