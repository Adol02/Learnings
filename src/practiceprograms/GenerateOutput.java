package practiceprograms;

public class GenerateOutput {

	public static void main(String[] args) {
		int[] n ={6,7,8,3,7,5};
		int[] res = new int[n.length+1];
		res[0]= n[0];
		res[res.length-1]=n[n.length-1];
		for(int i=1;i<res.length-1;i++) {
			res[i] = Math.abs(n[i]-n[i-1]);
		}
		for(int i=0;i<res.length;i++)
          System.out.print(res[i]+" ");
	}

}
