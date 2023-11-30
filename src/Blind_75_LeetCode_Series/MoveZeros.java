package Blind_75_LeetCode_Series;

/**
 *
 * https://leetcode.com/problems/move-zeroes/description/?envType=study-plan-v2&envId=leetcode-75
 *
 * Based on Two Pointer
 *
 * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * Note that you must do this in-place without making a copy of the array.
 *
 * Example 1:
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 *
 * Example 2:
 * Input: nums = [0]
 * Output: [0]
 *
 * Time complexity: O(N)
 * Space complexity: O(1)
 *
 * Logic: We are solving this using two pointer method
 *        We are taking two pointer, one is iterating over an array and checking if the value is not equal to zero then it
 *        is assigning that value at second pointer index and then increasing the second pointer. As a result, all the non-zero
 *        elements will be assigned from the start. Once the iteration of loop will complete we are checking the value of second
 *        pointer and assigning all the values to zero starting from second pointer to the length of an array.
 *
 *
 */
public class MoveZeros {
    public static void main(String[] args) {
        int[] nums={0,1,0,3,12};
        moveZero(nums);
    }
    static void moveZero(int[] nums){
        int i=0;;
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=0){
                nums[i]=nums[j];
                i++;
            }
        }
        for(;i<nums.length;i++){
            nums[i]=0;
        }
        for(int num:nums){
            System.out.print(num+" ");
        }
    }
}
