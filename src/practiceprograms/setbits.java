package practiceprograms;

import java.util.Scanner;

public class setbits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		//int[] res = new int[a];
		for(int i=0;i<a;i++) {
			arr[i]= sc.nextInt();
		}
		int bit = sc.nextInt();
		int maincount = 0;
		for(int i=0;i<a;i++) {
			int cnt=0;
			int n= arr[i];
			while(n>0) {
				if(n%2==1)
				cnt+=1;
				n/=2;
			}
			if(cnt==bit) {
				maincount++;
			}
		}
		System.out.println(maincount);
		
		
	}

}
