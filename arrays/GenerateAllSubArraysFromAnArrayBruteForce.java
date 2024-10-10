package arrays;

public class GenerateAllSubArraysFromAnArrayBruteForce {
    public static void main(String[] args) {

        int[] nums = {2, 3, 5, -2, 7, -4};
        generateSubArrays(nums);

    }

    public static void generateSubArrays(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(nums[k] + " ");
                }
                System.out.println();
            }

        }
    }
}
