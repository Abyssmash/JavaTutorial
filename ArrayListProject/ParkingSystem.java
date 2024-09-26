package ArrayListProject;

import java.util.Scanner;

public class ParkingSystem {
		
		
	ParkingSystem(){
		// 검색 등록 삭제 조회
		while(true) {
			System.out.println("---아파트 주차 등록 시스템입니다.---");
			System.out.println("기능을 선택해주세요.");
			System.out.println("----------------------------");
			Scanner in = new Scanner(System.in);
			System.out.println("1. 전체 정보 삭제 (이사 전용)"); 
			System.out.println("2. 등록 차량 수정");
			System.out.println("3. 세대별 차량 조회"); // 몇동 몇호에 몇대(차량번호) 등록되어있는지
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
	public void userPwd(String pwd) {
		for(int i = 0; i < pwd.length(); i++) {
			if(userPwd.get(i).pwd.equals(pwd)) {
				return=1;
			}
		} return=0;
	}
//	public void search() {
//		Scanner in = new Scanner(System.in);
//		System.out.println("차량의 번호를 입력해주세요");
//		String carNum = in.nextLine();
//		for(int i = 0; i < carList.length; i++) {
//			if(carList!=null)
//				System.out.println("차량 번호가 등록되어 있습니다.");
//		}
//	}
//	public void add() {
//		Scanner in = new Scanner(System.in);
//		String nNum = new String();
//		System.out.println("---입주민 전용 프로그램입니다.---");
//		System.out.println("비밀번호를 입력해주세요.");
//		String pwd = in.nextLine();
//		for(int i = 0; i < pwd.length(); i++) {
//			if(userPwd(word)!=1) {
//				System.out.println("비밀번호가 틀렸습니다.");
//			}else {
//				System.out.println("로그인 되었습니다.");
//				System.out.println("등록할 차량의 번호를 입력해주세요.");
//				String carNum = in.nextLine();
//				nNum.carNum=carNum;		// nNum이라는 문자열에 새로 입력한 번호 넣고 arraylist에 연결
//				
//				System.out.println("차량 등록이 완료되었습니다.");
//			}
//		}
//	}
	public void allDel() {
		Scanner in = new Scanner(System.in);
		System.out.println("---입주민 전용 프로그램입니다.---");
		System.out.println("비밀번호를 입력해주세요.");
		String userPwd = in.nextLine();
		for(int i = 0; i < pwd.length(); i++) {
			if(userPwd(pwd)!=1) {
				System.out.println("비밀번호가 틀렸습니다.");
			}else {
				System.out.println("로그인 되었습니다.");
				System.out.println("전체 정보 삭제를 원하신다면");
				System.out.println("이름과 비밀번호를 다시 입력해주세요.");
				System.out.println("이름");
				String uName = in.nextLine();
				System.out.println("비밀번호");
				String pwd = in.nextLine();
				for(int i = 0; i < host.length(); i++) {
					if(host!=null) {
						host.remove(i).prt(); 
						System.out.println("정보가 삭제되었습니다.");
					} else {
						System.out.println("이름과 비밀번호가 틀렸습니다.");
					}
				}
			}
		}	
	}
	public void edit() {
		 Scanner in = new Scanner(System.in);
		 System.out.println("---입주민 전용 프로그램입니다.---");
		 System.out.println("비밀번호를 입력해주세요.");
		 String userPwd = in.nextLine();
			for(int i = 0; i < pwd.length(); i++) {
				if(userPwd(pwd)!=1) {
					System.out.println("비밀번호가 틀렸습니다.");
				}else {
					System.out.println("로그인 되었습니다.");
					System.out.println("수정할 등록 차량 번호를 입력해주세요.");
					String eNum = in.nextLine();
					for(int i = 0; i < carList.length(); i++) {
						if(carList.get(i).equals.eNum) {
							carList.get(i).remove(i) ;
							System.out.println("등록할 차량 번호를 다시 입력해주세요.");
							String nNum = in.nextLine();
							carList.add(i) ;
							System.out.println("차량 번호가 수정되었습니다.");
						}else{
							System.out.println("차량이 조회되지 않습니다.");
						}
					}	
				}
			}
	}
	public void show() {
		 Scanner in = new Scanner(System.in);
		 System.out.println("---입주민 전용 프로그램입니다.---");
		 System.out.println("비밀번호를 입력해주세요."); 
		 String userPwd = in.nextLine();
			for(int i = 0; i < pwd.length(); i++) {
				if(userPwd(pwd)!=1) {
					System.out.println("비밀번호가 틀렸습니다.");
				}else {
					System.out.println("로그인 되었습니다.");
					System.out.println("조회할 회원의 이름을 입력해주세요.");
					String userName = in.nextLine();
					System.out.println("비밀번호를 입력해주세요.");
					String userPwd = in.nextLine();
					for(int i = 0; i < host.length; i++) {
						if(host!=null) {
							System.out.println(host+carList);
					}
				}
			}
		}
	}
}
