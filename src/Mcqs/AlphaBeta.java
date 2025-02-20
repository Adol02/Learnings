package Mcqs;

class Alpha { 
	public  static String  type = "a "; 
	public Alpha() { System.out.print("alpha "); } 
	void go() {}
	void come() {}
} 

class Beta extends Alpha {
	
	
	public Beta() { 
		System.out.print("beta "); 
		
		} 
	void go() 
	{ 
	    type = "b ";
		System.out.print(this.type +" "+ super.type); 
	} 
	void come() {
		type = "c ";
		
	}
	//String type ="tri";
}
class Gamma extends Beta{
	
}
public class AlphaBeta{

	public static void main(String[] args) 
	{ 
		Alpha a = new Beta();
		System.out.println(a.type);
//	   obj.go();
////		Alpha a = new Alpha();
////		System.out.println(a.type);
//		Gamma g = new Gamma();
////		System.out.println();
//		g.go();
//		
		
	} 
} 
