package meetprograms;

public class GasCount {
	 
	public static int alanRoamingAround(int[] gasLeft, int[] gasCost) {
        int gasCount = 0;
        int shortageForUs = 0;
        int startingIndexSolutionForUs = 0;
 
        for (int i = 0; i < gasLeft.length; i++) {
            gasCount += (gasLeft[i] - gasCost[i]);
            if (gasCount < 0) {
                shortageForUs += gasCount;
                gasCount = 0;
                startingIndexSolutionForUs = i + 1;
            }
        }
 
        return gasCount + shortageForUs >= 0 ? startingIndexSolutionForUs : -1;
    }
	public static void main(String[] args) {
        int[] gasLeft = {1, 2, 3, 4, 5}; // Gas left at each station
        int[] gasCost = {3, 4, 5, 1, 2}; // Gas cost to travel to the next station
        
        int startingIndex = alanRoamingAround(gasLeft, gasCost);
        System.out.println("Starting index: " + startingIndex);
    }
}
 
