package _03for;

public class _Q6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3 비밀편지
		// String word ="gehoudfkimjnlvy";
		// int[] letter={8,12,3,13,1,14,3,4};
		// letter  배열은 word문자열 알파벳의 위치이다.
		// letter배열의 암호를 풀어서 편지의 내용을 출력하시오.
		
		int[] letter3 = {8,12,3,13,1,14,3,4};
		String word ="gehoudfkimjnlvy";
		for (int i = 0; i < letter3.length; i++) {
			System.out.print(word.charAt(letter3[i]));
		}
		System.out.println(" ");
	}
}
