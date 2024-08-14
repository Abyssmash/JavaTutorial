package _04Random;

import java.util.Scanner;

public class _Q7_1 {

	public static void main(String[] args) {
		// 1. 키보드로 두 개의 숫자를 입력받아서 합하는 프로그램을 작성하세요.
		// (1) 두 개의 숫자를 합해줄 변수 만들어주기
		// (2) 키보드를 입력하기 위한 객체 scanner 사용하기
		
		int hap=0;
		int[]num = new int[2];
		Scanner in = new Scanner(System.in);
		for(int i=0; i<num.length; i++) {
			int k = in.nextInt();	// nextInt는 키보드로 숫자만 가져온다.
			in.nextLine();	// 버퍼(임시기억장소) 지우기
			num[i]=k;
			}
		System.out.println();
		}	
}

