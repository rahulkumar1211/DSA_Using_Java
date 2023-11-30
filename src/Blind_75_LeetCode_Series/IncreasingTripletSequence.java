package Blind_75_LeetCode_Series;


/**
 *
 * https://leetcode.com/problems/increasing-triplet-subsequence/?envType=study-plan-v2&envId=leetcode-75
 *
 * Given an integer array nums, return true if there exists a triple of indices (i, j, k)
 * such that i < j < k and nums[i] < nums[j] < nums[k]. If no such indices exists, return false.
 *
 * Example 1:
 * Input: nums = [1,2,3,4,5]
 * Output: true
 * Explanation: Any triplet where i < j < k is valid.
 *
 * Example 2:
 * Input: nums = [5,4,3,2,1]
 * Output: false
 * Explanation: No triplet exists.
 *
 * Logic: Here we have to find number which are greater than the previous one. We have to find this for two times.
 * So we are taking two variables and assigning it to the maximum value.
 * In first variable we are storing the minimum value present in array
 * In second variable we are storing the second minimum value which will be greater than a.
 * Since we are iterating over an array so index value of a will be smaller than index value of b otherwise it will return false.
 *
 * Time complexity: O(N)
 * Space complexity: O(1)
 *
 */
public class IncreasingTripletSequence {

    public static void main(String[] args) {
        int[] input={5,4,3,2,1};
        System.out.println(isTripletExist(input));
    }
    static boolean isTripletExist(int[] nums){

        int a=Integer.MAX_VALUE;
        int b=Integer.MAX_VALUE;
        for(int num:nums){
            if(a<=num) a=num;
            else if(num>a && num<=b) b=num;
            else return true;
        }
        return false;
    }

}
