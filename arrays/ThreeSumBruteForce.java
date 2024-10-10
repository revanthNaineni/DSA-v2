package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSumBruteForce {

	public static void main(String[] args) {
		int nums[] = { 2, -2, 0, 3, -3, 5,3,-3 };

		Set<List<Integer>> set = new HashSet<List<Integer>>();

		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					if (nums[i] + nums[j] + nums[k] == 0) {
						List<Integer> list = new ArrayList<Integer>();
						list.add(nums[i]);
						list.add(nums[j]);
						list.add(nums[k]);
						Collections.sort(list);
						set.add(list);
					}
				}
			}
		}
		List<List<Integer>> lists=new ArrayList<List<Integer>>(set);
		System.out.println(lists);

	}

}
