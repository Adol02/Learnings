package Mcqs;

//interface Boy extends Girl {
//    default void hello() {;
//    System.out.println("hello");
//    }
//}
@FunctionalInterface
interface Girl {

	 int sum(int a, int b);
}

public class Boyimpl implements Girl {
	
	
	
	public static void main(String[] args) {
	      Boyimpl a = new Boyimpl();
	      //a.hello();
	      System.out.println("Hello, World!");
	      Girl g = (c,b) -> 2+3;
	      

}

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
