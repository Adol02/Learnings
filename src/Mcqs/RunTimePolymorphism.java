package Mcqs;

public class RunTimePolymorphism {

    public static void main(String[] args) 
    { 
        C a = new D(); 
        D b = new D(); 
          
        System.out.println(a.c + " " + a.getValue()  
            + " " + b.getValue() + " " + b.getSuperValue()); 
    } 
} 
  
class C 
{ 
    protected char c = 'A'; 
    char getValue() 
    { 
        return c; 
    } 
} 
  
class D extends C
{ 
    protected char c = 'B'; 
//    char getValue() 
//    { 
//        return c; 
//    } 
    char getSuperValue() 
    { 
        return c; 
    } 
} 
