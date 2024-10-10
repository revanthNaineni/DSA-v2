package arrays.practice;

public class LeftRotatedArrayByNPositionsOptimal {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3;
        //System.out.println(4%7);
        int[] arr1 = leftRotate(arr, k);
        for (int i : arr1) {
            System.out.println(i);
        }
    }

    public static int[] leftRotate(int[] nums, int k) {
        k = k % nums.length;

        reverseArray(nums, 0, k - 1);

        reverseArray(nums, k, nums.length - 1);

        reverseArray(nums, 0, nums.length - 1);

        return nums;

    }

    public static void reverseArray(int[] nums, int start, int end) {
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}
