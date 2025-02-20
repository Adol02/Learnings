package Mcqs;
import java.util.*;  
public class TestJavaCollections5{  
public static void main(String args[]){  
//PriorityQueue<String> queue=new PriorityQueue<String>();  
//queue.add("Amit Sharma");  
//queue.add("Vijay Raj");  
//queue.add("JaiShankar");  
//queue.add("Raj"); 
	
PriorityQueue<Integer> q=new PriorityQueue<>();  
q.add(12);  
q.add(5);  
q.add(10);  
q.add(3);  
System.out.println("head:"+q.element());  
System.out.println("head:"+q.peek());  
System.out.println("iterating the queue elements:");  
Iterator itr=q.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
q.remove();  
q.poll();  
System.out.println("after removing two elements:");  
Iterator<Integer> itr2=q.iterator();
while(itr2.hasNext()){  
System.out.println(itr2.next());  
}  
}  
}  
