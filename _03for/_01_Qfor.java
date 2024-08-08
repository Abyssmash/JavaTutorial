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
		
		
		// 3. 총합 구한 후 최솟값
		// 코드 줄이기
		int sum2=0;
		int cnt2=0;
		int minValue1=99999;
		
		//if문은 최솟값 구하기, sum2는 모두 합하기
		for (int i = 0; i < 5; i++) {
			if (a[i] < minValue1) {
				minValue1 = a[i];
			}
			sum2+=a[i];
		}
		System.out.println((double)(sum2-minValue1)/4);
	}
}
