package practiceprograms;

public class Vowelfactorial {

	public static void main(String[] args) {
		String[] arr = {"eio"};
		int p = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			char ch[] = arr[i].toCharArray();
			int count=0;
			for(int j=0;j<ch.length;j++) {
				if(ch[j]!='a'&&ch[j]!='e' && ch[j]!='i'&& ch[j]!='o' && ch[j]!='u' &&
						ch[j]!='A' &&ch[j]!='E' && ch[j]!='I'&& ch[j]!='O' && ch[j]!='U') {
					count++;
				}
			}
			int a = fact(count);
			p = Math.max(a, p);
		}
		System.out.println(p);
	}
	public static int fact(int n) {
		if(n==0)
			return 0;
		int mul =1;
		for(int i=n;i>1;i--) {
			mul*=i;
		}
		return mul;
	}

}
