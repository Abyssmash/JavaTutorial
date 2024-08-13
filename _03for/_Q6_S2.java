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
		String a ="67/414/1/23/32/45/54/12/11/232";
		int result=0;
		String text="";
		String str="67/414/1/23/32/45/54/12/11/232";
		char arithmetic = ' ';
		int num= Integer.parseInt(str);		// 문자열을 숫자로 변경
		for(int i=0; i<a.length(); i++) {
			if ((int)a.charAt(i) > 47) {
				text += a.charAt(i);
			}else if (result == 0) {	
					result += Integer.parseInt(text);
					text = "";
			}else if (arithmetic == '+') {			
					result += Integer.parseInt(text);
					text = " ";
			}if((int)a.charAt(i)==num) {
				result++;
			}
		}
		System.out.println(result);
	}
}
