package Mcqs;

public class Super {
	
  public static void main(String args[]) {
	    Parent p = new Child();
	//  p.display();
	  System.out.println(p.num);
  }
}
class Parent{
	 int num =10;
	 void display() {
		 System.out.println(num);
	 }
}
class Child extends Parent{
	int num =9;
	void display() {
		System.out.println(num);
	}
}
