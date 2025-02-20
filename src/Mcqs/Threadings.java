package Mcqs;

public class Threadings implements Runnable{

	 public void run() 
	    { 
	        System.out.printf("GFG "); 
	    } 
	    public static void main(String[] args) throws InterruptedException 
	    { 
	    	System.out.println(Thread.activeCount());
	        Thread thread1 = new Thread(new Threadings()); 
	        thread1.start(); 
	        System.out.println(thread1.getState()); 
	      //  thread1.start(); 
	       
	    } 

}
