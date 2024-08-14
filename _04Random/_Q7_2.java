package _04Random;

import java.util.Random;

public class _Q7_2 {

	public static void main(String[] args) {
		// 2. 행운의 숫자 인지를 판별해 보자
		//  1부터 100까지 숫자 중 랜덤 수를 하나 뽑아서 출력한다.
		//  이 숫자가 7의 배수이면 행운의 숫자, 7의 배수가 아니면 조심해야하는 숫자 입니다.
		
		// 시나리오
		// 초기값 조건문 변수를 1부터 100까지의 숫자로 한다.
		// 랜덤한 숫자를 뽑아서 참인지 거짓인지 ( 숫자 추출 + 내용 추출 )
		 
		int lucky=0;
		Random r = new Random();
		for(int i=1; i<=100; i++) {
			int k=r.nextInt(100)+1;
			lucky=k;
		}	System.out.println(lucky);
		
			if(lucky%7==0) {
				System.out.println("행운의 숫자입니다.");
			} else{
				System.out.println("조심해야하는 숫자입니다");
			}
		}
		
	}
