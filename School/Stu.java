package School;

import java.util.ArrayList;
import java.util.Scanner;

// 추상화 요구사항의 학생을 멤버변수와 메서드로 정의
public class Stu {
	private String id = null;
	private String name = null;
	private String tel = null;
	private int grade = -1;
	
	private ArrayList <Part> myList = new ArrayList<>();
	private PartMge partMge = null;
	private Scanner in = new Scanner(System.in);
	
	public void prt() {
		System.out.println("id :"+id);
		System.out.println("name :"+name);
	}
	public void menu(PartMge pmge) {
		partMge = pmge;
		Scanner in = new Scanner(System.in);
		while(true) {
		System.out.println("1. 수강신청");
		System.out.println("2. 신청 목록 전체보기");
		int num = in.nextInt();
		in.nextLine();
		if(num == 1) {
			add();
		}else if(num == 2) {
			list();
		}else {
			break;
		}
	}
}
	private void add() {
		// 교과목의 리스트를 보여줘야하는데 이 리스트는 PartMge
		ArrayList <Part> getList = partMge.getPlist();
		for(int i = 0; i < getList.size(); i++) {
			System.out.println("과목번호: "+i);
			getList.get(i).prt();
		}
		System.out.println("번호 선택");
		int choiceNum = in.nextInt();
		in.nextLine();
		myList.add(getList.get(choiceNum));
	}
	private void list() {
		// TODO Auto-generated method stub
		System.out.println("수강신청 목록");
		for(int i = 0; i < myList.size(); i++) {
			myList.get(i).prt();
		}
	}
	public String getId() {
		return id;
	}
	public void setId() {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
}
