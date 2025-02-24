package practiceprograms;

public class TypesofChocolate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n[] = {7,1,2,3,4};
		int count=0;
		for(int i=0;i<n.length;i++) {
//			if(n[i]<3) {
//				count++;
//			}
			if(n[i]>=3 && n[i]%3==0 && n[i]>0) {
				count += n[i]/3;
			}
			if(n[i]<3 && n[i]>0) {
				count+=1;
			}
			if(n[i]>3 && n[i]%3!=0 && n[i]>0){
				count += (n[i]/3)+1;
			}
		}
		System.out.println(count);
		

	}

}
