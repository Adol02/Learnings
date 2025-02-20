package Mcqs;

class Mythread extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i+"Hi");
		}
	}
}
public class DaemonThread {
	public static void main(String[] args)
	{
		Mythread t1 = new Mythread();
		t1.setDaemon(true);
		t1.start();
		System.out.println("Main thread");
	}
}
