package _16_Static_final;

public class MemberADM {
	
	public final String name = "aaa";
	public static String compayName="Human";
	public static final String teamName = "KimTeam";
	
	MemberADM(){
		this.name="abc"; // err why? 상수는 초기값이 결정된 후 변경 불가
		String name = Thread.currentThread().getName();
		System.out.println(name+"스레드가 MemberADM"+"생성자 실행");
	}
	
	public static void prt() {
	//	System.out.println(name);
		
	}
}
