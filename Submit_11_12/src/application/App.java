package application;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	//관리자 교수 학생 아이디 1개 씩 보관
	private static ArrayList<Account> mAccounts = new ArrayList<>();
	public static void main(String[] args) {
		// 학사관리 시스템
		// 1. 접속 - 1. 관리자, 2. 교수, 3. 학생
		// 2. 관리자 - 학생등록 , 교수등록
		// 3. 교수 - 출석, 과목, 과정, 평가
		// 4. 학생 - 수강신청, 점수확인 , 학생 등록 신청  
		
		displayLogin(); /*
		관리자로 접속하면 관리자질문 / 접속 확인 메소드 / 접속 후 뭐 할건지 물어보기  
		교수로 접속하면 교수 질문
		학생으로 접속하면 학생 질문 or 회원가입 안된 학생일 경우 아이디 비밀번호 이름 학번 으로 등록신청
			그 후 다시 로그인 화면 
		
		*/
		

	}

	private static void displayLogin() {
		   Scanner scanner = new Scanner(System.in);
		   //배열을 쓰면 편할거같은뎁...
		   String adminId = "admin";
		   String adminPW = "admin";
		   String studentId = "idstudent";
		   String studentPW = "pwstudent";
		   String professorId="idprofessor";
		   String professorPW="pwprofessor";
		   
	        System.out.print("로그인  ");
	        System.out.println("ID :  ");
	        String action = scanner.next();
	        if(action==adminId) {
	        	System.out.println("PASSWORD :  ");
	        	action = scanner.next();
	        	if(action==adminPW) {
	        		System.out.println("관리자로 접속합니다.");	        		
	        	}
	        }
	        
	            
		      
	        
		
	}
}