package kh.java.oop.student.controller;

import java.util.Arrays;
import java.util.Scanner;

import kh.java.oop.student.model.vo.Student;

public class StudentManager {
	private Scanner sc = new Scanner(System.in);
	
	//관리할 학생 객체
	private Student[] s;
	
	public static final int MAX_STUDENT = 10;
	
	//Student[]의 인덱스 관리 변수
	int studentIndex=0;
	
	public StudentManager() {
		//학생 객체 할당
		s = new Student[MAX_STUDENT];
	}
	
	//사용자 입력값을 받아 필드 대입하는 메서드
	public void insertData() {
		//최대 MAX_STUDENT만큼 학생 정보 입력
//		for(studentIndex=0;studentIndex<MAX_STUDENT;studentIndex++)
		while(studentIndex < MAX_STUDENT) {

			System.out.print("학생 이름 : ");
			String name = sc.next();
			
			System.out.print("반 이름 : ");
			char classroom = sc.next().charAt(0);
			
			System.out.print("학생 번호 : ");
			int no = sc.nextInt();
			
			s[studentIndex] = new Student(name, classroom, no);

			//다음 인덱스에 학생객체 입력을 위해 인덱스 1증가
			studentIndex++;
			
			//사용자에게 추가입력 여부 확인
			System.out.print("추가 입력하시겠습니까?(y/n) : ");
			char yn = sc.next().charAt(0);
			if(yn=='n') {
				break;
			}
		}
		
	}
	
	//학생 정보 출력 메서드
	public void printData() {
		for(int i=0;i<studentIndex;i++) {
			System.out.println(s[i].getStudentInfo());			
		}
		
		//전체 학생 객체 배열 s 확인
		System.out.println(Arrays.toString(s));
	}

}
