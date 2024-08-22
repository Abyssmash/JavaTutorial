package Project1;

import java.util.Random;
import java.util.Scanner;
import java.util.Timer;

public class project {
	public static volatile boolean stop = false;
	public static final String black    = "\u001B[30m" ;
    public static final String red      = "\u001B[31m" ;
    public static final String green    = "\u001B[32m" ;
    public static final String yellow   = "\u001B[33m" ;
    public static final String blue     = "\u001B[34m" ;
    public static final String purple   = "\u001B[35m" ;
    public static final String cyan     = "\u001B[36m" ;
    public static final String white    = "\u001B[37m" ;
    public static final String exit     = "\u001B[0m" ;

	public static void main(String[] args) {
		Arr a = new Arr();
		Random r = new Random();
		Scanner in = new Scanner(System.in);
		Timer1 timer = new Timer1();
		int point = 100;
		int[] cnt = new int[5];
		int bomb = 0;
		new Thread(() -> {
            try {
                Thread.sleep(5000);  // 100초의 시간제한
                stop = true;
            } catch (InterruptedException e) {
            	e.printStackTrace();
            }
        }).start(); 
		
		
		
		System.out.println("<1> 초급  <2> 중급  <3> 고급");
		
		// 난이도 선택 코드
		Level.level(in, cnt);
		System.out.println("Game Start!!!");
		
		// 게임 실행 코드
		Game.game(a, r, in, point, cnt, bomb);
	}
}
