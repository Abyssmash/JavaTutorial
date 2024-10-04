package School;

import java.util.ArrayList;
import java.util.Scanner;

// 교과목 관리 추상화 클래스
public class PartMge {
	
	ArrayList <Part> plist = new ArrayList<>();
	// setter가 필요 없음.
	
	public void menu() {
		Scanner in = new Scanner(System.in);
		while(true) {
		System.out.println("1. 등록");
		System.out.println("2. 전체보기");
		int num = in.nextInt();
		in.nextLine();
		if(num == 1) {
			add();
		}else if(num == 3) {
			list();
		}else {
			break;
		}
	}
}
	public ArrayList<Part> getPlist() {
		return plist;
	}
	public void add() {
		Scanner in =  new Scanner(System.in);
		Part newTemp = new Part();
		System.out.println("과목명 입력");
		String partName = in.nextLine();
		newTemp.setPartName(partName);
		plist.add(newTemp);
		
	}
	public void list() {
		for(int i = 0; i < plist.size(); i++) {
			plist.get(i).prt();
		}
	}
}
