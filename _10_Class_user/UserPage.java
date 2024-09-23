package _10_Class_user;

import java.util.Scanner;

public class UserPage {
			
			UserOne[] uList = new UserOne[5];
			EventOne[] eList = new EventOne[5];
			Scanner in = new Scanner(System.in);
			
			UserPage(){
				while(true) {
				System.out.println("고객 관리 및 이벤트 관리 프로그램입니다.");
				System.out.println("원하시는 기능을 선택해주세요.");
				System.out.println("1. 고객 가입");
				System.out.println("2. 고객 정보 보기");
				System.out.println("3. 고객 정보 수정하기");
				System.out.println("4. 고객 정보 삭제하기");
				System.out.println("5. 이벤트 정보 등록하기");
				System.out.println("6. 이벤트 전체보기");
				int selNum = in.nextInt();
				in.nextLine();
				System.out.println(selNum+"번을 선택하셨습니다.");
					if(selNum == 1) {
						uAdd();
					}else if(selNum == 2) {
						uInfo();
					}else if(selNum == 3) {
						uRe();
					}else if(selNum == 4) {
						uDel();
					}else if(selNum == 5) {
						eInfo();
					}else if(selNum == 6) {
						eList();
					}else {
						break;
					}	
				}
			}
			public void uAdd() {
				System.out.println("사용하실 ID를 입력해주세요.");
				UserOne uID = new UserOne();
				System.out.println("이름을 입력해주세요.");
				String UserName = in.nextLine();
				for(int i = 0; i < uList.length; i++) {
					if(uList[i]==null) {
						uList[i]=uID;
					}
				}	
			}
			public void uInfo() {
				System.out.println("찾으실 고객 정보의 ID를 입력해주세요.");
				String UserID = in.nextLine();
				for(int i = 0; i < uList.length; i++) {
					if(uList[i]!=null) {
						uList[i].usr();
					}
				}
			}
			public void uRe() {
				UserOne temp = new UserOne();
				System.out.println("수정할 고객 정보의 ID를 입력해주세요.");
				String UserID = in.nextLine();
				for(int i = 0; i < uList.length; i++) {
					if(uList[i]!=null) {
						if(uList[i]!=null){
							uList[i]= null;
						}
						System.out.println("초기화 되었습니다.");
					}
				}
				UserOne uID = new UserOne();
				System.out.println("고객 정보를 입력해주세요.");
				System.out.println("변경할 ID");
				String UserID = in.nextLine();
				System.out.println("변경할 이름");
				String UserName = in.nextLine();
				for(int i = 0; i < uList.length; i++) {
					if(uList[i]==null) {
						uList[i]=uID;
					}else {
						System.out.println("입력하신 ID와 이름은 중복됩니다.");
					}
				}
			}
			public void uDel() {
				System.out.println("정보를 삭제할 고객의 ID를 입력해주세요.");
				String UserID = in.nextLine();
				for(int i = 0; i < uList.length; i++) {
					if(uList[i]!=null) {
						uList[i]=null;
					}
					System.out.println("고객의 정보 삭제가 정상적으로 처리되었습니다.");
				}
			}
			public void eInfo() {
				System.out.println("이벤트 정보 등록하기");
				EventOne eventName = new EventOne();
				System.out.println("등록할 이벤트의 이름을 입력해주세요.");
				String EventName = in.nextLine();
				System.out.println("이벤트 내용을 입력해주세요");
				String EventCon = in.nextLine();
				for(int j = 0; j < eList.length; j++) {
					if(eList[j]==null) {
						eList[j]=eventName;
					}
					System.out.println("이벤트가 정상적으로 등록되었습니다.");
				}
			}
			public void eList() {
				System.out.println("이벤트 전체보기");
				for(int j=0; j < eList.length; j++) {
					if(eList[j]!=null) {
						eList[j].evt();
					}
				}
			}
}
