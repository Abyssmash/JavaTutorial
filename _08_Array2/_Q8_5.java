package _08_Array2;

public class _Q8_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = {{1,2,3,4,5},
				 {6,7,8,9,10},
				 {11,12,13,14,15},
				 {16,17,18,19,20},
				 {21,22,23,24,25}};
		
		// 5. 전체 배열의 값 중 홀수를 0으로 마스킹하고, 마스킹 된 결과 2차원 배열을 출력하시오
		// 출력은 02040 이와 같은 패턴으로 모두 출력되어야한다.
		
			// 먼저 홀수만 0으로 마스킹
			int row=a.length;
			int col=a[0].length;
			for (int i=0; i < row; i++) {
				for (int j=0; j < col; j++) {
					if(a[i][j]%2!=0) {
						a[i][j]=0;
					}
				}
			}
				// 출력
				for (int i1=0; i1 < row; i1++) {
					for (int j=0; j < col; j++) {
						System.out.println(a[i1][j]+"\t");
				}	
			System.out.println();
		}
	}
}

