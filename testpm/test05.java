package testpm;

public class test05 {

	public static void main(String[] args) {
		// <구체적인 설계 작성하기, 디테일하게>
		// 1. 100부터 999까지의 숫자중에서 홀수만 출력하시오.
		// (1) 초기값을 작성한다. 초기값은 100에서 999까지 설정하고 
		// (2) i가 홀수인지 아닌지 판단 (% 연산 활용)
		
		for(int i=100; i<1000; i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		
		// 2. 1부터 100까지 숫자중에서 홀수의 총합을 구하시오.
		// (1) 1부터 100까지 For문 작성, 초기값은 1 조건 i<=100 i++
		// (2) 홀수 판별: i값이 홀수인지 %2==1
		// (3) 총 합: 총 합을 저장할 변수 선언
		
		int sum=0;
		for(int i=1; i<=100;i++) {
			if(i%2==1) {
				sum+=i;
			}
		}
		System.out.println(sum);
		
		// 4. 배열에서 배열의 값이 짝수인 것만 출력하시오.
		//  int[] arr = {45,23,25,64,3,24,48}
		// (1) For문을 작성한다. 초기값은 0, 조건 0<7(7은 배열의 길이); i++
		// **배열의 길이가 길다면 arr.length를 입력하면 길이를 세어준다. i를 배열의 index로 본다.
		// (2) arr[i]%2==0 조건
		// (3) 출력
		
		int[] arr= {45,23,25,64,3,24,48};
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);	// 값
				// System.out.println(i);	// index
				// sum+=arr[i];	// 총 합 (sum은 총합을 넣어줄 공간 = sum을 추출)
			    // cnt++; 	// 카운팅
			}
		}
		
		// 7. int[] arr = {45,23,25,64,3,24,48}
		//   배열의 값을 모두 더한 총합을 구하시오.
		// (1) For문을 작성한다. 초기값은 0, 조건 0<7(7은 배열의 길이); i++
		// (2) 총 합 변수
		
		int hap=0;
		for(int i=0; i<arr.length; i++) {
			hap+=arr[i];
		}
		System.out.println(hap);
		
		// 10.  int[] arr = {45,23,25,64,3,24,48} 
		//   배열에서 가장 큰 값과 가장 큰 값이 있는 인덱스를 출력하시오.
		// (1) for문 작성 i=0 i<arr.length i++
		// (2) 배열에서 가장 큰 값 = 가장 큰 값의 정보가 필요하다 (선언문과 초기값)
		// (3) i의 value값과 최대값을 저장한 변수랑 비교 arr[i]<max 로 최대값 변경
		
		int max=0;
		int maxIndex=0;
		for(int i=0;i<arr.length; i++) {
			if(arr[i]<max) {
				max=arr[i];
				maxIndex=i;
			}
		}
		System.out.println(max); // max 값이 제대로 나오는지 확인
		System.out.println(maxIndex);
		
		// 12. int[] arr = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3}
		//   0은 터널이다. 가장 긴 터널의 길이를 구하시오.
		// (1) for문으로 배열을 순회 초기값=0 조건은 i<배열의 길이, i++, i는 배열의 index
		// (2) 현재 터널: arr[i] = 터널인지 아닌지 (참일때는: cnt-변수 거짓일때는: cnt-초기화
		// (3) 제일 긴 터널의 길이를 저장 , cnt++; 아래에 판단, cnt가 증가될때마다 계속 비교
		int cnt=0;
		int maxLength=0;
		int[] ar = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3};
		for(int i=0; i<ar.length; i++) {
			if(ar[i]==0) {
				cnt++;	// i가 5일 경우 cnt, i가 
			}
				else {
					cnt=0;	// 여기까진 터널 카운팅
				// System.out.println(i+"/"+cnt); 
			}
			if(cnt>maxLength) {
				maxLength=cnt; // 여기까진 최대길이 판별
			}
		}
		System.out.println(maxLength);
		// 13. 숫자는 터널의 번호이다. 터널의 길이가 가장 긴 숫자와 길이를 출력하시오.
		// (1) for문으로 배열을 순회 초기값=0 조건은 i<배열의 길이, i++, i는 배열의 index
		// (2) 연속된 터널인지 아닌지: 변수 선언 arr[i]==bt
		cnt=0;
		int[] arrr = {1,2,3,0,0,0,1,2,3,4,5,2,2,2,2,0,0,0,0,0,3,3};
		int bt=arrr[0];
		int maxIndex1=0;
		int maxLength1=0;
		for(int i=0; i<arrr.length; i++) {
			if(arrr[i]==bt) {
				cnt++;
			}
			else {
				cnt=1;	//bt=ar[i];		// 현재번호 arr[i], 터널 카운팅
			}
			// 카운팅 되는지 확인 System.out.println(i+"/"+cnt);
			if(maxLength1(cnt)){
				maxLength1=cnt;
				maxIndex1=bt;			// 최대길이 판별, 길이 갱신, 터널번호 갱신
			}
		}
		System.out.println(maxLength1);
		System.out.println(maxIndex);
	}

	private static boolean maxLength1(int cnt) {
		// TODO Auto-generated method stub
		return false;
		//9.  String test = "abcdeabce";		// 선언문: 자료형 변수 = 초기값 (자료형에 따라 연산자)
												// 결론: 변수는 test / 변수는 문자열의 값 / 초기문자열은 "";
	    //for(int i=0; i < 9; i ++){
		//char aaa = test.charAt(i);			// 대문자는 .을 쓸 수 있다. 소문자는 X
		//sysout(aaa);}
	    //위 코드를 분석하여 a문자열에 a가 몇개 있는지 구하는 프로그램을 작성하세요
		// (1) 문자열의 문자를 가져온다. 문자를 첫번째부터 하나씩 가져온다.
		
		// String test="abcdeabce";
		// for(int i=0; i<9; i++) {
		// 	char aaa=test.charAt(i); // char 문자열을 하나씩 가져오는 기능
		// 	System.out.println(aaa);
		}
		
		// 14. 가장 긴 터널의 알파벳 이름과 숫자를 찾으세요
		// String ttt ="aabbbcccaaaaddbbbaaaaa";
		// for(int i=0; i<ttt.length(); i++) {
		//	char a=ttt.charAt(i);
		//	System.out.println(a);
			
		// 15.  String ttt ="aabbbcccaaaaddbbbaaaaa";
		// 압축하시오. 압축 하는 방법 a2b3c3a4d2b3a5
			String ttt = new String("aabbbcccaaaaddbbbaaaaa");
			cnt=0; String resultZip=""; char bT = ttt.charAt(0);
			int maxCnt=0; int maxNumber=0;
			for (int i=0; i < ttt.length(); i++) {
				if(bT == ttt.charAt(i)) {
					cnt++;
				} else {
					resultZip = resultZip + (char)bT + cnt;
					bT=ttt.charAt(i);
					cnt=1;
				}
				if(maxCnt < cnt) {	// 15번 문제에서는 불필요
					maxCnt=cnt;
					maxNumber=bT;
				}
			}
			System.out.println(resultZip);   // 15번 문제 확인
			System.out.println(maxCnt +"/"+(char)bT);  // 14번 문제 확인
		}
	}
