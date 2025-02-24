package meetprograms;
import java.util.*;
public class CandidateNumbers {
	
		
	    public List<List<Integer>> combinationSum(int[] candidates, int target) {
	        Arrays.sort(candidates);
	        List<List<Integer>> result = new ArrayList<>();
	        numberComb(result, new ArrayList<>(), candidates, target, 0);
	        return result;
	    }
	
	    private void numberComb(List<List<Integer>> result, List<Integer> tempList, int[] candidates, int remain, int start) {
	        if (remain == 0) {
	            result.add(new ArrayList<>(tempList));
	            return;
	        }
	        for (int i = start; i < candidates.length && candidates[i] <= remain; i++) {
	            if (i > start && candidates[i] == candidates[i - 1]) {
	            	continue; // Skip duplicates
	            }
	            //System.out.println( "tl: "+tempList);
	            tempList.add(candidates[i]);
	            //System.out.println("start: "+start);
	           // System.out.println("remain: "+remain);
	            numberComb(result, tempList, candidates, remain - candidates[i], i + 1);
	           //System.out.println(tempList);
	           // System.out.println("i"+i);
	           // System.out.println("start2: "+start);
	           //System.out.println("remain2: "+remain);
	            tempList.remove(tempList.size() - 1);
	            i++;
	            System.out.println(tempList);  
	        }
	        return;
	        
	    }
	
	    public static void main(String[] args) {
	        int[] candidates = {2,1,5,2,2};
	        int target = 5;
	        CandidateNumbers combinationSum = new CandidateNumbers();
	        List<List<Integer>> combinations = combinationSum.combinationSum(candidates, target);
	        System.out.println("Combinations that sum up to " + target + ":");
	        
	            System.out.println(combinations);
	        
	    }
}
