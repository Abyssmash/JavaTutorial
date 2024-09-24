package _11_method;

public class TestMethod {
		// 생성자는 눈에 안보이지만 생략되어있음
		
		// 이름 뒤에 마스킹을 해주는 메소드 만들기
		// 호출할 떄 문자열로 마스킹 문자를 지정하면, (*매개변수)
		// 이름뒤에 마스킹 문자를 연결하여(*기능) 리턴한다.
		// 메소드명은 maskName
	
		String name = null;
		public String getName2(String pwd) {
			if(pwd.equals("1111")) {
				return name;
			}else {
				return null;
			}
		}
		public void setName(String n) {
			name = n;
		}
		public String getName() {
			return name;
		}
			
		public String maskName(String masking) {		// 정의
			String maskingName = name+masking;
			return maskingName;
		}
		
}
