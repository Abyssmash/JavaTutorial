package _16_Sugang;

import java.util.Scanner;

public class MainMenu {
	//메인 메뉴는 학생관리, 교과목관리이다.   <선택> 로그인이 있다.
	
	StudentMenu studentMenu = null;
	StudyMenu studyMenu = null; 
	
	MainMenu(){
		if(studentMenu == null) {
			studentMenu = new StudentMenu();
		}
		if(studyMenu == null) {
			studyMenu = new StudyMenu();
		}
		mainMenu();
	}
	
	public static void mainMenu(){
			while(true) {
			Scanner in = new Scanner(System.in);
			System.out.println("< 땡땡대학교 홈페이지 >");
			System.out.println(" 이용할 서비스를 선택해주세요. ");
			System.out.println("1. 학생 관리");
			System.out.println("2. 교과목 관리");
			int num = in.nextInt();
			in.nextLine();
			if(num == 1) {
				StudentMenu.mainMenu();
			}else if(num == 2) {
				StudyMenu.mainMenu();
			}
		}
	}

	public void logIn() {
		// TODO Auto-generated method stub
		
	}

}
