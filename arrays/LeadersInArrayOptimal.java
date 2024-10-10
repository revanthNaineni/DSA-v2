package arrays;

import java.util.ArrayList;
import java.util.List;

public class LeadersInArrayOptimal {

	public static void main(String[] args) {
		int[] fetchLeaders = fetchLeaders();
		for (int i : fetchLeaders) {
			System.out.println(i);
		}
	}

	private static int [] fetchLeaders() {
		int nums[] = { -3, 4, 5, 1, -4, -5 };
		int max = nums[nums.length - 1];
		List<Integer> list = new ArrayList<Integer>();
		list.add(max);
		for (int i = nums.length - 2; i >= 0; i--) {
			if (nums[i] > max) {
				max=nums[i];
				list.add(nums[i]);
			}
		}
		int[] result = new int[list.size()];
        for (int i = list.size() - 1; i >= 0; i--) {
            result[list.size()- 1 - i] = list.get(i);
        }
        
        return result;
	}

}
