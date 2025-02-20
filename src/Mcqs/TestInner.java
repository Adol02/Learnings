package Mcqs;

interface Eatable{  
	 void eat();  
	}  

public class TestInner{  
	 public static void main(String args[]){  
	 Eatable e=new Eatable(){  
	  public void eat(){System.out.println("nice fruits");}  
	 };  
	 e.eat();  
	 }  
	}  
