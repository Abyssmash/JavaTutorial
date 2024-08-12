package _03for;

public class _Q6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 6
		// String a ="23-56+45*2-56";
		// 수식을 계산하는 프로그램을 작성하세요.
		// 수식 계산 규칙은 연산자 우선순위 없이 앞에서 부터 차례대로 계산한다.
		// 지금까지 공부한 내용으로 해결하시고, 형변환만 검색이 가능합니다. 
		// 메서드는 최대한 적게 사용하세요
		String a="23-56+45*2-56";
		// 10진수 +:75, -:77, *:74
		String str1="23";
		String str2="56";
		String str3="45";
		String str4="2";
		String str5="56";
		int numInt = Integer.parseInt(str1);
		System.out.println(numInt-str2+str3*str4-str5);
	}
}
