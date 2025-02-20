package Mcqs;

class Util {
	// Util class to sleep a thread
	static void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

// This class is shared by both threads
class Shared {
	// first synchronized method
	synchronized static void test1(Shared b) {
		System.out.println(Thread.currentThread().getName() + " enters test1 of " );

		//Util.sleep(1000);
		// taking object lock of s2 enters
		// into test2 method
		b.test2();
		System.out.println(Thread.currentThread().getName() + " exits test2 of ");
	}

	synchronized static void test2() {
		System.out.println(Thread.currentThread().getName() + " enters test3 of " );
	//	Util.sleep(1000);
		// taking object lock of s1 enters
		// into test1 method
		System.out.println(Thread.currentThread().getName() + " exits test4 of " );
	}
}

class Thread1 extends Thread {
	private Shared s1;
	private Shared s2;

	// constructor to initialize fields
	public Thread1(Shared s1, Shared s3) {
		this.s1 = s1;
		this.s2 = s3;
	}

	// run method to start a thread
	@Override
	public void run() {
		s1.test1(s2);
	}
}

class Thread2 extends Thread {
	private Shared s1;
	private Shared s2;

	// constructor to initialize fields
	public Thread2(Shared s1, Shared s2) {
		this.s1 = s1;
		this.s2 = s2;
	}

	// run method to start a thread
	@Override
	public void run() {
		s2.test1(s1);
	}
}

public class Deadlock {
	public static void main(String[] args) {
		        Shared s1 = new Shared();
		        Shared s2 = new Shared();
//		        Shared s3 = new Shared();

		        Thread1 t1 = new Thread1(s1, s2);
		        t1.setName("Thread1");
		        t1.start();

		        Thread2 t2 = new Thread2(s1, s2);
		        t2.setName("Thread2");
		        t2.start();

		        // Creating and starting a third thread
//		        Thread t3 = new Thread(new Runnable() {
//		            @Override
//		            public void run() {
//		                synchronized (s3) {
//		                    System.out.println(Thread.currentThread().getName() + " enters sync block of s3");
//		                    Util.sleep(500);
//		                    synchronized (s2) {
//		                        System.out.println(Thread.currentThread().getName() + " enters sync block of s2");
//		                    }
//		                }
//		            }
//		        });
//		        t3.setName("Thread3");
//		        t3.start();
//		        
		    }
//    Thread2 enters test1 of Mcqs.Shared@2335dbc6
//    Thread1 enters test1 of Mcqs.Shared@70bf13
}

//
//class Shared {
//	synchronized void test1(Shared b) {
//        synchronized (this) {
//            System.out.println(Thread.currentThread().getName() + " enters test1 of " + this);
//
//            synchronized (b) {
//                b.test2();
//            }
//
//            System.out.println(Thread.currentThread().getName() + " exits test1 of " + this);
//        }
//    }
//
//    synchronized void test2() {
//        synchronized (this) {
//            System.out.println(Thread.currentThread().getName() + " enters test2 of " + this);
//            System.out.println(Thread.currentThread().getName() + " exits test2 of " + this);
//        }
//    }
//}
//
//public class Deadlock {
//    public static void main(String[] args) {
//        Shared s1 = new Shared();
//        Shared s2 = new Shared();
//
//        Thread t1 = new Thread(() -> s1.test1(s2));
//        t1.setName("Thread1");
//
//        Thread t2 = new Thread(() -> s2.test1(s1));
//        t2.setName("Thread2");
//
//        t1.start();
//        t2.start();
//    }
//}
//
