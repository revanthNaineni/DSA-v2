package arrays.practice;

public class LeftRotatedArrayByNPositionsBruteForce {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int k=8;
        //System.out.println(4%7);
        int[] arr1 = leftRotate(arr, k);
        for (int i:arr1){
            System.out.println(i);
        }
    }

    public static int[] leftRotate(int[] nums, int k){
        int noOfPositions=k% nums.length;
        int[] tempArr=new int[k];
        for (int i = 0; i < noOfPositions; i++) {
            tempArr[i]=nums[i];
        }

        for (int j = 0; j < nums.length-noOfPositions; j++) {
            nums[j]=nums[noOfPositions+j];
        }

        int count=0;
        for (int l = nums.length-noOfPositions; l < nums.length; l++) {
            nums[l]= tempArr[count++];
        }
        return nums;
    }
}
