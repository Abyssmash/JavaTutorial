package Project;

public class _project1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 글자수가 랜덤으로 나오게 하기
		// 맞으면 cnt 한다.
		// 점수는 신경쓰지 않기
		
		// i는 글자 j는 열
		// i
		// ii
		// iii
		// iiii
		// iiiii
		
		// point도 글자수에 맞게 2의 배수
		
		// String[] word= {한글, 영문, 특수문자 각 20개씩}
		Arr a = new Arr();
		Random r = new Random();
		int num = 0;
		String Q = "";
		for (int i = r.nextInt(a.arr.length); i < a.arr.length;) {
			num = r.nextInt(10);
			Q = num + a.arr[i];
			break;
		}
		System.out.println(Q);
		
	
		Scanner in = new Scanner(System.in);	// 키보드 스캐너
		Random r = new Random();		// 랜덤으로 가져옴
		int arr = r.nextLine(5)+1;		// 5글자까지 나와야하고 0글자는 없으니 1~5로 보정
		String a = in.nextLine();		// 문자열 입력					
										// 참이면 cnt 틀리면 점수 마이너스를 따로 따로
		for(int i=0; i<6; i++) {		// word의 길이는 5글자 이상
			if(word.length==1) {		// 워드의 길이가 1이면 cnt1 증가
				cnt1++;
			}else if(word.length==2) {
				cnt2++;
			}else if(word.length==3) {
				cnt3++;
			}else if(word.length==4) {
				cnt4++;
			}else if(word.length==5) {
				cnt5++;
			}
		}
		
		
		
		<초보용>  - 100초  (easy)
		한글자->5개   	(cnt1) 1글자 5번
		두글자->4개	(cnt2)
		세글자->3개	(cnt3)
		네글자->2개	(cnt4)
		다섯글자->1개	(cnt5)
		/ 2, 3

		<중급용> - 100초	(middle)
		한글자-> 3개
		두글자-> 3개
		세글자-> 3개
		네글자-> 3개
		다섯글자-> 3개


		<고급용> - 100초  (hard)
		한글자->1개
		두글자-> 2개
		세글자-> 3개
		네글자-> 4개
		다섯글자-> 5개

		카운트: cnt	

		-- 추후에 초는 조정 가능


		성공: "---를 통과하였습니다."(점수)
		실패: "타임아웃입니다."
		       "0점입니다. 더 연습하세요."


	}

}
