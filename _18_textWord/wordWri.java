package _18_textWord;

import java.util.Scanner;

public class wordWri {
	
	
	while(true) {
		Scanner in = new Scanner(System.in);
		System.out.println("영단어장");
		System.out.println("1. 영단어 저장");
		System.out.println("2. 단어 검색");
		int num = in.nextInt();
		in.nextLine();
		if(num == 1) {
			wordAdd();
		}else if(num == 2) {
			search();
		}else {
			break;
		}
	}
}
}
public void wordAdd() {
	
}
public void search() {
	
}


