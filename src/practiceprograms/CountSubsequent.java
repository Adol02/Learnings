package practiceprograms;

import java.util.ArrayList;

public class CountSubsequent {

	public static void main(String[] args) {
		int count=0;
		String s = "abdcef";
		ArrayList<String>al = new ArrayList<>();
		String sr ="";
		for(int i=0;i<s.length();i++) {
			sr="";
			for(int j=i;j<s.length();j++) {
				sr+=s.charAt(j);
				if(sr.length()==3) {
					al.add(sr);
					break;
				}
			}
		}
		System.out.println(al);
		for(String word : al) {
			char a = word.charAt(0);
			char b = word.charAt(1);
			char c = word.charAt(2);
			if(a<b && b<c && a<c) {
				count++;
			}
		}
		System.out.println(count);
	}

}
