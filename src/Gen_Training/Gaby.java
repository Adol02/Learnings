package meetprograms;
import java.util.*;
public class Gaby {
    public static void main(String[] args) {
        int[] racks = {3,6,7,11};
        int time = 8;
        int result = minimumPlayingSpeed(racks, time);
        System.out.println("Minimum playing speed: " + result);
    }
 
    public static int minimumPlayingSpeed(int[] racks, int time) {
        int left = 1;
        int maximumElementFromArray = Arrays.stream(racks).max().getAsInt();
        int right = maximumElementFromArray;
        int minimumRangeToPlayInHrs = Integer.MAX_VALUE;  //2^31-1
 
        while (left <= right) {
            int counter = 0;
            int gabyCapacity = left + (right - left) / 2;
            for (int i = 0; i < racks.length; i++) {
                counter += (int) Math.ceil((double) racks[i] / gabyCapacity);
            }
 
            if (counter <= time) {
                minimumRangeToPlayInHrs = Math.min(minimumRangeToPlayInHrs, gabyCapacity);
                right = gabyCapacity - 1;
            } else {
                left = gabyCapacity + 1;
            }
        }
 
        return minimumRangeToPlayInHrs;
    }
 
}
 
