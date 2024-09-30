package 자바_평가지;

import java.util.ArrayList;
import java.util.Scanner;

public class dogList {
	
	ArrayList <String> hotDog = new ArrayList<>();
	
	dogList(){
		System.out.println("강아지 종류를 입력하세요.");
	}
	
	public void Dog(){
		Scanner in  = new Scanner(System.in);
		System.out.println("강아지 종류 입력");
		String Dog = in.nextLine();
	}
}
