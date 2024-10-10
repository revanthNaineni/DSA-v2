package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSumBruteForce {

	public static void main(String[] args) {
		int nums[] = { -5, 5, 4, -3, 0, 0, 4, -2 };
		int target = 8;
		List<List<Integer>> lists = fourSum(nums, target);
		System.out.println(lists);

	}

	private static List<List<Integer>> fourSum(int[] nums, int target) {
		Set<List<Integer>> sets = new HashSet<List<Integer>>();
		for (int i = 0; i < nums.length - 3; i++) {
			for (int j = i + 1; j < nums.length - 2; j++) {
				for (int k = j + 1; k < nums.length - 1; k++) {
					for (int l = k + 1; l < nums.length; l++) {
						if (nums[i] + nums[j] + nums[k] + nums[l] == target) {
							List<Integer> list = new ArrayList<Integer>();
							list.add(nums[i]);
							list.add(nums[j]);
							list.add(nums[k]);
							list.add(nums[l]);
							Collections.sort(list);
							sets.add(list);
						}
					}
				}
			}
		}
		List<List<Integer>> lists = new ArrayList<List<Integer>>(sets);
		return lists;
	}

}
