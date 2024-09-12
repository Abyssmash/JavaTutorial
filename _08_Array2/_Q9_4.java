package _08_Array2;

public class _Q9_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= new int [4][5];
		

		// 기본값
		//int num=1;
		//for(int i=0; i < a.length; i++) {
		//	for(int j=0; j < a[0].length; j++) {
		//		a[i][j]=num;
		//		num++;
		//	}
		//}
		
		
		/* 문제
		 * {1, 2, 3, 4, 5},
		 * {10, 9, 8, 7, 6},
		 * {11, 12, 13, 14, 15},
		 * {20, 19, 18, 17, 16}
		 */
		
		
		// 문제 풀이
		// 필요한 변수 
		// 행의 길이
		// 열의 길이
		// 1부터 카운팅 해줄 숫자
		
		// 행의 순서 {0, 0, 0, 0, 0} - {1, 1, 1, 1, 1}
		// 열의 순서 {0, 1, 2, 3, 4} - {4, 3, 2, 1, 0}
		// 행은 0 < 에서 순서대로
		// 열은 0-4, 4-0 으로 반복 (if else break가 필요할 것으로 보임)
		
		// for문 작성
		// 1. 행은 열 끝나면 그대로 +1행
		// 2. 열의 길이보다 열이 작다면 열 +1 열의 길이와 같아지면 열 -1
		
		int cnt=1;
		int row=a.length;
		int col=a[0].length;

		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				if(a[i][j]<col) {
					cnt++;
				} else if(a[i][j]==col) {
					cnt++;
					col--;
				}
			}
		}
			
				
		
		
		// 배열 값 출력부
		for(int i = 0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.println(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
