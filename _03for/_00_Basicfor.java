package _03for;

public class _00_Basicfor {

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
		
		
		// 3. *최소값 먼저 찾기
		int sum =0;
		cnt = 0;
		int minValue=1000; 		// 임의의 변수 (비교 대상)
		for(int i=0; i<5;i++) {
			if(minValue!=a[i]) {
				sum+=a[i];
				cnt++;
			}
			if(minValue>a[i]) {
				minValue=a[i];
				sum+=a[i];
				cnt++;
			}
		}
		System.out.println((double)sum/cnt);
	}
}
