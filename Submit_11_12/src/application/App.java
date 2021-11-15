package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App {
	private static boolean mIsRunning = true;

	private static ArrayList<Account> mAccounts = new ArrayList<>();

	// 관리자 교수 학생 아이디 1개 씩 보관
	static Admin admin = new Admin();
	static Professor professor = new Professor();
	static Student student = new Student();
	static String[] account = { "admin", "professor", "student" };
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		mAccounts.add(new Account("admin", "admin"));
		mAccounts.add(new Account("professor", "professor"));
		mAccounts.add(new Account("student", "student"));

		/* arrayList의 key값 = id로 하고 */

		// 학사관리 시스템(id, pw) 1,2,3 선택
		// 1. 접속 - 1. 관리자, 2. 교수, 3. 학생
		// 1_1. 관리자 - 신청된 회원등록(admin,admin)
		// 1_2. 교수 - 출석, 과목, 과정설명, 평가 (professor,professor)
		// 1_3. 학생 - 수강신청, 성적확인 (student, student)
		// 2. 학생등록신청 v (id, pw)

		while (mIsRunning) {
			display();
		}//강제 종료시 오류뜨는거 해결해야함.
		scanner.close();
		System.out.println("프로그램을 종료합니다.");
		System.out.println("이용해 주셔서 감사합니다.");
		System.out.println("======================================");
		/*
		*/

	}

	/*
	 * 제일 처음 시작하는 메소드 1,2,3번중 선택 1번 : login 메소드 2번 : makeAccount 메소드 3번 : 프로그램 종료
	 * mIsRunning = false
	 */
	private static void display() { // 실행하자마자 보이는 화면 출력
		Scanner scanner = new Scanner(System.in);
		System.out.println("======================================");
		System.out.println("학 교  종 합  관 리  시 스 템\n");
		System.out.println("1. 접   속\n2. 회원등록\n3. 프로그램 종료\n");
		System.out.println("======================================");
		int action = scanner.nextInt();
		switch (action) {
		case 1: // 로그인 화면을 원하면 1 엔터
			login();
			break;
		case 2: // 회원등록을 원하면 2 엔터
			makeAccount();
			break;
		case 3: // 프로그램 종료를 원하면 3번
			System.out.println("======================================");
			System.out.println();
			System.out.println();
			System.out.println("프로그램을 종료합니다!");
			System.out.println();
			System.out.println();
			System.out.println("======================================");
			mIsRunning = false;
			break;
		default:
			System.out.println("===============warning===============");// 그 외의 숫자는 허용 안함
			System.out.println("\t\t존재하지 않는 기능입니다!");
			System.out.println("======================================");
		}
	}

	private static void login() { // 로그인 화면 admin = 관리자 professor = 교수 student = 학생 로그인
		String id = input_App(1);
		String pw = null;
		int indexNumber = 0;

		String strAppend = mAccounts.toString(); // mAccounts의 모든 값을 스트링으로 변환 후 strAppend 스트링에 입력
		strAppend = strAppend.replace("[", ""); // 대괄호 제거 후 재 할당
		strAppend = strAppend.replace("]", ""); // 대괄호 제거 후 재 할당

		String[] strSplit = strAppend.split(", "); // ,+한칸 띄운거 기준으로 분리해서 배열에 입력
		indexNumber = Arrays.asList(strSplit).indexOf(id); // mAccounts의 key number를 찾기위해
		
		if (id.equals(mAccounts.get(indexNumber).getId())) {
			while (true) {
				pw = input_App(2);
				if (pw.equals(mAccounts.get(indexNumber).getPassword())) {
					if (id == "admin") {
						Admin.admin();
					} else if (id == "professor" || Admin.getJob().equals("professor")) {
						Professor.professor();
					} else if (id == "student" || Admin.getJob().equals("student")) {
						Student.student();
					} else {
						System.out.println("회원정보 : " + id + " (등록 직종 :" + Admin.getJob() + " )");
						System.out.println("권한이 등록되지 않은 회원입니다.");
					}
					break;
				} else {
					passwordWrong();
					mIsRunning = false;
				}
			}
		} else {
			if (pw == null) {
				System.out.println("===============warning================");
				System.out.println("\t\t아이디를 다시 확인해 주세요");
				System.out.println("======================================");
			}
		}
	}

	private static void passwordWrong() { // 비밀번호 틀릴때 호출하는 메소드
		System.out.println("===============warning===============");
		System.out.println();
		System.out.println();
		System.out.println("\t\t비밀번호가 틀렸습니다.");
		System.out.println();
		System.out.println();
		System.out.println("======================================");
	}

	protected static void makeAccount() { // 2번 누르면 회원등록
		while (true) {
			System.out.println("회원 등록을 진행합니다.");
			String job = input_App(3);
			if (job.equals("student")) {
				System.out.println("학생 아이디로 등록진행합니다."); // job에 따라
			} else if (job.equals("professor")) {
				System.out.println("교수 아이디로 등록진행합니다.");
			} else {
				System.out.println("외부인 아이디로 등록진행합니다.");
			}
			String id = input_App(1);
			String password = input_App(2);
			System.out.println("등록신청 되었습니다.");
			mAccounts.add(new Account(id, password));
			admin.setId(id);
			admin.setPassword(password);
			admin.setJob(job);
			break;
		}
	}

	static String input_App(int mode) {
		String result = null;
		switch (mode) {
		case 1:		//인풋 id
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
		case 2:		//인풋 pw
			while (true) {
				System.out.println("비밀번호를 입력하세요!");
				result = scanner.nextLine();

				if (result.trim().isEmpty()) {
					passwordWrong();
				} else {
					break;
				}
			}
			break;
		case 3:		//인풋 job
			while (true) {
				System.out.println("직업을 입력하세요");
				System.out.println("( student / professor / 기타)중 1택");
				result = scanner.nextLine();

				if (result.trim().isEmpty()) {
					passwordWrong();
				} else {
					break;
				}
			}
			break;
		default:
			break;
		}
		return result;
	}
}
