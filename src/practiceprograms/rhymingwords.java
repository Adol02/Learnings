package practiceprograms;

import java.util.Scanner;

public class rhymingwords {
     public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
    	 int max=0;
    	 System.out.println("enter word");
    	 String a = sc.next();
    	 StringBuilder str = new StringBuilder(a); 
    	 String st = str.reverse().toString();
    	 String result = "No word";
    	 int n = sc.nextInt();
    	 String[] ar = new String[n];
    	 System.out.println("enter words array");
    	 for(int i=0;i<n;i++) {
    		 ar[i] = sc.next();
    	 }
    	 char br[] = st.toCharArray();
    	 
    	 for(int i=0;i<n;i++) {
    		char[] temp= ar[i].toCharArray();
    		int k=0, sum=0;
    		 for(int j=temp.length-1;j>=0;j--) {
    			 
    			 if(temp[j]==br[k]) {
    				 sum+=1;
    				 k++;
    			 }
    			 else {
    				 break;
    			 }
    			 
    		 }
    		 System.out.println(sum+" "+max);
    		// System.out.println("sum"+sum);
    		 if(sum==br.length) {
    			 continue;
    		 }
    		 if(sum>max){
    			 max = sum;
    			 result = ar[i];	 
    		 
    	 }
    	 }
    	 System.out.println(result);
    	 sc.close();
     }
}
