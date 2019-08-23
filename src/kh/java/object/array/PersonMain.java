package kh.java.object.array;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person("홍길동",25);
		Person p2 = new Person("고길동",30);
		Person p3 = new Person("막길동",35);
		
		System.out.println(p1.getPersonInfo());
		System.out.println(p2.getPersonInfo());
		System.out.println(p3.getPersonInfo());
		
		//객체 배열
		Person[] pArr = new Person[3];
		for(int i=0;i<pArr.length;i++) {
			System.out.println(pArr[i]);
		}
		pArr[0]=p1;
		pArr[1]=p2;
		pArr[2]=p3;
		
		for(int i=0;i<pArr.length;i++) {
			System.out.println(pArr[i].getPersonInfo());
			System.out.println(pArr[i].hashCode());
	
		}
	}
}
