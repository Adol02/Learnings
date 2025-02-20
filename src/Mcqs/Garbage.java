package Mcqs;

public class Garbage {

	public static void main(String[] args) throws InterruptedException 
	{ 
		
		Garbage g = new Garbage(); 
			
		// making str eligible for gc 
		g= null; 
			System.out.println(m());
		// calling garbage collector 
		System.gc(); 
			
		// waiting for gc to complete 
		Thread.sleep(1000); 
	
		System.out.println("end of main"); 
	} 


	protected void finalize() 
	{ 
		System.out.println("finalize method called"); 
	} 
   public static String m() {
	   try {
		   int i =1/0;
			System.out.println("try");
			return "hi";
		}
	   catch(Exception e) {
		   System.out.println("error");
		 //  return "catchomg";
	   }finally{
			System.out.println("final");
			//return "hello";
		}
	return "jiii";
   }
} 

