package meetprograms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Overlappingarrays {
	 
		    public static int[][] merge(int[][] intervals) {
		        if (intervals == null || intervals.length <= 1) {
		            return intervals;
		        }
		        //{{1, 3}, {2, 6}, {8, 10}, {15, 18}};
	 
		        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
	 
		        List<int[]> result = new ArrayList<>();
		        int start = intervals[0][0];
		        int end = intervals[0][1];
	 
		        for (int[] interval : intervals) {
		            if (interval[0] <= end) {
		                // Overlapping intervals, update the end if needed
		                end = Math.max(end, interval[1]);
		            } else {
		                // Non-overlapping interval, add the previous merged interval to the result
		                result.add(new int[]{start, end});
		                // Update the start and end for the new interval
		                start = interval[0];
		                end = interval[1];
		            }
		        }
	 
		        // Add the last merged interval to the result
		        result.add(new int[]{start, end});
	 
		        return result.toArray(new int[result.size()][]);
		    }
	 
		    public static void main(String[] args) {
		        int[][] input = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
		        int[][] mergedIntervals = merge(input);
	 
		        for (int i = 0; i < mergedIntervals.length; i++) {
		            System.out.print("[");
		            for (int j = 0; j < mergedIntervals[0].length; j++) {
		                System.out.print(" " + mergedIntervals[i][j] + " ");
		            }
		            System.out.println("]");
		        }
	 
		        
		    }
		}


