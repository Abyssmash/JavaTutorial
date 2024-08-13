package _03for;

public class _Q6_S2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String a ="67/414/1/23/32/45/54/12/11/232"
		//문자열 a는 해충에 대한 숫자를 카운팅한 결과이다.
		//해충의 갯수를 모두 합하시오.
		//charAt() 메서드만 사용이 가능하다.
		//형변환이 필요하면 검색하여 사용하시오.
		// / 아스키코드: 79
		
		// 독해
		//(1) 문자열을 숫자로 바꿔준다. String에서 int로 형변환
		//(2) for문 (초기값) 설정하기 int=0 i<a.length i++
		//(3) 아스키 코드로 변환되기 때문에 /는 out시키는 작업
		
		// 풀이: 모든 문자열을 숫자로 바꿔준 후 숫자로 바뀐 /를 빼주는 작업을 하였는데
		// 처음에 숫자인 아스키코드 제외 시키고 '+' 대입하고 결과값을 대입하여 도출하는 것이었는데
		// 올려주신 코드가 더 간결함
		
		String a ="67/414/1/23/32/45/54/12/11/232";
		String text = "";
		int num = 0;
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != '/') {
				text += a.charAt(i);
				if (i == a.length() - 1) {
					num += Integer.parseInt(text);
				}
			} else {
				num += Integer.parseInt(text);
				text = "";
			}
		}
		System.out.println(num);
	}

}
