package _03for;

public class _Q6_S1 {

	private static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String a = "6/4/3/2/5/1/4/5/6/7/8/9/1/2/3/4/5/6";
		//문자열 a는 한자릿수의 숫자를 수집한 문자열이다.
		//숫자별로 수집된 수만큼 카운팅하세요.
		//카운팅 배열은
		//int[] a = new int[10]; 
		// 위 선언문은 길이 10의 배열을 생성한 선언문이다. 초기값은 0이다.
		// 인덱스 0 - 9까지를 숫자로 정의한다.
		//조건 : 형변환은 사용하지 않는다. 메서드는  charAt()만 사용한다. 
		
		// 문자로 (정수 X)
		// String a = "6/4/3/2/5/1/4/5/6/7/8/9/1/2/3/4/5/6";
		//String aa=new String("643251456789123456");
		// int[] a = new int[10]; 
		
		// (1) 배열
		// (2) 숫자가 같으면 +1씩 늘어나게 한다.
		// (3) 숫자와+갯수를 같이 출력되게 한다.
		int[] a = {6,4,3,2,5,1,4,5,6,7,8,9,1,2,3,4,5,6};
		int cnt=0;
		int same=a[i];
		int resultZip=0;
		for(int i=0; i<a.length; i++) {
			if(same==a[i]) {
				cnt++;
			}else {
				resultZip = resultZip + same + cnt;
				same=a[i];
				cnt=1;
			}
		}
		resultZip = resultZip + same + cnt;
		System.out.println(resultZip);
	}
}
