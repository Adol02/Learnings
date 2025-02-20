package Mcqs;

public class ThreadStates {
public static void main(String[] args) {
	SharedQ s = new SharedQ();
	Prod p = new Prod(s);
	Cons c = new Cons(s);
	p.start();
	c.start();
}
}
class SharedQ{
	synchronized void produce(int v) {
		
		System.out.println("produced value "+v);
	}
	synchronized void consume() {
		if
	}
}
class Prod extends Thread{
	private SharedQ sharedQ;
	Prod(SharedQ sharedQ){
		this.sharedQ = sharedQ;
	}
	public void run() {
		for(int i =0;i<10;i++) {
			sharedQ.produce(i);
		}
	}
}
class Cons extends Thread{
	private SharedQ sharedQ;
	Cons(SharedQ sharedQ){
		this.sharedQ = sharedQ;
	}
	public void run() {
		for(int i =0;i<10;i++) {
			sharedQ.consume(i);
		}
	}
}
