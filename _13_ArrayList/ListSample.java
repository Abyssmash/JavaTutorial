package _13_ArrayList;

import java.util.ArrayList;

public class ListSample {
	ArrayList <String> a = new ArrayList<>();
	public ListSample() {
		System.out.println("리스트의 길이 "+a.size());
		a.add("apple");
		System.out.println("리스트의 길이 "+a.size());
		a.add("banana");
		a.add("abc초콜릿");
		a.add("샌드");
		System.out.println("리스트의 길이 "+a.size());		
		
		// 1번째 들어있는 값 가져오기
		System.out.println(a.get(1));
		
		// 모든 리스트를 출력
		System.out.println("--------------");
		for(int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}
		// a로 시작하는 단어는 출력하지마시오.
		System.out.println("--------------");
		for(int i = 0; i < a.size(); i++) {
			if(a.get(i).charAt(0)!='a') {
				System.out.println(a.get(i));
			}
		}
		// 특정 인덱스 위치에 추가
		System.out.println("--------------");
		a.add(1,"쭈꾸미");
		for(int i = 0; i < a.size(); i++) {
			System.out.println(i+":"+a.get(i));
		}
		// 특정 인덱스 삭제
		System.out.println("--------------");
		a.remove(3);
		for(int i=0; i < a.size(); i++) {
			System.out.println(i+":"+a.get(i));
		}
		// 특정 인덱스 수정
		System.out.println("--------------");
		a.set(1, "갑오징어");
		for(int i=0; i < a.size(); i++) {
			System.out.println(i+":"+a.get(i));
		}
		// 리스트 전체 삭제
		System.out.println("--------------");
		a.clear();	
		System.out.println(a.size());
	}
}
