package Mcqs;


class A {
    static {
        System.out.println("Static block A");
    }
}

class B extends A {
    static {
        System.out.println("Static block B");
    }
}
class Cass
{
	public int add(){
		System.out.println("deep");
		return 10;
	}
	{
		System.out.println("raji");
	}
}
public class Object {
    public static void main(String args[]) {
       //  A b = new B();
        Cass c = new Cass();
        c.add();
    }
}
