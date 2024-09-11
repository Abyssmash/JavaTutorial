package _08_Array2;

import java.util.Random;
import java.util.Scanner;

public class _Q8_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 9. 키보드로 좌표를 입력하면, 좌표기준으로 왼쪽 또는 오른쪽으로 3개 이상의 연속된 숫자가 있으면 제거 가능
		// 제거 가능이면 제거를 하고, 위에 있는 숫자가 아래로 내려온다.
		// 맨위에 배열은 랜덤수로 채워진다.
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		int[][] pang= {{1,1,0,2},
					   {3,2,1,2},
					   {0,0,3,2},
					   {4,4,4,4},
					   {2,4,3,1},
					   {2,4,1,3}};
		int maxRow=pang.length;
		int maxCol=pang[0].length;
		
		while(true) {
			// 배열 출력
			System.out.println("팡팡팡 Game ~ ");
			for(int i = 0; i < maxRow; i++) {
					System.out.print(i+"번 행 : ");
					for(int j=0; j < maxCol; j++) {
							System.out.print(pang[i][j]+" ");
				}
				System.out.println();
			}
			// 키보드로 좌표 입력
			System.out.println("행번호를 입력하세요 ");
			int row = in.nextInt();
			in.nextLine();
			System.out.println("열번호를 입력하세요 ");
			int col = in.nextInt();
			in.nextLine();
			
			// 필요 변수 초기값 설정
			int number=pang[row][col];
			int numberLength=0;
			int numberLeftCol=col;
			int numberRightCol=col;
			
			// 왼쪽 방향으로 탐색
			for(int i = col; i >= 0; i--) {
				if(pang[row][i]==number) {
					numberLength++;
					numberRightCol=i;
				}else {
					break;
				}
			}
			// System.out.println(numberLeftCol);// 디버깅용
			
			// 오른쪽 방향으로 탐색
			for(int i = col+1; i < maxCol; i++) {
				if(pang[row][i]==number) {
					numberLength++;
					numberRightCol=i;
				}else {
					break;
				}
			}
			// System.out.println(numberRightCol);// 디버깅용
			
			// 왼쪽 오른쪽 탐색 끝
			// 제거 갯 수
			if(numberLength >= 3) {
				System.out.println(numberLength + "개 제거");
			}
			
			// 행에서 제거 된 만큼 위에 숫자를 한 칸씩 다운하기
			for(int i = numberLeftCol; i <= numberRightCol; i++) {
				for(int j = row-1; j >= 0; j--) {
					pang[j+1][i]=pang[j][i];
					if(j==0) {
						pang[j][i]=9;	// 빈칸은 9로 저장
					}
				}
			}
			
			// 빈칸 랜덤 숫자 채우기
			for(int i=0; i < maxRow; i++) {
				for(int j=0; j < maxCol; j++) {
					if(pang[i][j]==9) {
						pang[i][j]=r.nextInt(5);
					}
				}
			}
		}
	}
}

