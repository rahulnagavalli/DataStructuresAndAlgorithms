package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Given an Integer Array nums, return all the triplets [ nums[i], nums[j], nums[k] ] such that nums[i] + nums[j] + nums[k] = 0. 
// Order of the triplets doesn't matter.
public class ThreeSum {

	public static void main(String[] args) {
		int[] nums = new int[] {-1,0,1,2,-1,-4};
		System.out.println(doThreeSumOp(nums));
			
	}
	
	public static List<List<Integer>> doThreeSumOp(int[] nums) {
		Set<List<Integer>> set = new HashSet<>();
		// sort the Array in increasing order.
		Arrays.sort(nums);
		for (int i = 0; i< nums.length; i++) {
			System.out.println(nums[i]);
		}
		// -4, -1, -1, 0, 1,2
		for (int i = 0; i< nums.length; i++) {
			if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
			int l = i+1;
			int r = nums.length - 1;
			while (l <r) {
				if (nums[i] + nums[l] + nums[r] ==0) {
					set.add(Arrays.asList(nums[i], nums[l], nums[r]));
					l++;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;
                    }
				} else if (nums[l] + nums[r] < - nums[i]) {
					l = l +1;
				} else if (nums[l] + nums[r] > - nums[i]) {
					r = r-1;
				}
			}
		}
		return new ArrayList<>(set);
	}

}
