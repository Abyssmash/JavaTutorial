package _03for;

public class _Q6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2 현상수배
		// int[] letter={8,12,4,13,25,14,4,5}
		// 범인을찾으시오
		// 범인은 짝수이면서 가장큰 값이다. 
		// 범인은 14입니다. 
		int max=0;
		int sum=0;
		int[] letter={8,12,4,13,25,14,4,5};
		for(int i=0; i<letter.length; i++) {
			if(letter[i]%2==0) {
				sum+=i;
			}
			else {
				i+=0;
			}
			if(sum>max) {
				max+=i;
			}
		}
		System.out.println(max);
		

	}

}
