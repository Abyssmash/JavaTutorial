package _03for;

public class _01_Qfor {

	public static void main(String[] args) {
		
		// 50점 이상 점수는 몇개인가?
		// 1. 50점 이상 점수를 합하시오.
		// 2. 평균을 구하시오. 단 50점 이상
		// 3. 평균을 구하시오. 단, 최저점수는 포함하지마시오.
		
		// 1.
		int add=0;
		int[]a = {30,40,50,55,65};
		for (int i=0; i<5; i++) {
			if(a[i]>=50) {
				add+=a[i];
			}
		}
		
		
		
		System.out.println(add);
		
		// 2. 
		add=0;
		int cnt=0;
		double avg =0;
		for (int i=0; i<5; i++) {
			if(a[i]>=50) {
				add+=a[i];
				cnt++;			// if에서 나온 숫자가 몇개인지 세어주는 역할
			}
		}
		avg = add/(double)cnt;
		System.out.println(avg);
		
		//2-1 (다른 방법)
				cnt=0;
				int sum=0;
				for(int i=0; i<5; i++) {
					if(a[i]>=50) {
						cnt++;
						sum += a[i];
					}
				}
				System.out.println((double)sum/cnt);

		
		// 3
		int sum1=0;
		int cnt1=0;
		int minValue=99999;
		
		//최저값 찾기
		for (int i = 0; i < 5; i++) {
			if (a[i] < minValue) {
				minValue = a[i];
			}
		}
		//누적합 구하기
		for (int i = 0; i < 5; i++) {
			if (a[i] != minValue) {
				sum1 += a[i];
				cnt1++;
			}
		}
		System.out.println((double) sum1 / cnt1);
		
		// 3번 코드 줄이기
		//sample3 :sample2를 코드 줄이기
				//총합을 일단 구한 후. 나중에 최저값을 뺀다.
				int sum2=0;
				int cnt2=0;
				int minValue1=99999;
				
				//if문은 최저값 구하기, sum2는 모두 합하기
				for (int i = 0; i < 5; i++) {
					if (a[i] < minValue1) {
						minValue1 = a[i];
					}
					sum2+=a[i];
				}
				System.out.println((double)(sum2-minValue1)/4);
		
	}
}
