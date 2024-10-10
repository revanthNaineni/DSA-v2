package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSumBetter {

	public static void main(String[] args) {
		int[] nums = { 1,0,-1,0,-2,2 };
		int target = 0;
		List<List<Integer>> lists = fourSum(nums, target);
		System.out.println(lists);

	}

	private static List<List<Integer>> fourSum(int[] nums, int target) {
		Set<List<Integer>> sets = new HashSet<List<Integer>>();
		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				Set<Long> hashset = new HashSet<>();
				for (int k = j + 1; k < nums.length; k++) {
					long sum = (long) nums[i] + nums[j] + nums[k];
					long fourth = target - sum;

					if (hashset.contains(fourth)) {
						List<Integer> list = new ArrayList<Integer>();
						list.add(nums[i]);
						list.add(nums[j]);
						list.add(nums[k]);
						list.add(target - (nums[i] + nums[j] + nums[k]));
						Collections.sort(list);
						sets.add(list);
					}
					hashset.add((long) nums[k]);
				}
			}
		}
        return new ArrayList<List<Integer>>(sets);
	}

}
