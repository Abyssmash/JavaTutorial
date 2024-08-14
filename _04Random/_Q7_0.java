package _04Random;

import java.util.Scanner;

public class _Q7_0 {

	public static void main(String[] args) {
		// 0. 키보드로 숫자 한 개를 입력 받아서 홀짝을 출력하는 프로그램을 작성하세요.
		// (1) 숫자를 입력하면 홀짝을 출력되어야한다.
		// (2) 키보드로 입력해야하기때문에 Scanner 객체가 필요하다.
		
		int[] num = new int[1];
		Scanner in = new Scanner(System.in);
		for(int i=0; i<num.length; i++) {
			System.out.println("숫자 한 개를 입력하세요");
			int k=in.nextInt();
			in.nextLine();
			num[i]=k;
		if(k%2==1) {
			System.out.println("홀");
		} else {
			System.out.println("짝");
			}	
		}
	}
}
