package _10_Class_Car;

import java.util.Scanner;

public class Car_m {

		Car_obj[] Clist = new Car_obj[7];
		Scanner in= new Scanner(System.in);
		Car_m(){
			while(true) {
				System.out.println("주차 등록 시스템입니다");
				System.out.println("1. 등록");
				System.out.println("2. 조회");
				System.out.println("3. 전체 보기");
				System.out.println("4. 삭제");	
				System.out.println(" 선택 ");
				int selNum=in.nextInt();
				in.nextLine();
				System.out.println(selNum+"을 선택");
				if(selNum == 1) {
					add();
				} else if(selNum == 2) {
					show();
				} else if(selNum == 3) {
					allList();
				} else if(selNum == 4) {
					del();
				} else {
					break;
				}			
			}
		}
		public void add() {
			System.out.println("차 등록");
			Car_obj car=new Car_obj();
			System.out.println("차 번호를 입력");
			car.num = in.nextInt();
			for(int i=0; i < Clist.length; i++) {
				if(Clist[i] == null) {
					Clist[i]=car;
					break;
				} 
			}
		}
		public void show() {
			System.out.println("차량 조회: 차량 번호 입력");
			int cnum = in.nextInt();
			in.nextLine();
			for(int i=0; i < Clist.length; i++) {
				if(Clist[i].num == cnum ) {
					System.out.println("차량이 주차되어있습니다.");
				} else {
					System.out.println("차량이 없습니다.");
				}
			}
		}
	
		public void allList() {
			System.out.println("주차한 차량 전체 보기");
			for(int i=0; i < Clist.length; i++) {
				if(Clist[i] != null ) {
					Clist[i].prt();
				}
			}
		}
		public void del() {
			System.out.println("삭제: 삭제할 차량번호를 입력하세요");
			int dnum= in.nextInt();
			in.nextLine();
			for(int i=0; i < Clist.length; i++) {
				if(Clist[i].num == dnum) {
					Clist[i] = null;
				}			
		}
	}
}



