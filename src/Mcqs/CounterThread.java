package Mcqs;

public class CounterThread {
	 public static void main(String[] args) {
		 Noshare s1 = new Noshare();
		 Noshare s2 = new Noshare();
       Thread t1 = new Thread(()-> {
    	   for(int i=0;i<10;i++) {
    		   s1.test1();
    	   }
       }); 
       Thread t2 = new Thread(()-> {
    	   for(int i=0;i<10;i++) {
    		   s2.test1();
    	   }
       });
       t1.setName("im1");
       t1.start();
       t2.setName("im2");
       t2.start();
       //System.out.println(s1.getCount());
}
}
class Noshare {
	static int count =0;
	
	synchronized static public void test1() {
     
        	count++;
        	System.out.println(Thread.currentThread().getName());
           System.out.println(count); 
	}
//	public int getCount() {
//		return count;
//	}
}







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
