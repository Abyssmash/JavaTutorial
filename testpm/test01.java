package testpm;

public class test01 {

	public static void main(String[] args) {
		 // level up1
		 System.out.println("메모장프로그램");
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
		 
		 // level up2
		 // 문제 1
		 int point=80;
		 System.out.println(point);
		 // 문제 2
		 double firstNumber=10;
		 double secondNumber=4;
		 System.out.println(1.0*firstNumber/secondNumber);
		 // 문제 3
		 String name=null;
		 name="홍길동";
		 System.out.println(name+"님");
		 // 문제 4
		 int saveEng=90;
		 int saveMath=87;
		 int saveCom=100;
		 double divInt=3.0;
		 double avg;
		 avg = (saveEng+saveMath+saveCom)/divInt;
		 System.out.println(avg);
		 
		 //level 3
		 int a = 10;
		 System.out.println((a%3)==0);
	}

}
