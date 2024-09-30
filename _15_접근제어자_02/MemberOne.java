package _15_접근제어자_02;

public class MemberOne {
	String name = null;
	public void prt() {
		System.out.println(name);
	}
	public void setName(String n) {
		if(chkName(n)) {
			this.name=n;
		}else {
			this.name="err";
		}
		System.out.println(this.name);
	}
	
	private boolean chkName(String n) {
	// 접근제어자 - 리턴타입 - 메소드명 (매개변수 정의)
		if(n.charAt(0) == '4') {
			return false;
		}
		return true;
	}
	// chkName은 내부적으로 호출하는 메서드로 정의
	// 하였으므로 private가 적당함.
}
