package Mcqs;

public class StaticBlocks {

	static int num; 
	static String mystr; 

	// constructor 
	StaticBlocks() 
	{ 
//		num = 100; 
//		mystr = "Constructor"; 
	} 

	// First Static block 
	{ 
		System.out.println("Static Block 2"); 
		num = 98; 
		mystr = "Block2"; 
	} 

	{ 
		System.out.println("Static Block 1"); 
		num = 68; 
		mystr = "Block1"; 
	} 

	// Second static block 
	
	
	public static void main(String args[]) 
	{ 
		{ 
			System.out.println("Static Block 2"); 
			num = 98; 
			mystr = "Block2"; 
		} 

		StaticBlocks a = new StaticBlocks(); 
		System.out.println("Value of num = " + a.num); 
		System.out.println("Value of mystr = " + a.mystr); 
	} 
} 
