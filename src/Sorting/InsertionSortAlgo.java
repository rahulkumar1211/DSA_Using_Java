package Sorting;

import java.util.Arrays;

public class InsertionSortAlgo {
    /*
    Insertion Sort Algo: In this algo we are comparing the current values with the previous value and swapping it if it
    is greater than the current value.
    Here Time complexity: O(n^2)
         Space complexity: O(1)
    NOTE: works very well with the partial sorted array
     */

    public static void main(String[] args) {
        int[] nums={1,5,3};
        insertionSort(nums);
    }

    static void insertionSort(int[] nums){
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j>0; j--){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }

            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
