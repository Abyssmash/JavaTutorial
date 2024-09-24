package _11_method;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TestMethod r = new TestMethod();
		
		// Method study
		//	index 012345
		String a = "880104";
		System.out.println(a.substring(0,2));
		String year = a.substring(0,2);
		System.out.println(year);
		System.out.println("19"+year);
		
		// 다음 에러의 원인을 서술하시오.
		// 리턴타입이 String이다. 저장 변수는 int타입, 미스매치타입
		// 리턴타입과 저장변수가 다르기 때문이다. 타입이 int인데 substring이라는 call의 타입이 일치하지않음
		// int month = a.substring(2,4);
		
		System.out.println(a.contains("8"));
		String w = "개나리";
		String title = "오늘 컨디션 참 개나리야 짜증!";
		System.out.println(title.contains(w));
		if(title.contains(w)) {
			System.out.println("욕하지 마세요.");
		}else {
			System.out.println("제목은 올바른 표현입니다.");
		}
		System.out.println(title.indexOf(w));
		
		// 과제 1 : 제목에서 개나리 부분을 ***으로 바꾸시오.
		String t1 = title.substring(0,title.indexOf(w));
		System.out.println(t1);
		String t2 = title.substring(title.indexOf(w)+3);
		System.out.println(t2);
		System.out.println(t1+"***"+t2);
		
		System.out.println(title.replace(w, "***"));
		
		// 과제 2 : 제목에서 개나리라는 단어가 포함된 부분을 가져오세요.
		//		 단어가 포함된 기준은 개나리 단어의 시작부터 스페이스까지
		// 		 위 샘플에서는 [개나리야]를 가져오시오.
		
		System.out.println(title.substring(
				title.indexOf(w), title.indexOf(
						" ", title.indexOf(w))));	
	}
}
