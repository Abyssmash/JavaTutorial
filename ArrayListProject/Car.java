package ArrayListProject;

import java.util.ArrayList;
import java.util.Scanner;

public class Car {
	String carFrontNum = null;
	String carBackNum = null;
	String carNum = null;
	String[] classification = {"입주민", "방문객"};

	public ArrayList carAdd(int classificationNum, String pwd) {
		Scanner in = new Scanner(System.in);
		ArrayList<String> carInfo = null;
		System.out.println("차량 앞번호를 입력해주세요.");
		carFrontNum = in.nextLine();
		System.out.println("차량 뒷번호를 입력해주세요.");
		carBackNum = in.nextLine();
		carNum = carFrontNum + carBackNum;
		if(classificationNum == 1) {
			carInfo = new ArrayList<>();
			carInfo.add(carNum);
			carInfo.add(classification[0]);
			carInfo.add(pwd);
		} else {
			carInfo = new ArrayList<>();
			carInfo.add(carNum);
			carInfo.add(classification[1]);
			carInfo.add(pwd);
		}
		return carInfo;
	}
}
