package 자바_평가지;

import java.util.ArrayList;
import java.util.Scanner;

public class dogList {
	
	ArrayList <Dog> hotDog = new ArrayList<>();
	
	dogList(){
		while(true) {
		Scanner in = new Scanner(System.in);
		System.out.println("강아지 info");
		System.out.println("1. 강아지 종류 입력");
		System.out.println("2. 강아지 입력 내용 삭제");
		System.out.println("3. 강아지 종류 전체 보기");
		int num = in.nextInt();
		in.nextLine();
			if(num==1) {
				add();
			}else if(num==2) {
				del();
			}else if(num==3) {
				allList();
			}
		}
	}
	public void add() {
		Scanner in = new Scanner(System.in);
		Dog ndogName = new Dog();
		System.out.println("강아지 종류를 입력하세요.");
		String addName = in.nextLine();
			for(int i = 0; i < hotDog.size(); i++) {
				if(hotDog.get(i)==null) {
					hotDog.add(ndogName);
					ndogName.dogName=addName;
				}
			}
		}
	public void del() {
		Scanner in = new Scanner(System.in);
		System.out.println("삭제할 강아지 종류를 입력해주세요");
		String delName = in.nextLine();
		for(int i = 0; i < hotDog.size(); i++) {
			if(hotDog.get(i).dogName.equals(delName)) {
				hotDog.remove(i);
			}
		}
	}
	public void allList() {
		System.out.println("강아지 전체 출력");
		System.out.println("------------");
		for(int i = 0; i < hotDog.size(); i++) {
			if(hotDog.get(i)!=null)
				System.out.println(i+": "+hotDog.get(i));
			}
		}
	}
