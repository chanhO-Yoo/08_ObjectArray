package kh.java.oop.student.run;

import kh.java.oop.student.controller.StudentManager;

public class StudentRun {

	public static void main(String[] args) {
		//학생객체 의 관리는 StudentManager객체가 담당
		//StudentRun은 실행만 담당한다.
		StudentManager sm = new StudentManager();
		sm.insertData();
		sm.printData();
	}

}
