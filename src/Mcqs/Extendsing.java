package Mcqs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class x{
	int w;
	int h;
	public x() {
		
	}
	public void m() {
		
//		System.out.println("x");
	}
}
class y extends x{
	public void m() {
		System.out.println("y");
	}
	public void m(String a) {
		System.out.println("z");
	}
}

public class Extendsing {
public static void main(String[] args) {
	
//	x x = new x();
//	x y = new y();
//	y z = new y();
//	x.m();
//	y.m();
//	z.m();
	
	List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
	List<Integer> evenNumbers = numbers.stream()
	                                   .filter(n -> n % 2 == 0)
	                                   .collect(Collectors.toList());
	System.out.println(evenNumbers);  // Output: [2, 4, 6]

}
}
