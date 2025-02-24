package practiceprograms;

public class Findx {

	public static void main(String[] args) {
		int z1=19;
		int z2=13;
		int z3=7;
		int x1= (z1-5)/2;
		int x2 = (z2-5)/2;
		int x3 = (z3-5)/2;
		int y=0;
		
		for(int i=1;i<=32;i++) {
			int n = i^x1;
			int c1=0,c2=0,c3=0;
			while(n!=0) {
				n = n&n-1;
				c1+=1;
				if(c1==1) {
					int m = i^x2;
					while(m!=0) {
						m = m&m-1;
						c2+=1;
					}
						if(c1==1 && c2==1) {
							int o = i^x3;
							while(o!=0) {
								 o= o&o-1;
								  c3+=1;
						}
					}
				}
			}
				if(c1==1&&c2==1&&c3==1) {
					y=i;
				}
		}
		System.out.println(y);
		
	}

}
