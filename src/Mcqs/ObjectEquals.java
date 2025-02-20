package Mcqs;

public class ObjectEquals {
	String a;
	public ObjectEquals(String n) {
		a=n;
	}
	public static void main(String[] args)
	{
//		String s1 = "HELLO";
//		String s2 = "HELLO";
		ObjectEquals s2 = new ObjectEquals("HELLO");
		ObjectEquals s3 = new ObjectEquals("HELLO");

		System.out.println(s3 == s2); // true
//		System.out.println(s1 == s3); // false
//		System.out.println(s1.equals(s2)); // true
		System.out.println(s2.equals(s3)); // true
	}
}

