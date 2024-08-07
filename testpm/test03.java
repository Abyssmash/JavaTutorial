package testpm;

public class test03 {

	public static void main(String[] args) {
		
		//문제
		// 1. 평균을 저장하는 변수를 만들고 89.2라고 저장하시오.
		// (평균이 80점 이상이면 합격, 80점 미만이면 불합격이라고 출력하시오.
		
		Double avg = 89.2;
		if(avg>=80) {
			System.out.println("합격");
		}else if (avg<80){
			System.out.println("불합격");
		}
		
		// 2. level이 1이면 포인트에 30을 더하고
		// level이 1이 아니면 포인트에 10을 더하시오
		// (sysout을 한번만 사용하여 최종 포인트를 출력하시오.)
		
		int level=2;
		int point=30;
		if(level==1 && level!=1)
			if(level==1) {
				point += 30;
			}else if (level!=1) {
				point += 10;
			}
		System.out.println(point);
		
		// 3. 로또 번호이다. 3번째 값에 80을 더하시오.
		// * 배열의 값은 바뀔 수 있다.
		
		int[] lotto = {6, 12, 33, 4, 5, 26};
		System.out.println(lotto[2]+80);
		
		// 4. 4번째 번호가 홀수이면 홀수, 짝수이면 짝수라고 출력하시오.
		if(lotto[4]%2==0) {
			System.out.println("짝수");
		}else if(lotto[4]%2!=0) {
			System.out.println("홀수");
		}
		
		// 5. 홀수인 로또 번호의 합을 구하시오
		int sum=0;			    // 더해줄 공간 만들기
		if(lotto[0]%2!=0) {
			sum += lotto[0];	// 홀수면 sum에 더한다.
		}if(lotto[1]%2!=0) {
			sum += lotto[1];
		}if(lotto[2]%2!=0) {
			sum += lotto[2];
		}if(lotto[3]%2!=0) {
			sum += lotto[3];
		}if(lotto[4]%2!=0) {
			sum += lotto[4];
		}	System.out.println(sum);
		
		// up1 6. 숫자의 모든 합을 구하시오.
		int[] a= {45, 34, 64, 45, 24};
		int add = 0;
		add+=a[0]+a[1]+a[2]+a[3]+a[4];
		System.out.println(add);
				
		// 7. 철수는 숫자를 0번째부터 2번째까지 차례대로 수집했다.
		// 철수는 숫자의자릿수를 분해하여 합한 결과 값이 가장 큰 숫자를 선택할 예정이다.
		// 숫자를 분해하는 것은 45인 경우 4+5를 의미한다. 철수가 선택할 숫자는 몇번째 수집한 숫자인가?
		
		int[] b = {45, 34, 64};
		
		// up2 네모는 새, 화살표는 총알, 총알은 직진으로 움직인다.
		// 총알에 맞는 새의 번호를 출력하시오.
		// 0번 새 위치: 6,4 / 1번 새 위치: 5, 10 / 2번 새 위치: 9,6
		
		int[]x= {6,5,9}
		int[]y= {4,10,6}
		

		
		}
	}


