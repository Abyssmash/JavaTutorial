package ArrayListProject;

import java.util.Scanner;

public class Menu {
		
	Menu(){
		// 검색 등록 삭제 조회
		while(true) {
			System.out.println("---아파트 주차 등록 시스템입니다.---");
			System.out.println("기능을 선택해주세요.");
			System.out.println("----------------------------");
			Scanner in = new Scanner(System.in);
			System.out.println("1. 차량 검색");
			System.out.println("2. 차량 등록(입주민 전용)");
			System.out.println("3. 전체 정보 삭제 (이사 전용)");
			System.out.println("4. 등록 차량 수정");
			System.out.println("5. 세대별 차량 조회"); // 몇동 몇호에 몇대 등록되어있는지
			int selNum = in.nextInt();
			in.nextLine();
			if(selNum == 1) {
				search();
			}else if(selNum == 2) {
				add();
			}else if(selNum == 3) {
				allDel();
			}else if(selNum == 4) {
				edit();
			}else if(selNum == 5) {
				show();
			}
		}
	}
	public void search() {
		Scanner in = new Scanner(System.in);
		System.out.println("차량의 번호를 입력해주세요");
		String carNum = in.nextLine();
		if(carList!=null)
		
	}
	public void add() {
		System.out.println("차량 등록");
			
	}
	public void allDel() {
		
	}
	public void edit() {
		
	}
	public void show() {
		
	}
}
