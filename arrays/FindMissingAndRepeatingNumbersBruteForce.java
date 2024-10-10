package arrays;

public class FindMissingAndRepeatingNumbersBruteForce  {
    public static void main(String[] args) {
        int[] nums = {1};
        int[] missingRepeatingNumbers = findMissingRepeatingNumbers(nums);
        for (int i : missingRepeatingNumbers) {
            System.out.println(i);
        }

    }

    public static int[] findMissingRepeatingNumbers(int[] nums) {
        int n = nums.length;
        int total = (n * (n + 1)) / 2;
        int tempArr[] = new int[2];

        for (int i = 1; i <= nums.length; i++) {
            int count = 0;

            for (int j = 0; j < nums.length; j++) {
                if (i == nums[j]) {
                    count++;
                }

            }
            if (count == 2) {
                tempArr[0] = i;

            }
            if (count == 0) {
                tempArr[1] = i;
            }

        }
        return tempArr;

    }
}
