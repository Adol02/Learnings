package FunctionalInterface;
import java.util.HashMap;
import java.util.Map;

@FunctionalInterface
interface ER{

	int aMethod(String s);
	
}
public class ConsumerEx {
	
//    
	public static void main(String[] args) {
		int arr[] = {1, 2, 1, 2,3, 4, 6};
		Map<Integer, Integer> map = new HashMap<>();
		int count =0;
		for(int i =0;i<arr.length-1;i++){ 
			count =0;
			for(int j =i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count+=1;
				}
			}
			map.put(arr[i], count);
	}
}
}

//    	 Consumer<String> c = str -> str.length();
////    	 String g = "2";
//    	 ER s = (g) -> Integer.parseInt(g);
//    	 
//    	 s.aMethod("45");
//    	 
////    	 ER a =(String s) -> 1;
//    	 System.out.print( s.aMethod("45"));
//    	 
//	}
//
//	@Override
//	public int aMethod(String s) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//}
