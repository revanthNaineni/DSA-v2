package sorting;

import java.util.ArrayList;

public class MergeSort {

	public static void mergeSort(int arr[],int si,int ei) {
        if(si>=ei)
        {
            return;
        }
        int mid=si + (ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }
    public static void merge(int arr[],int si,int mid,int ei) {
        int temp[]=new int[ei-si+1];//array index start from 0
        int i=si;
        int j=mid+1;
        int tempIndex=0;
        while(i<=mid && j<=ei)
        {
            if(arr[i]<arr[j])
            {
                temp[tempIndex]=arr[i];
                i++;
                tempIndex++;
            }
            else
            {
                temp[tempIndex]=arr[j];
                j++;
                tempIndex++;
            }
        }
        //for remaining elemnts
        //left
        while(i<=mid)
        {
            temp[tempIndex++]=arr[i++];
        }
        //right
        while(j<=ei)
        {
            temp[tempIndex++]=arr[j++];
        }
        i=si;
        for(int k=0;k<temp.length;k++)
        {
            arr[i]=temp[k];
            i++;
        }
    }
    public static void sortArray(int[] arr) {
        mergeSort(arr, 0, arr.length-1);
        //return arr;
    }

	public static void main(String[] args) {
		int[] arr = { 8, 3, 1, 7, 0, 10, 2 };
		System.out.println("Unsorted array: " + java.util.Arrays.toString(arr));

		mergeSort(arr, 0, arr.length - 1);

		System.out.println("Sorted array: " + java.util.Arrays.toString(arr));
	}
}
