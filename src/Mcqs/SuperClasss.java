package Mcqs;

public class SuperClasss {
	public static void main(String args[]) 
    { 
        subClass get = new subClass(); 
        System.out.println("x = " + get.calc(0, 1)); 
    } 

}
java.util.concurrent.ConcurrentHashMap
class superClass 

{ 
	superClass(){
		System.out.println("hiii");
	}
} 
class subClass extends superClass 
{ 
    public int calc(int a, int b) 
    { 
        return 1; 
    } 
} 
