package _03for;

public class _Q6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 큰놈
				// int[] letter={8,12,4,13,2,14,4,5}
				// 배열의 가장 큰수가 있는 인덱스를 출력하시오.
				
				int max=0;
				int maxIndex=0;
				int[] letter={8,12,4,13,2,14,4,5};
				for(int i=0; i<letter.length; i++) {
					if(letter[i]>max) {
						max=letter[i];
						maxIndex=i;
					}
				}
				System.out.println(maxIndex);
	}
}
