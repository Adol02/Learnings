package practiceprograms;

public class Tickets {

	public static void main(String[] args) {
		int k =2;
		int b =5;
		int ar[] = {5,6,4,8,7};
		int john= ar[b-1];
		System.out.println(john);
		int maincount=0;
		for(int i=0;i<ar.length-1;i++) {
			int n = john;
			n^=ar[i];
			int count=0;
			while(n!=0) {
				n=n&n-1;
				count+=1;
			}
			if(count<k) {
			 maincount+=1;
			}
		}
		System.out.println(maincount);

	}

}
