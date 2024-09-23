package _10_Class_Train_Ex1;

import java.util.Scanner;

public class T_Center {
	// 기차 여러대를 등록하고 보고 수정하는 역할
	// 기차 여러대를 관리하기 위해서 배열이라는 자료형을 선택
	// 배열이 아니라 tcenter라는 class가 Tone이라는 변수를 의존하고 있기 때문
	
	T_one[] tlist = new T_one[5];
	
	// 생성자는 없는게 아니라 기본이 생략이 된 상태
	public T_Center() {	// 생략이 된 상태
		Scanner in = new Scanner(System.in);
		while(true){
			System.out.println("1. 등록");
			System.out.println("2. 수정");
			System.out.println("3. 전체보기");
			System.out.println("4. 종료");
			System.out.println(" 메뉴 선택 ");
			int selNum = in.nextInt();
			in.nextLine();
			
			if(selNum == 1) {
				add();
			} else if(selNum == 2) {
				mod();
			} else if(selNum == 3) {
				listAll();
			} else if(selNum == 4) {
				
			} 
			
			
					}
				}
	
		private void add() { 
			// 기차시간을 추가
			// T_one 객체를 생성하고 기차번호와 시간을 입력
			Scanner in = new Scanner(System.in);
			T_one tempT = new T_one();
			System.out.println("기차 번호를 입력하세요");
			tempT.tNum = in.nextLine();
			System.out.println("기차 시간을 1102 형식으로 입력");
			tempT.tTime = in.nextLine();
				
			// 배열의 빈칸에 저장, 빈칸은 배열의 값이 null
			for(int i = 0; i < tlist.length; i++) {
				if(tlist[i]==null) {
					tlist[i]=tempT;
					break;
				}
			}

		}
		private void mod() {
			System.out.println("수정할 기차 번호 입력");
			Scanner in = new Scanner(System.in);
			String modNum = in.nextLine();
			
			// 조건을 걸어본다. 기차번호는 유니크하다.
			for (int i = 0; i < tlist.length; i++) {
				
				String mnum = tlist[i].getTnum();
				if(mnum.equals(modNum)) {
				//if(tlist[i].tNum.equals(modNum)) {
					// 기차번호가 유니크 하다는 것은 뒤에 있는 기차 번호랑 중복이 될 수 없다.
					// 그래서 바로 수정이 가능하다.
					System.out.println("수정 시간 입력");
					tlist[i].tTime=in.nextLine();
					break;
				}
			}
		}
		private void listAll() {
			for(int i = 0; i < tlist.length; i++) {
				if(tlist[i]!=null) {
					tlist[i].prt();
				}
			}
		}
}
