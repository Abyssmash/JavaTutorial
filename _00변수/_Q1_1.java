package _00변수;

public class _Q1_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//다음 문제를 코드로 작성해 보세요

		//철수는 메모장 프로그램을 만들고 싶어 한다.
		//다음 시나리오 순서에 따라 코드를 작성하시오.

		//시나리오 ---

		//프로그램이 시작하면
		//메모장 프로그램이라는 문구를 출력한다.
		//제목을 저장하며 제목은 [나의 점심]이다.
		//[오늘은 자장면]이라는 본문 문자열을 저장한다.
		//메모장의 제목과 함께 본문 문자열이 출력된다.
		//메모의 제목을 [점심메뉴]라고 바꾼다.
		//바뀐 제목을 콘솔에서확인한다.
		//조회수를 저장할 변수를 만든다. 조회수는 0 1 2 3 순으로 저장할 예정이다. 처음 값은 0이다. 
		//본문 문자열을 [짬뽕도 먹음]으로 변경한다.
		//조회수를 10회로 수정한다.
		//끝으로
		//메모의 제목, 본문, 조회수를 출력한다. 
		//----------------------------------------------------------------------------------

		// level up1
		// 본문 문자열에 탕수육도 먹음이라는 글자를 추가한다.
		
		 System.out.println("메모장 프로그램");
		 String title="[나의 점심]";
		 String body="[오늘은 자장면]";
		 System.out.println(title+body);
		 title="[점심메뉴]";
		 System.out.println(title);
		 int cnt = 0;
		 body ="[짬뽕도 먹음]";
		 System.out.println(body);
		 cnt = 10;
		 System.out.println(cnt);
		 System.out.println("----------");
		 System.out.println("제목 : "+title);
		 System.out.println("본문: "+body);
		 System.out.println("조회수: "+cnt);
		 System.out.println("----------");
		 body += "탕수육도 먹음";
	}
}
