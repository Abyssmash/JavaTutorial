package _03for;

public class _Q6_0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 0 선택받은너
		// int[] letter={8,12,4,13,2,14,4,5}
		// 짝수만 출력하시오.
		int[] letter={8,12,4,13,2,14,4,5};
		for(int i=0; i<letter.length; i++) {
			if(letter[i]%2==0) {
				System.out.println(letter[i]);
			}
		}
	}
}
