package Sorting;
import java.util.Arrays;
public class QuickSort {

    /*
    Pivot: Choose any element
           After every pass, all the element which is less than pivot will come to left hand side and all the element greater
           than pivot will come to right hand side.
           The idea here is to put the Pivot at correct position just by swapping the element which is not in correct position
           and increasing the start index and decreasing the end index.
           If the num[start]>num[mid] and num[end]<num[mid], then swap between start and end

    Q. How to pick Pivot? Three Approach:
    1. Pick any random element
    2. Always pick last element- worst case
    3. Always pick middle element- best case

    worst case time complexity: O(N^2)
    best case time complexity: O(NlogN)

    NOTES:
    1. Not stable
    2. In-place sorting
    3. Merge sort is better in linked list because there memory allocation is not continuous.
     */

    public static void main(String[] args) {
            int[] arr={5,4,3,2,1};
            quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int[] nums, int low, int high){
         if(low>=high){
             return ;
         }
         int s=low;
         int e= high;
         int m= s+(e-s)/2;
         int pivot=nums[m];
        //also a reason that if it sorted then it will not swap
        //below while loop will check and place the pivot at correct index. i.e. all the element below pivot is lesser than the
        //pivot and all element above pivot is greater than the pivot.
         while(s<=e){
             while(nums[s]<pivot){
                 s++;
             }
             while(nums[e]>pivot){
                 e--;
             }

             if(s<=e){
                 int temp=nums[s];
                 nums[s]=nums[e];
                 nums[e]=temp;
                 s++;
                 e--;
             }
         }

         /*
         Now pivot is at correct index then sort the two half because in above while loop we
         are not focusing on sorting the below half of pivot and upper half after pivot.
          */
        quickSort(nums,low, e);
        quickSort(nums,s,e);


    }


}
