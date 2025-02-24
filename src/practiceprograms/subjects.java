package practiceprograms;

import java.util.Arrays;
import java.util.Scanner;

public class subjects {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum =0;
		System.out.println("enter a");
		int a = sc.nextInt();
		System.out.println("enter b");
		int b = sc.nextInt();
		int ar[] = new int[a];
		int br[] = new int[a];
		int cr[] = new int[a];
		System.out.println("enter array 1");
		for(int i=0;i<a;i++) {
			ar[i]=sc.nextInt();
		}
		System.out.println("enter array 2");
		for(int i=0;i<a;i++) {
			br[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++) {
			cr[i] = br[i]-ar[i];
			System.out.print(cr[i]+" ");
		}
		Arrays.sort(cr);
		for(int i=a-b;i<a;i++) { //12 11 20 10 25 0
			sum += cr[i];
			System.out.println(sum); //6 11 36 8 24 30
		}
		if(sum>=35) {
			System.out.println("qualified "+sum);
		}
		else {
			System.out.println("disqualified "+sum);
		}
	}

}
