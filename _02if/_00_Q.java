package _02if;

public class _00_Q {

	public static void main(String[] args) {
		int point=20;
		int x=40; //x는 화살의 위치이며 화살의 위치는 달라진다.
		if(x>=0 && x <= 12) {
			point+=10;
			if(x>=0 && x<=1) {
				point += point*0.1;
			}
				point+=10;
		}else if(x <= 20) {
			point+=9;
	    }else if(x <= 30) {	
	    	point+=8;
	    }else if(x > 30) {
	    	point+=7;
	    }
	    System.out.println(point);
	}
}
