package arrays.practice;

import java.util.ArrayList;
import java.util.List;

public class RearrangeArrayElementsBySignBruteForce {

    public static void main(String[] args) {

        int[] nums = {-8, 2, 4, 5, -1, -3, -4, 48};
        int[] ints = rearrangeElements(nums);

        for (int i : ints) {
            System.out.println(i);
        }


    }

    public static int[] rearrangeElements(int[] nums) {

        List<Integer> postiveList = new ArrayList<>();
        List<Integer> negativeList = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                postiveList.add(nums[i]);
            } else {
                negativeList.add(nums[i]);
            }
        }

        int[] tempArr = new int[nums.length];

        int count = 0;
        for (int i = 0; i < postiveList.size(); i++) {
            tempArr[count++] = postiveList.get(i);
            tempArr[count++] = negativeList.get(i);
        }

        return tempArr;
    }

}
