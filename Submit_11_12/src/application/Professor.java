package application;

import java.util.ArrayList;
import java.util.Scanner;

class Professor {
	String id;
	String Password;
	static ArrayList<Account> subject = new ArrayList<>();

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

	static void professor() {
		System.out.println("교수 아이디로 접속하였습니다.");
		boolean stay = true;
		boolean yOrN = true;

		while (stay) {
			System.out.println("======================================");
			System.out.println("원하시는 기능을 선택해주세요.");
			System.out.println("1. 출결관리");
			System.out.println("2. 과목추가");
			System.out.println("3. 과정설명");
			System.out.println("4. 성적평가");
			System.out.println();
			System.out.println("======================================");

			Scanner scanner = new Scanner(System.in);
			int action = scanner.nextInt();

			boolean repeat = true;
			String pw = null;
			switch (action) {
			case 1:
				System.out.println("======================================");
				System.out.println("출결 관리를 선택하였습니다.");
				System.out.println();
				System.out.println();
				System.out.println("학생 리스트 ==========");
				System.out.println("======================================");
				for (int i = 0; i < 10; i++) {
					repeat = true;
					while (repeat) {
						System.out.println("학생" + i);
						pw = scanner.next();
						if (pw.equals("o") || pw.equals("x")) {
							repeat = false;
						} else {
							System.out.println(" 'o' 또는 'x' 를 입력해주세요");
							repeat = true;
						}
					}
				}
				System.out.println("======================================");
				System.out.println();
				System.out.println("출결관리가 완료되었습니다.");
				System.out.println();
				System.out.println("======================================");
				break;
			case 2:
				System.out.println("======================================");
				System.out.println("과목 등록을 진행합니다.");
				System.out.println("======================================");
				String subjectNumber = input_Pf(3);
				String subjectName = input_Pf(4);

				System.out.println("등록 되었습니다.");
				subject.add(new Account(subjectNumber, subjectName));
				break;
			case 3:
				System.out.println("======================================");
				System.out.println("과정설명");
				System.out.println("응용 S/W 개발자 양성 과정");
				System.out.println("1. 기초 프론트 엔드 HTML, CSS, JS");
				System.out.println("2. DBMS(Data Base Management System");
				System.out.println("3. Java Language");
				System.out.println("4. 네트워크 프로그래밍");
				System.out.println("5. 서버 프로그램 구현");
				System.out.println("6. 인터페이스 구현");
				System.out.println("7. 통합 구현");
				System.out.println("8. UI 구현");
				System.out.println("======================================");
			case 4:
				System.out.println("======================================");
				System.out.println("성적 평가");
				System.out.println("======================================");
				Result();
			default:
				break;
			}
			while (yOrN) {
				System.out.println("======================================");
				System.out.println("로그아웃 하시겠습니까? (y,n)");
				System.out.println("======================================");
				pw = scanner.next();
				if (pw.equals("y")) {
					stay = false;
					yOrN = false;
				} else if (pw.equals("n")) {
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

	static String input_Pf(int num) {
		Scanner scanner = new Scanner(System.in);
		String result = null;
		switch (num) {
		case 3:
			while (true) {
				System.out.println("======================================");
				System.out.println("\t\t과목번호를 입력해 주세요.");
				System.out.println("======================================");
				result = scanner.nextLine();
				break;
			}
			break;
		case 4:
			while (true) {
				System.out.println("======================================");
				System.out.println("\t\t과목이름를 입력해주세요");
				System.out.println("======================================");
				result = scanner.nextLine();
				break;
			}
			break;
		}
		return result;
	}

	static void Result() {
		// 학생 성적을 입력받고 학생 성적의 점수에 따라 등급을 나뉨
		System.out.println("======================================");
		System.out.println("학생들의 점수를 랜덤함수로 1~99점까지 생성 후 10명에게 분배");
		System.out.println("======================================");
		ArrayList<Account> grade = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			String stugrade = null;
			int randomGrade = (int) (Math.random() * 100);
			grade.add(new Account("학생" + i, String.valueOf(randomGrade)));
			if (Integer.valueOf(grade.get(i).getPassword()).intValue() < 100
					&& Integer.valueOf(grade.get(i).getPassword()).intValue() >= 90) {
				stugrade = "A+";
			} else if (Integer.valueOf(grade.get(i).getPassword()).intValue() < 90
					&& Integer.valueOf(grade.get(i).getPassword()).intValue() >= 80) {
				stugrade = "A";
			} else if (Integer.valueOf(grade.get(i).getPassword()).intValue() < 80
					&& Integer.valueOf(grade.get(i).getPassword()).intValue() >= 70) {
				stugrade = "B+";
			} else if (Integer.valueOf(grade.get(i).getPassword()).intValue() < 70
					&& Integer.valueOf(grade.get(i).getPassword()).intValue() >= 60) {
				stugrade = "B";
			} else if (Integer.valueOf(grade.get(i).getPassword()).intValue() < 60
					&& Integer.valueOf(grade.get(i).getPassword()).intValue() >= 50) {
				stugrade = "C+";
			} else if (Integer.valueOf(grade.get(i).getPassword()).intValue() < 50
					&& Integer.valueOf(grade.get(i).getPassword()).intValue() >= 40) {
				stugrade = "C";
			} else if (Integer.valueOf(grade.get(i).getPassword()).intValue() < 40
					&& Integer.valueOf(grade.get(i).getPassword()).intValue() >= 30) {
				stugrade = "D";
			} else {
				stugrade = "F";
			}
			System.out.println(grade.get(i) + " : " + stugrade);
		}
	}
}
