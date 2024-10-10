package arrays;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedArrays {

	public static void main(String[] args) {
		int[] nums1 = {1, 2, 3, 3, 4, 5, 6, 7};
        int[] nums2 = {3, 3, 4, 4, 5, 8};
        int[] intersectionArray = intersectionArray(nums1, nums2);
        for (int i : intersectionArray) {
			System.out.println(i);
		}

	}
	
	public static int[] intersectionArray(int[] nums1, int[] nums2) {
        int i=0;
        int j=0;
        List<Integer> list=new ArrayList<>();

        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                list.add(nums1[i]);
                i++;
                j++;

            }else if(nums1[i]<nums2[j]){
                i++;
            }else if(nums2[j]<nums1[i]){
                j++;
            }
        }

        int arr[]=new int[list.size()];

        for(int k=0;k<list.size();k++){
            arr[k]=list.get(k);

        }

        return arr;
    }

}
