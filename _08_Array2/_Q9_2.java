package _08_Array2;

public class _Q9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= new int[4][5];
		
		// 기본값
		//int num=1;
		//for(int i=0; i < a.length; i++) {
		//	for(int j=0; j < a[0].length; j++) {
		//		a[i][j]=num;
		//		num++;
		//	}
		//}
		

		/*	문제
		 * 	{17, 13, 9, 5, 1},
		 *  {18, 14, 10, 6, 2},
		 *  {19, 15, 11, 7, 3},
		 *  {20, 16, 12, 8, 4} 
		 */
		
	
		// 문제 풀이
		// 3행의 4열부터 반대로 1~20
		// [0][4] 1 [1][4] 2 [2][4] 3 [3][4] 4
		// [0][3] 5 [1][3] 6 [2][3] 7 [3][3] 8
		// 행이 0일때 1씩 증가
		// 열이 4일때 행이 1씩 증가
		
		//for(int i=4; i < a.length; i++) {
		//	for(int j=5; j < a[0].length; j++) {
		//		a[i][j]=num;
		//		num++;
		//	}
		//}
		
		//필요한 변수
		// 행의 길이
		// 열의 길이
		// 
		
		int row=a.length;				// row는 a의 행의 길이이다.
		int col=a[0].length;			// col은 a의 열의 길이이다. 
		for(int i=row; i >= 0; i++) {		// i는 행이고, 행이 0과 같거나 크다면 1씩 증가
			for(int j=col; j >= 0; j--) {   // J는 열이고, j가 0보다 크면 1씩 감소
				if(j==col) {
					row--;
				}
				System.out.println(a[i][j]+"\t");
					}		
			System.out.println();
		}

		
		// or 행의 열이 1씩 증가할때 열의 숫자가 4씩 증가
		//int row=a.length;
		//int col=a[0].length;
		//for(int i=0; i < row; i++) {
		//	for(int j=0; j < col; j++) {
		//		}
		//	}
		//}
		
		
		// 배열 값 출력부
		for(int i = 0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.println(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
