package _08_Array2;

public class _Q9_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a= new int[4][5];
		int num=1;
		
		/* 문제
		 * {1, 2, 4, 7, 11},
		 * {3, 5, 8, 12, 15},
		 * {6, 9, 13, 16, 18},
		 * {10, 14, 17, 19, 20}
		 */
		
		// 문제 풀이
		for(int i=0; i < 8; i++) {
			System.out.println(i +"번째 채우기를 합니다.");
			int newCol=i;
			for(int j=0; j <= i; j++) {
				if(j>3) break;		// if절에서 한줄이면 괄호 생략(X)
				if(newCol < 5) {
					//System.out.println("j<행>"+j+"/newCol"+newCol);
					a[j][newCol]=num++;
				}
				newCol--;
			}
		}
		
		
		// 2차원 배열 a의 값을 0번행부터 모두 출
				for(int i = 0; i<4; i++) {
					for(int j=0; j<5; j++) {
						System.out.print(a[i][j]+"\t");		// ln 삭제하면 출력이 가로로 정렬됨 +
					}
					System.out.println();		// 줄 바꿈
				}
			}

		}
