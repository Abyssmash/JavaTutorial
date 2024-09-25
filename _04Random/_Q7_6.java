package _04Random;

import java.util.Random;

public class _Q7_6 {

	public static void main(String[] args) {
		// 6. 컴퓨터는 랜덤으로 로또 번호를 10000번 뽑는다.
		// 가장 많이 뽑힌 로또 번호가 오늘의 추천 로또 번호이다.
		// 오늘의 추천 로또 번호 하나를 출력하시오.  만약 로또 번호가 같은 횟수로 나왔을 경우에는 큰 숫자가 우선한다. 
		
		Random r = new Random();
		int[] lotto = new int[46];
		int maxIndex=0;
		
		//랜덤수 1000개를 뽑아서 저장하는 반복문
		for(int i=0; i < 1000; i++) {
			int idx = r.nextInt(lotto.length-1)+1;
			lotto[idx]++;			
		}
		//최고값(가장많이 나온 수)을 저정한 인덱스를 찾는 반복문, 결국 필요한 것은 로또번호, 로또 번호는 인덱스번호를 의미
		for(int i=0; i < lotto.length; i++) {
			if(lotto[i] > lotto[maxIndex]) {
				maxIndex=i;
			}
		}
		
		System.out.println(lotto[maxIndex]);

	}

}