package practiceprograms;

public class Vowelpermutations {
	public static void main(String[] args) {
		String s = "frfrtu";
		int count=0;
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!='A' &&ch[i]!='E' &&ch[i]!='I' &&ch[i]!='O' &&ch[i]!='U' &&
					ch[i]!='a' &&ch[i]!='e' &&ch[i]!='i' &&ch[i]!='o' && ch[i]!='u') {
				count+=1;
			}
		}
		System.out.println(count);
		
		int mul =1;
		for(int i=count;i>1;i--) {
			mul*=i;
		}
		if(count==0)
		System.out.println(0);
		else
			System.out.println(mul);
	}
}
