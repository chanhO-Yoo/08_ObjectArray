package kh.java.object.array;

/*
 * VO클래스
 * 데이터를 담는 용도의 클래스
 * DO : Domain Object
 * Entitiy : db관련 용어
 * VO : Value Object
 * DTO : Data Transfer Object
 * Bean ; jsp
 */
public class Person {

	private String name;
	private int age;
	
	//기본 생성자
	public Person() {
		
	}
	
	//파라미터 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//getter,setter
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	//모든 필드의 값을 조회할 수 있는 메서드
	public String getPersonInfo() {
		return "[name = "+name+", age = "+age+"]";
	}
}
