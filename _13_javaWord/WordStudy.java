package _13_javaWord;

import java.util.ArrayList;
import java.util.Scanner;

public class WordStudy {
	
			ArrayList <WordOne> wStudy = new ArrayList<>();
			
		WordStudy(){
			while(true) {
				System.out.println("영단어 공부장");
				Scanner in = new Scanner(System.in);
				System.out.println("사용할 기능의 번호를 입력해주세요.");
				System.out.println("1. 단어 등록");
				System.out.println("2. 전체 조회");
				System.out.println("3. 등록단어 삭제");
				System.out.println("4. 단어 수정");
				int num = in.nextInt();
				in.nextLine();
				if(num == 1) {
					add();
				}else if(num == 2) {
					allList();
				}else if(num == 3) {
					del();
				}else if(num == 4) {
					re();
				}
			}
		}
		public int duplexIDcheck(String eWord) {
			for(int i = 0; i < wStudy.size(); i++) {
				if(wStudy.get(i).eWord.equals(eWord)) {
					return 1;
				}
			}
			return 0;
		}
		public void add() {
			Scanner in = new Scanner(System.in);
			WordOne nWord = new WordOne();
			System.out.println("등록할 영단어를 입력해주세요.");
			String eWord = in.nextLine();
				if(duplexIDcheck(eWord)==1) {
					System.out.println("중복된 단어입니다.");
				}else {
					nWord.eWord=eWord;
					System.out.println("등록할 영단어의 뜻을 입력해주세요.");
					String eSol = in.nextLine();
					nWord.eSol=eSol;
					wStudy.add(nWord);
					}
				nWord=null;
		}
		public void allList() {
			System.out.println("---영단어장---");
			for(int i = 0; i < wStudy.size(); i++) {
				if(wStudy.get(i)!=null) {
				wStudy.get(i).prt();
				}
			}
		}
		public void del() {
			Scanner in = new Scanner(System.in);
			System.out.println("삭제할 영단어를 입력해주세요.");
			String word = in.nextLine();
			for(int i = 0; i < wStudy.size(); i++) {
				if(wStudy.get(i).eWord.equals(word)) {
					wStudy.remove(i).prt();
				}
			}
			System.out.println("삭제되었습니다.");
		}
		public void re() {
			Scanner in = new Scanner(System.in);
			WordOne nWord= new WordOne();
			System.out.println("수정할 단어를 입력해주세요.");
			String word = in.nextLine();			
			for(int i = 0; i < wStudy.size(); i++) {
				if(duplexIDcheck(word)!=1) {
					System.out.println("수정할 단어가 없습니다.");
				}else {
					wStudy.remove(i).prt();
					System.out.println("단어를 재입력 해주세요.");
					System.out.println("영단어 먼저 입력해주세요");
					String eWord = in.nextLine();
					nWord.eWord=eWord;
					System.out.println("뜻을 입력해주세요");
					String eSol = in.nextLine();
					nWord.eSol=eSol;
					wStudy.add(nWord);
				}
			}nWord = null;
		}
}
