package _08_Array2;

public class _Q9_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열 값 입력부
		int[][] a = {{1,2,3,4,5},
					 {6,7,8,9,10},
					 {11,12,13,14,15},
					 {16,17,18,19,20},
					 {21,22,23,24,25}};
	  			
		// 문제 풀이
		// 0행의 0열은 0행 1열로 이동 (오른쪽으로 이동)
		// 1행의 0열은 0행 0열로 이동 (윗쪽으로 이동)
		// 열은 오른쪽 행은 위쪽으로 이동
		// 1 / 0번째 열 + 1
		// [0][0] - [0][1] 열>=0 열+1
		// [1][0] - [0][0] 행>0 행-1
		// 7 / 1번째 열 + 1
		// [1][1] - [1][2] 
		// [2][1] - [1][1]
		
		
		int maxRow=a.length;		// 행의 길이
		int maxCol=a[0].length;		// 열의 길이
		
		// 배열 값 출력부
		for(int i = 0; i<a.length; i++) {
			for(int j=0; j<a[0].length; j++) {
				System.out.println(a[i][j]+" ");
			}
			System.out.println();
			
		}

	}
}


