package practiceprograms;

import java.util.Arrays;

public class ChocolateTypes {

	public static void main(String[] args) {
		 int n = 8;
		 int type= 3 ;
		 int[] types=  {1,3,2,2,4,1,3,5};
		 int[] prices= {3,3,0,1,2,4,1,4};
		 int[] sorted = new int[prices.length];
		 for(int i=0;i<prices.length;i++) {
			sorted[i]= prices[i];
		 }
		 Arrays.sort(sorted);
		 for(int i=0;i<sorted.length;i++) {
			 
		 }

	}

}
