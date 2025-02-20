package Mcqs;

public class Three {
	
	public static void main (String[] args) 
	{ 
//		Four f = new Four();
//		f.run();
		new Thread(new Two(),"gfg1").start(); 
	} 

}
class One implements Runnable 
{ 
	public void run() 
	{ 
		System.out.println(Thread.currentThread().getName()); 
		System.out.println("hi");
	} 
	public void runs() {
		System.out.println("deepa");
	}
} 
class Two implements Runnable 
{ 
	@Override
	public void run() 
	{ 
		new One().runs(); 
		new Thread(new One(),"gfg2").run(); 
	   Thread gfg2=new Thread(new One(),"gfg2");
		gfg2.start();
		new Thread(new One()).start();
		new Thread(new One(),"gfg3").start(); 
	} 
} 
class Four extends Thread{
	public void run() {
	System.out.println("start");
	}
}
 
