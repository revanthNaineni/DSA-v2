package arrays;

public class MergeTwoSortedArraysWithoutExtraSpaceBruteForce {
    public static void main(String[] args) {
        int[] nums1={-5, -2, 4, 5, 0, 0, 0};
        int[] nums2={-3,-2, 1};
        int m=4;
        int n=3;
        int[] merge = merge(nums1, m, nums2, n);
        for (int k:merge){
            System.out.println(k);
        }
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0;
        int j=0;
        int count=0;
        int[] tempArr= new int[m+n];
        while(i<m && j<n){
            if(nums1[i]<=nums2[j]){
                tempArr[count]=nums1[i];
                i++;
                count++;
            }else{
                tempArr[count]=nums2[j];
                j++;
                count++;
            }

        }

        while (i<m){
            tempArr[count]=nums1[i];
            i++;
            count++;
        }
        while (j<n){
            tempArr[count]=nums2[j];
            j++;
            count++;
        }
        return tempArr;
    }
}
