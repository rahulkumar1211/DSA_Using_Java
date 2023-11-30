package Sorting;

import java.util.Arrays;

public class CycleSort {
    /*
    When given number from 1 to n use cyclic sort
    In a sorted array, index=value-1.
    eg. [1,2,3,4,5]
        index of 1=0
        index of 2=1
        index of 3=2
        index of 4=3
        index of 5=4
    So in cyclic sort, we check whether values is at correct index or not. If not then we swap the value with the correct
    index value and we continue to do so till value get placed at correct index.

    Time Complexity: O(n)
    Space Complexity: O(1)
     */

    public static void main(String[] args) {
        int[] nums={3,4,5,1,2};
        cycleSort(nums);

    }

    static void cycleSort(int[] nums){
        /*
        Approach 1: using for loop

        for(int i=0; i<nums.length;){
            if(i !=nums[i]-1){
                swap(nums,i,nums[i]-1);
            }else{
                i++;
            }
        }

         */
        //Approach 2: using while loop
        int i=0;
        while(i<nums.length){
            int correctIndex=nums[i]-1;
            if(i!=correctIndex){
                swap(nums,i,correctIndex);
            }
            else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    static void swap(int[] nums, int first, int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }

}
