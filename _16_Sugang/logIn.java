package _16_Sugang;

import java.util.Scanner;

public class logIn {
	
	MainMenu mainMenu = null;
	Student student = null;
	Study study = null;
	
	logIn(){
	
	if(mainMenu == null) {
		mainMenu = new MainMenu();
	}
	if(student == null) {
		student = new Student();
	}
	if(study == null) {
		study = new Study();
	}
	logIn();
}
	
	public void logIn(){
		while(true) {
		Scanner in = new Scanner(System.in);
		System.out.println("< 땡땡대학교 홈페이지 >");
		System.out.println("--Log In--");
		System.out.println("아이디를 입력해주세요.");
		String tId = in.nextLine();
			for(int i = 0; i < Student.student.size(); i++) {
				if(Student.student.get(i).equals(tId)) {
					System.out.println("로그인 되었습니다.");
					mainMenu.logIn();
				} else {
					 System.out.println("아이디가 틀렸습니다.");
				}
			}
		}	
	}
}
