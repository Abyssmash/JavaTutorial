package _04Random;

import java.util.Random;

public class _Q7_5 {

	public static void main(String[] args) {
		// 5. 로또번호를 자동으로 생성하는 게임을 작성하시오.
		// 중복허용 가능, 로또 번호 6개를 배열에 저장하고, 출력하시오.
		
		int[]lotto = new int[7];
		Random r = new Random();
		for(int i=1; i<lotto.length; i++) {
			int num = r.nextInt(45)+1;
			lotto[i]=num;
		}
		for(int i=0; i<lotto.length; i++) {
			if(i==lotto.length-1) {
				System.out.println("보너스 번호:"+lotto[i]);
			} else {
				System.out.println("로또 번호:"+lotto[i]);
			}
		}
	}

}
