package _04Random;

import java.util.Random;

public class _Q7_3 {

	public static void main(String[] args) {
		// 3. 2번 업그레이드, 랜덤 수를 하나 뽑아서 출력한다
		//  7의 배수이면 행운의 숫자, 7의 배수가 아니면 행운의 숫자가 나올 때 까지 계속 뽑는다.
		
		int lucky=0;
		Random r = new Random();
		for(int i=1; ; i++) {
			int k=r.nextInt(100)+1;
			lucky=k;
		// System.out.println(lucky);	// 랜덤으로 나오다가 7의 배수만 출력되는지 확인
		if(k%7==0) {
				break;
			}
		} System.out.println(lucky);
	}
}