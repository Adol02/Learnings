package practiceprograms;

import java.util.Scanner;

public class Country_code {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
//		if(s.charAt(2)=='-' && s.length()==13) {
//			System.out.println(s.charAt(0)+""+s.charAt(1));
//		}
//		else {
//			System.out.println("NF");
//		}
		
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(Character.isDigit(ch[i]) && ch.length ==13) {
				if(ch[2]=='-') {
					System.out.println(ch[0]+""+ch[1]);
					break;
				}
				else {
					System.out.println("NF");
					break;
				}
			}
			else {
				System.out.println("NF");
				break;
			}
			
			
		}
		
	}

}
