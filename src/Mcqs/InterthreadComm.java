package Mcqs;

//public class InterthreadComm implements Runnable {
//	public static InterthreadComm obj;
//	private int data;
//
//	public InterthreadComm() {
//		data = 10;
//	}
//
//	public void run() {
//		obj = new InterthreadComm();
//		synchronized (obj) {
//			try {
//				obj.wait();
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			obj.data += 20;
//
//			System.out.println(obj.data);
//		}
//	}
//
//	public static void main(String[] args) throws InterruptedException {
//		Thread thread1 = new Thread(new InterthreadComm());
//		Thread thread2 = new Thread(new myThreadd());
//		thread1.setName("hi");
//		thread2.setName("ji");
//		thread1.start();
//		thread2.start();
//
//		System.out.printf(" GFG - ");
//	}
//}
//
//class myThreadd implements Runnable {
//	public void run() {
//		synchronized (InterthreadComm.obj) {
//			InterthreadComm.obj.notify();
//		}
//	}
//}

public class InterthreadComm implements Runnable {
    public static InterthreadComm obj = new InterthreadComm();
    private int data;

    public InterthreadComm() {
        data = 10;
    }

    public void run() {
    	
        synchronized (obj) {
        	
            try {
                System.out.println(Thread.currentThread().getName() + " is waiting.");
                obj.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            obj.data += 20;
            System.out.println(Thread.currentThread().getName() + " new data: " + obj.data);
        }
    }

    public  static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new InterthreadComm());
        Thread thread2 = new Thread(new MyThready());
        //Thread thread3 = new Thread(new MyThready());
        thread1.setName("Thread-1");
        thread2.setName("Thread-2");

        thread1.start();
        thread2.start();
      //  thread3.start();
        synchronized(InterthreadComm.obj) {
        	 System.out.println(Thread.currentThread().getName());
        Thread.currentThread().wait();
        }
        System.out.println("GFG -");
    }
}

class MyThready implements Runnable {
    public void run() {
        synchronized (InterthreadComm.obj) {
            System.out.println(Thread.currentThread().getName() + " is notifying.");
            InterthreadComm.obj.notifyAll();
        }
    }
}
