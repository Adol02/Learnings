package Mcqs;
class Outers {
	Outers(){
		System.out.println("hiii i am outer");
	}
    void display() {
        System.out.println("Outer display");
    }
    void see() {
    	System.out.println("deepz");
    }
}
     class Inner extends Outers {
    	 Inner(){
    		 System.out.println("hiii i am inner");
    	 }
        @Override
        void display() {
//            super.display(); // Calls Outer display method
            System.out.println("Inner display");
        }   
    }
public class Outer{
    public static void main(String[] args) {
   Inner o=new Inner();
   o.display();
o.see();
    }
}
