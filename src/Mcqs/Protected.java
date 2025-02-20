package Mcqs;

public class Protected {
	public static void main(String args[]) { 
		Derived d = new Derived(); 
		d.foo(); 
	} 
}
//file name: Main.java 

class Base { 
	 void foo() {} 
} 
class Derived extends Base { 
	protected void foo() {} 
} 
