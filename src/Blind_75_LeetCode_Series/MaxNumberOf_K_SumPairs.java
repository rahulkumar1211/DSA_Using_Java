package Blind_75_LeetCode_Series;

import java.util.Arrays;

/**
 *
 * https://leetcode.com/problems/max-number-of-k-sum-pairs/description/?envType=study-plan-v2&envId=leetcode-75
 *
 * You are given an integer array nums and an integer k.
 * In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
 * Return the maximum number of operations you can perform on the array.
 *
 * Example 1:
 * Input: nums = [1,2,3,4], k = 5
 * Output: 2
 * Explanation: Starting with nums = [1,2,3,4]:
 * - Remove numbers 1 and 4, then nums = [2,3]
 * - Remove numbers 2 and 3, then nums = []
 * There are no more pairs that sum up to 5, hence a total of 2 operations.
 *
 * Example 2:
 * Input: nums = [3,1,3,4,3], k = 6
 * Output: 1
 * Explanation: Starting with nums = [3,1,3,4,3]:
 * - Remove the first two 3's, then nums = [1,4,3]
 * There are no more pairs that sum up to 6, hence a total of 1 operation.
 *
 * Logic: Take two pointer at two end and find sum. move pointer accordingly based on sum
 * Challenge: If we don't sort the array then it will be difficult to find the sum and move
 *            the pointer.
 * Time Complexity:O(nlogn)
 * Space Complexity:O(1)
 *
 */

public class MaxNumberOf_K_SumPairs {
    public static void main(String[] args) {
        int[] nums={2,2,2,3,1,1,4,1};
        System.out.println(maxSum(nums,4));
    }
    static int maxSum(int[] nums,int k){
        Arrays.sort(nums);  //{1,1,1,2,2,2,3,4}
        int count=0;
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int sum=nums[left]+nums[right];
            if(sum==k){
                count++;
                left++;
                right--;
            }
            else if(sum>k){
                right--;
            }
            else{
                left++;
            }
        }
        return count;
    }
}
