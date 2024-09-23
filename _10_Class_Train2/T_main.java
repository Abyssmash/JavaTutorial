package _10_Class_Train2;

public class T_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// T_Center를 의존하기 떄문에 변수가 필요
		System.out.println("기차 시간 알림 프로그램");
		
		// Tmain이라는 클래스는 Tcenter라는 클래스를 의존하고 있으나 실제 참조는 할 수 없음
		// : 객체의 주소가 없기 때문
		// T_center tcenter = null;
		
		T_center tc = null;
		
	}

}
