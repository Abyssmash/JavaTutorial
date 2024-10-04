package _18_textWord;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class wordNote {
	
		static Scanner in = new Scanner(System.in);
		static ArrayList <wordNote> word = new ArrayList<>();
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fileName = "영단어장.txt";
		String text = null;
		
		try {
			File file = new File("단어장.txt");
			wordNote writer = new wordNote();
			BufferedWriter txt = new BufferedWriter(new FileWriter(fileName, true));
			
			txt.write(text);
			txt.flush();
			
		}catch(Exception e){
			e.getStackTrace();
		}
		while(true) {
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
	public static void wordAdd() {
		System.out.println("---영어단어 등록---");
		System.out.println("영어 단어를 입력해주세요.");
		wordNote ntext = new wordNote();
		String aword = in.nextLine();
		for(int i = 0; i < word.size(); i++) {
			if(word.get(i)==null) {
				ntext.text(aword);
				word.add(ntext);
				System.out.println("등록되었습니다.");
			}else {
				System.out.println("이미 등록된 단어입니다.");
			}
		}
	}
	public static void search() {
		System.out.println("---영단어 검색---");
		System.out.println("검색할 영단어를 입력해주세요.");
		String sword = in.nextLine();
		for(int i = 0; i < word.size(); i++) {
			if(word.get(i).equals(sword)) {
				System.out.println("--검색된 단어--");
				word.get(i);
				System.out.println("------------");
			}else {
				System.out.println("등록된 단어가 없습니다.");
			}
		}
	}
}

