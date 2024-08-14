package _04Random;

import java.util.Random;	// 랜덤이라는 class가 내가 작성하는 곳에 필요하기때문에 import로 만들어줌
							// 단축키: ctrl + shift + 'o'

public class _00_Test { 
	public static void main(String[] args) {
		// 시나리오
		// 랜덤한 숫자를 뽑아서 로또 번호로 저장. (랜덤한 6개의 숫자)
		// 로또 번호 저장할 배열
		int[] lotto=new int[6];		// 변수명, 길이, 인덱스
		// 랜덤한 번호를 추출하기 위한 객체 만들기
		Random r= new Random();
		// 랜덤한 번호를 뽑기 위한 반복문
		for(int i=0; i<lotto.length; i++) {
		//	System.out.println((i+1)+"번째 뽑아"); // 제대로 값이 설정되었는지 확인하고 주석처리 하기
			int k=r.nextInt(45)+1; // r변수를 참조하여 nextInt라는 기능을 호출, 리턴받은 수에 +1을 한다.
			lotto[i]=k;
		}
			for(int i=0; i<lotto.length;i++) {
				if(i==lotto.length-1) { // 마지막 번호
					System.out.println("보너스: "+lotto[i]);
				} else {
					System.out.println(lotto[i]);
			}
		}
	}
}
