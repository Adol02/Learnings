package Mcqs;
//

class ded{
	 static void h() {System.out.println("hi");}
}
public class Person extends ded {
	int r=10;
	 static void h() { 
		
	 System.out.println("hhei");
	 }
    String name;
    int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void main(String[] args) {
        Person person = new Person("John", 25);
        System.out.println(r);
        person.h();
    }
}

//
//public class Person {
//    String name;
//    int age;
//    
//    public Person() {
//    }
//    public static void main(String[] args) {
//        Person person = new Person();
//        person.name = "john";
//        person.age= 25;
//    }
//}
//
//public class Person {
//    String name;
//    int age;
//    
//    public Person() {
//    }
//    public static void main(String[] args) {
//        Person person = new Person();
//        person.setName("john");
//        person.setAge(25);
//    }
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
//}

