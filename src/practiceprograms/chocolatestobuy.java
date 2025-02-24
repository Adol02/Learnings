package practiceprograms;

import java.util.Arrays;

public class chocolatestobuy {

	public static void main(String[] args) {
		int a =3;
		int ar[] = {3,3,0,1,2,4,1,4};
		Arrays.sort(ar);
		int c=0;
		if(ar[0]==a) {
			System.out.println(ar[0]);
		}
		for(int i=0;i<ar.length;i++) {
			
			if(ar[i]<a) {
				c++;
			}
		}
		

	}

}
