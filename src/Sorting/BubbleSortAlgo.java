package Sorting;

import java.util.Arrays;
public class BubbleSortAlgo {
    /*
    In Bubble sort algorithm, we do adjacent comparison and swap it if required. As a result our array started getting
    sorted from the last.
    Best Time Complexity: O(n)- when array is already sorted (like in ascending order)
    Worst Time Complexity: O(n^2)- when array is sorted in opposite order of the order required
    Space complexity: O(1)- we are not taking any extra space, just doing in-space sorting
    Stable Algorithm: Yes
     */
    public static void main(String[] args) {
        int[] nums={1,5,3,4,2};
        bubbleSort(nums);
        int[] nums1={1,2,3,4,5};
        bubbleSort(nums1);

    }
    static void bubbleSort(int[] nums){

        System.out.println("Input Array:");
        for(int num:nums){
            System.out.print(num+" ");
        }
        for(int i=0; i<nums.length; i++){
           boolean isSorted=false;
            for(int j=1; j<nums.length-i; j++){
                if(nums[j]<nums[j-1]){
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                    isSorted=true;
                }
            }
            if(!isSorted){
                break;
            }

        }
        System.out.println("\nArray after sorting:");
        System.out.println(Arrays.toString(nums));
    }
}
