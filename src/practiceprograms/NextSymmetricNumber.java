package practiceprograms;

public class NextSymmetricNumber {

	public static void main(String[] args) {
		int n=7;
		//String a = Integer.toBinaryString(n);
//		String s ="";
//		char[] ar = a.toCharArray();
//		char br[] = new char[ar.length];
//		for(int i=0;i<br.length;i++) {
//			
//				br[i]='1';
//			
//			s+=br[i];
//			//System.out.print(s);
//			
//		}
//		int res = Integer.parseInt(s, 2);
//		System.out.println(res);
		int count=0, res=0;
		for(int i = n+1;i<Integer.MAX_VALUE;i++) {
			int k =i;
			String s = Integer.toBinaryString(k);
			System.out.println(s);
			for(int j =0;j<s.length();j++) {
				if(s.charAt(j)=='1') {
					count++;
				}
				
			}
			res =i;
			if(count==s.length()) {
				break;
			}		
			count=0;
		}
		System.out.println(res);
		
		
	}
	

}
