package Sorting;

/**
 *
 * https://leetcode.com/problems/sort-array-by-parity/
 *
 * Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
 *
 * Return any array that satisfies this condition.
 *
 * Example 1:
 *
 * Input: nums = [3,1,2,4]
 * Output: [2,4,3,1]
 * Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 * Example 2:
 *
 * Input: nums = [0]
 * Output: [0]
 */
public class SortArrayByParity {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        nums=sortArrayByParity(nums);
        for(int n:nums){
            System.out.print(n+" ");
        }
    }
    public static int[] sortArrayByParity(int[] nums) {
        if(nums.length<=1){
            return nums;
        }
        int l=0;
        int r=nums.length-1;
        while(l<=r){
            if((nums[l]%2)!=0){
                if(nums[r]%2==0){
                    swap(nums,l,r);
                }else{
                    r--;
                }

            }else{
                l++;
            }
        }
        return nums;
    }
    static void swap(int[] nums,int first,int second){
        int temp=nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}
