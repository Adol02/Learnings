package Mcqs;

//Java program to demonstrate thread states
class thread implements Runnable {
	public void run() {
		// moving thread2 to timed waiting state
		try {
//			System.out.println("hiii"+Thread.currentThread().getName());
//			System.out.println("ki"+Test.thread1.getState());
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("State of thread1 while it called join() method on thread2 -" + Test.thread2.getState());
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class Test implements Runnable {
	public static Thread thread1;
	public static Test obj;
	public static Thread thread2;

	public static void main(String[] args) {
		obj = new Test();
		thread1 = new Thread(obj);

		// thread1 created and is currently in the NEW
		// state.
		System.out.println("State of thread1 after creating it - " + thread1.getState());
		thread1.start();

		// thread1 moved to Runnable state
		System.out.println("State of thread1 after calling .start() method on it - " + thread1.getState());
	}

	public void run() {
		thread myThread = new thread();
		thread2= new Thread(myThread);

		System.out.println("State of thread2 after creating it - " + thread2.getState());
		thread2.start();

		System.out.println("State of thread2 after calling .start() method on it - " + thread2.getState());

		try {
			System.out.println(Thread.currentThread().getName());
			System.out.println("oil"+thread1.getState());
			
			Thread.sleep(200);
			System.out.println(Thread.currentThread().getName());
			System.out.println(thread2.getState());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("State of thread2 after calling .sleep() method on it - " + thread2.getState());

		try {

			thread2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("State of thread2 when it has finished it's execution - " + thread2.getState());
	}
}
