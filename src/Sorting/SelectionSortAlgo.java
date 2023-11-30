package Sorting;

import java.util.Arrays;

public class SelectionSortAlgo {
    /*
    In Selection Sort, considering we have to sort in ascending order, we are checking for the maximum value in an array
    and then swapping that value with the last indexed values.
    Consecutively, we are reducing the space of maximum search by 1 in each iteration.
    As a result, all the elements in an array will get sorted.

    Worst Time Complexity:O(n^2)
    Best Time Complexity:O(n^2)
    Space Complexity: O(1)
    Stable Algorithm: No
    Usefulness: Performs well in small lists.
     */

    public static void main(String[] args) {
        int[] nums={1,5,3,4,2};
        selectionSort(nums);

    }

    static void selectionSort(int[] nums){

        for(int i=0; i<nums.length;i++){
            int lastIndex=nums.length-i-1;
            int maxIndex=findMaxIndex(nums,0,lastIndex);
            swap(nums,maxIndex,lastIndex);

        }
        System.out.println(Arrays.toString(nums));
    }

    static int findMaxIndex(int[] nums,int start, int last){
        int max=start;
        for(int i=start; i<=last;i++){
            if(nums[max]<nums[i]){
                max=i;
            }
        }
        return max;
    }
    static void swap(int[] nums,int first, int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }


}
