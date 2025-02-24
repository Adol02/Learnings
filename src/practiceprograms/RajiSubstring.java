package practiceprograms;

import java.util.*;

public class RajiSubstring {

	public static void main(String[] args) {
		String a= "abcdxyz";
		String b = "xyzabcd";
		HashSet<String> al = new HashSet<>();
		HashSet<String> bl = new HashSet<>();
		for(int i=0;i<a.length();i++) {
			String r = "";
			for(int j=i;j<a.length();j++) {
				r+=a.charAt(j);
				al.add(r);
			}
		}
		for(int i=0;i<b.length();i++) {
			String r = "";
			for(int j=i;j<b.length();j++) {
				r+=b.charAt(j);
				bl.add(r);
			}
		}
		int count=0;
		System.out.println(al);
		System.out.println(bl);
		for(String i : al) {
			for(String j: bl) {
				if(i.equals(j)) {
					count+=1;
				}
			}
		}
		System.out.println(count);
	}

}
