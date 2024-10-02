package _16_Sugang;

import java.util.ArrayList;

public class Study {
	
	ArrayList <String> study = new ArrayList<>();
	
	// 과목명, 강의실, 담당교수
	String className = null;
	String classRoom = null;
	String professor = null;
	
	public void studyInfo() {
		System.out.println("과목명: "+className+"/ 강의실: "+classRoom+"/ 담당교수: "+professor);
	}
	
}
