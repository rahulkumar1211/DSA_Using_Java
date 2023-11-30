package Sorting;
import java.util.Arrays;
public class SelectionSortUsingRecursion {
    /**
     * In selection sort, we are checking for maximum value in an array and swapping it with the last element.
     * So in every iteration arrays get sorted from last.
     * @param args
     */

    public static void main(String[] args) {
        int[] nums={5,4,6,7,1,2,3};
        System.out.println(Arrays.toString(selectionSort(nums,nums.length-1)));

    }

    static int[] selectionSort(int[] nums,int lastIndex){
        if(lastIndex==0){
            return nums;
        }

        for(int i=0;i<lastIndex;i++){
            if(nums[i]>nums[lastIndex]){
                int temp=nums[lastIndex];
                nums[lastIndex]=nums[i];
                nums[i]=temp;
            }
        }

        return selectionSort(nums,lastIndex-1);
    }
}
