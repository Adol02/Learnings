package practiceprograms;

public class PrefixgreaterXOR {

	public static void main(String[] args) {
		int spl =0;
		//int ar[]= {3,8,7,1,2,1,3,4,2};
//	  int ar[] = {4, 2, 5, 7,1, 3};
		int ar[] = {4, 3, 2, 9};
	    // int ar[] = {3, 8, 7, 1, 2, 6, 4, 5};
		int prefixsum=0;
		
		for(int i=0;i<ar.length;i++) {
			int suffixsum=0;
			prefixsum^=ar[i];
			//System.out.print("prefix "+prefixsum);
			//System.out.println();
			for(int j=i+1;j<ar.length;j++) {
				suffixsum^=ar[j];
			}
			//System.out.println("suffixsum "+suffixsum);
			if(prefixsum>=ar[i] &&suffixsum<ar[i]) {
				spl = i;
				System.out.println(ar[i]);
				break;
			}	
		}
		System.out.print(spl);

	}

}
