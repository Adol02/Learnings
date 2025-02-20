package Mcqs;

public class CounterThread22 {

	 public static void main(String[] args) {
		 Noshared s1 = new Noshared();
		 Noshared s2 = new Noshared();
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
      // System.out.println(s1.getCount());
}
}
class Noshared {
	 int count =0;
	
	synchronized public void test1() {
     
        	count++;
        	System.out.println(Thread.currentThread().getName());
           System.out.println(count); 
	}
//	public int getCount() {
//		return count;
//	}
}







