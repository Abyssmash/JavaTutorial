package _08_Array2;

public class _Q8_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] a = {{1,2,3,4,5},
					 {6,7,8,9,10},
					 {11,12,13,14,15},
					 {16,17,18,19,20},
					 {21,22,23,24,25}};
		
		// 2차원 배열의 모든 값을 출력하시오.
		// 출력할 때는 행의 번호는 내림차순, 열의 번호도 내림차순으로 출력하시오.
		
		int row = a.length-1;
		int col = a[0].length-1;
		for(int i=row; i >= 0; i--) {
			for(int j=col; j >= 0; j--) {
				System.out.println(a[i][j]+"\t");
			}
			System.out.println();			// 줄 바꿈
		}
	}

}
