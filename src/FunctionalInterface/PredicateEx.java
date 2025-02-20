package FunctionalInterface;

import java.util.function.Predicate;

public class PredicateEx {
	public static void main(String[] args) {
		Predicate<String> p = str -> str.length()>6;
		System.out.println(p.test("happy"));	
	}
	
	

}
