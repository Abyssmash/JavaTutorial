package _16_Sugang;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMenu {
	
	static ArrayList <String> student = new ArrayList<>();

	public static void mainMenu() {
		// TODO Auto-generated method stub
		while(true) {
			Scanner in = new Scanner(System.in);
			System.out.println("--학생 관리 프로그램--");
			System.out.println("1. 회원가입");
			System.out.println("2. 이름 검색");
			System.out.println("3. 학생 정보 전체 리스트");
			System.out.println("4. 가입 정보 삭제");
			int num = in.nextInt();
			in.nextLine();
			if(num==1) {
				signUp();
			}else if(num==2) {
				search();
			}else if(num==3) {
				allList();
			}else if(num==4) {
				del();
			}
		}
	}
	public static void signUp() {
		Scanner in = new Scanner(System.in);
		System.out.println("--회원가입--");
		System.out.println("아이디를 입력해주세요.");
		String Id = in.nextLine();
		System.out.println("이름을 입력해주세요.");
		String name = in.nextLine();
		System.out.println("전화번호를 입력해주세요.");
		String phoneNum = in.nextLine();
		System.out.println("학년을 입력해주세요.");
		String grade = in.nextLine();
		Student nId = new Student();
		for(int i = 0; i < student.size(); i++) {
			if(student.get(i).equals(Id)) {
				System.out.println("아이디가 중복되었습니다.");
			} else {
				nId.Id = Id;
				nId.name = name;
				nId.phoneNum = phoneNum;
				nId.grade = grade;
				student.add(nId);
				System.out.println("가입되었습니다.");
			}
			nId=null;
		}
	}
	public static void search() {
		Scanner in = new Scanner(System.in);
		System.out.println("이름 검색창입니다.");
		System.out.println("검색할 이름을 입력해주세요.");
		String uname = in.nextLine();
		for(int i = 0; i < student.size(); i++) {
			if(student.get(i).equals(uname)) {
				System.out.println(student.get(i));
			} else {
				System.out.println("등록된 정보가 없습니다.");
			}
		}
	}
	public static void allList() {
		Scanner in = new Scanner(System.in);
		System.out.println("학생 전체 정보 조회 시스템입니다.");
		System.out.println("ID를 입력해주세요.");
		String Id = in.nextLine();
		for(int i = 0; i < student.size(); i++) {
			if(student.get(i).equals(Id)) {
				System.out.println("학생 정보");
				System.out.println(student.get(i));
				System.out.println("수강 강의 갯수: ");
			}	
		}
	}
	public static void del() {
		Scanner in = new Scanner(System.in);
		System.out.println("가입 정보 삭제");
		System.out.println("삭제를 원하신다면 ID를 입력주세요.");
		String Id = in.nextLine();
		
	}
}
