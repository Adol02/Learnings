package Mcqs;

public class Complex {
	public static void main(String[] args) { 
		Complex1 c1 = new Complex1(); 
		Complex1 c2 = new Complex1(c1); 
		System.out.println(c2); 
	} 
}
//file name: Main.java 

class Complex1 { 
	private double re, im;	 
//	public String toString() { 
//		return "(" + re + " + " + im + "i)"; 
//	} 
	Complex1(){}
	
	Complex1(Complex1 c) { 
		re = c.re; 
		im = c.im; 
	} 
} 

