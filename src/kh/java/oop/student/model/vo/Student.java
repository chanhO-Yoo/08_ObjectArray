package kh.java.oop.student.model.vo;

public class Student {
	//field
	private String name;
	private char classroom;
	private int no;
	
	//기본생성자
	public Student() {
		
	}
	
	//파라미터 생성자
	public Student(String name, char classroom, int no) {
		this.name = name;
		this.classroom = classroom;
		this.no = no;
	}
	
	//getter, setter
	public void setName(String name) {
		this.name=name;
	}
	public void setClassroom(char classroom) {
		this.classroom=classroom;
	}
	public void setNo(int no) {
		this.no=no;
	}
	
	public String getName() {
		return name;
	}
	public char getClassroom() {
		return classroom;
	}
	public int getNo() {
		return no;
	}
	
	//모든 필드값 조회용 메서드
	public String getStudentInfo() {
		return "[name = "+name+", classroom = "+classroom+", no = "+no+"]";
	}
	
	
}
