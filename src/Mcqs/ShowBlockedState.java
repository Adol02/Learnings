package Mcqs;

public class ShowBlockedState {
	
	    private static final Object lock = new Object();

	    public static void main(String[] args) {
	        Thread thread1 = new Thread(new Task(), "Thread-1");
	        Thread thread2 = new Thread(new Task(), "Thread-2");

	        thread1.start();
	        thread2.start();
	    }

	    static class Task implements Runnable {
	        @Override
	        public void run() {
	            synchronized (lock) {
	                System.out.println(Thread.currentThread().getName() + " has acquired the lock.");
	                
//	                try {
//	                    // Simulating some work with the lock held
//	                 //   Thread.sleep(5000);
//	                	System.out.println("hi");
//	                } catch (InterruptedException e) {
//	                    e.printStackTrace();
//	                }
	                System.out.println(Thread.currentThread().getName() + " is releasing the lock.");
	            }
	        }
	    }
	}


