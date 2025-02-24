package practiceprograms;

public class Antontherail {

	public static void main(String[] args) {
//		int n[] = {1, -1, -1, 1, 1};
      int n[] = {-1, -1, -1, -1,-1 };
//		int n [] = {1,-1 ,1 ,1,1, -1, 1};
		int sum=0, count=0;
//		int n [] = {-1, -1, 1 , 1, 1, -1, -1, 1};
		for(int i=0;i<n.length;i++) {
			 sum+=n[i];
			 System.out.println(sum);
			if(sum==0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
