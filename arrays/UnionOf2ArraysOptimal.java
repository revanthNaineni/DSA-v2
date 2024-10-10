package arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class UnionOf2ArraysOptimal {

    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr2[] = {2, 3, 4, 4, 5, 11, 12};
        int[] integers = findUnion(arr1, arr2);

        for (Integer integer : integers) {
            System.out.println(integer);
        }

    }

    public static int[] findUnion(int nums1[], int nums2[]) {
        int left = 0;
        int right = 0;
        List<Integer> list = new ArrayList<>();
        while (left < nums1.length && right < nums2.length) {
            if (nums1[left] == nums2[right]) {
                if (list.isEmpty() || list.get(list.size() - 1) != nums1[left]) {
                    list.add(nums1[left]);
                }
                left++;
                right++;

            } else if (nums1[left] < nums2[right]) {
                if (list.isEmpty() || list.get(list.size() - 1) != nums1[left]) {
                    list.add(nums1[left]);
                }
                left++;
            } else if (nums1[left] > nums2[right]) {
                if (list.isEmpty() || list.get(list.size() - 1) != nums2[right]) {
                    list.add(nums2[right]);
                }

                right++;
            }
        }

        while (left < nums1.length) {
            if (list.isEmpty() || list.get(list.size() - 1) != nums1[left]) {
                list.add(nums1[left]);
            }
            left++;
        }

        while (right < nums2.length) {
            if (list.isEmpty() || list.get(list.size() - 1) != nums2[right]) {
                list.add(nums2[right]);
            }
            right++;
        }

        int[] unionArr = new int[list.size()];
        int count = 0;
        for (Integer i : list) {
            unionArr[count++] = i;
        }

        return unionArr;


    }

}
