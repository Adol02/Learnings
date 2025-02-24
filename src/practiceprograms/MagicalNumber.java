package practiceprograms;

public class Magicalnumber {

	public static void main(String[] args) {
	int n=7;
	int maincount=0;
	for(int i=1;i<=n;i++) {
		if(binarycount(i)%2!=0) {
			maincount+=1;
		}
	}
	System.out.println(maincount);
	}
	public static int binarycount(int n) {
		int zcount =0;
		int onec=0;
		while(n!=0) {
			int a = n%2;
			if(a==0) {
				zcount++;
			}
			if(a==1) {
				onec+=2;
			}
			n/=2;
		}
		return zcount+onec;
	}

}
