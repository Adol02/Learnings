package Mcqs;

interface Showable {  
    void show();  

    interface Message {  
        void msg();  

        class hfg {
            void hi() {
                System.out.println("hi");
            }
        }
    }  
}  

class TestNestedInterface1 implements Showable {  
    public void msg() {
        System.out.println("Hello nested interface");
    }  

   
    public void show() {
    	System.out.print("hi");
    }
    public static void main(String args[]) {  
//        Showable.Message message = new TestNestedInterface1(); // upcasting here  
//        message.msg();  
        
        // Accessing the hfg class
        Showable.Message.hfg hfgInstance = new Showable.Message.hfg();
        hfgInstance.hi();
    }


}  
