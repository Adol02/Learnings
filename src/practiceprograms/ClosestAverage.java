package practiceprograms;

public class ClosestAverage {

	public static void main(String[] args) {
		int n[] = {4, 10, 24, 30, 40};
		int c=0;
		for(int i=0;i<n.length;i++) {
			c+=n[i];
		}
		int avg = c/n.length;
		System.out.println(avg);
		int p=Integer.MAX_VALUE;
		int d=0;
		for(int i=0;i<n.length;i++) {
			d= Math.abs(avg-n[i]);
			p = Math.min(p, d);
		}
		System.out.println(p+avg);
	}

}
