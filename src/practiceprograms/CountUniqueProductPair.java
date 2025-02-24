package practiceprograms;

import java.util.HashSet;

public class CountUniqueProductPair {

	public static void main(String[] args) {
		int []nums = {18,1,3,6};
		int count=0;
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<nums.length;i++) {
			for(int j=i+1;j<nums.length;j++) {
				int a = nums[i]*nums[j];
				int b = nums[i]+nums[j];
				if(a%3==0 && !set.contains(nums[i]+nums[j])) {
					count+=1;
					set.add(b);
				}
			}
		}
		System.out.println(count);
		System.out.println(set);
	}

}
