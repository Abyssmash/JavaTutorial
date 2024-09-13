package _08_Array2;

public class _Q9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		// [0][2] 5 [1][2] 6 [2][2] 7 [3][2] 8
		// [0][3] 5 [1][3] 6 [2][3] 7 [3][3] 8
		// 행이 0일때 1씩 증가
		// 열이 4일때 행이 1씩 증가
		
		int [][] a = new int[4][5];
		int num=1;
		
		// 2차원 배열의 값을 저장하는 코드
		for(int i=0; i < 4; i++) {
			// System.out.println(">행"+행);
			for(int j=0; j < 5; j++) {
				System.out.print(a[i][j]+"\t");
				}
				System.out.println();
				System.out.println();
			}
		
		for(int i=4; i>=0; i++) {
			//System.out.println("현재 행은");
			for(int j=0; j<4; j++) {
				a[i][j]=num;
				num++;
			}
			System.out.println();
		}
	
	}
}

