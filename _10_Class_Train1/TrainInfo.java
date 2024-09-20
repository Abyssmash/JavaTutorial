package _10_Class_Train1;

import java.util.Scanner;

public class TrainInfo {
		TrainOne[] Train= new TrainOne[4];
		Scanner in=new Scanner(System.in);
		TrainInfo(){
			int selNum = 0;
			while(true) {
				menu();
				System.out.println("번호를 입력하시오");
				selNum=in.nextInt();
				in.nextLine();
				if(selNum == 1) {
					trainAdd();
				} else if(selNum == 2) {
					trainView();
				} else if(selNum == 3) {
					trainRe();
				} 
			}
		}
		public void menu(){
			System.out.println("1. 기차시간 등록하기");
			System.out.println("2. 기차 전체보기");
			System.out.println("3. 기차시간 수정하기");
		}
		public void trainAdd() {
			TrainOne temp = new TrainOne();
			System.out.println("기차 번호를 입력하세요");
			temp.trainNum=in.nextLine();
			System.out.println("기차시간을 시,분 순서로 입력하시오");
			temp.trainTime=in.nextLine();
			int maxSize=Train.length;
			for(int i=0; i < maxSize; i++) {
				if(Train[i]==null) {
					Train[i]=temp;
					break;
				}
			}
		}
		public void trainView() {
			int maxSize=Train.length;
			for(int i=0; i < maxSize; i++) {
				if(Train[i]!=null) {
					Train[i].prt();
				}
			}
		}
		public void trainRe() {
			System.out.println("시간을 변경하려는 기차번호를 입력하고 시간을 입력하시오");
			String inNum=in.nextLine();
			String newNum=in.nextLine();
			int maxSize=Train.length;
			for(int i=0; i < maxSize; i++) {
				if(Train[i]!=null) {
					if(Train[i].trainNum.equals((inNum)))
						Train[i].trainTime=newNum;
						break;
				}
			}		
		}
}
