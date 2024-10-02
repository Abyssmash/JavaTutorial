package _16_Sugang;

import java.util.ArrayList;
import java.util.Scanner;

public class StudyMenu {
	
	static ArrayList <String> study = new ArrayList<>();
	
		public static void mainMenu() {
		// TODO Auto-generated method stub
		while(true) {
			Scanner in = new Scanner(System.in);
			System.out.println("--교과목 관리 프로그램--");
			System.out.println("1. 교과목 등록");
			System.out.println("2. 수강 과목 검색");
			System.out.println("3. 전체 과목 리스트");
			int num = in.nextInt();
			in.nextLine();
			if(num==1) {
				add();
			}else if(num==2) {
				search();
			}else if(num==3) {
				allList();
			}	
		}	
	}
		public static void add() {
			Scanner in = new Scanner(System.in);
			System.out.println("등록할 교과목의 이름을 입력해주세요.");
			String className = in.nextLine();
			System.out.println("등록할 교과목의 강의실을 입력해주세요.");
			String classRoom = in.nextLine();
			System.out.println("등록할 교과목의 교수명을 입력해주세요.");
			String professor = in.nextLine();
			for(int i = 0; i < study.size(); i++) {
				if(study.get(i)==null) {
					study.add();
				}
			}
		}
		public static void search() {
			
		}
		public static void allList() {
			
		}

}
