package Blind_75_LeetCode_Series;

/**
 *
 * https://leetcode.com/problems/container-with-most-water/description/?envType=study-plan-v2&envId=leetcode-75
 *
 * You are given an integer array height of length n. There are n vertical lines drawn such that the two
 * endpoints of the ith line are (i, 0) and (i, height[i]).
 *
 * Find two lines that together with the x-axis form a container,
 * such that the container contains the most water.
 *
 * Return the maximum amount of water a container can store.
 *
 * Notice that you may not slant the container.
 *
 * Example 1:
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7].
 * In this case, the max area of water (blue section) the container can contain is 49.
 *
 * Example 2:
 * Input: height = [1,1]
 * Output: 1
 *
 * Time Complexity: O(N)
 * Space Complexity:O(1)
 *
 * Logic: We are using two pointer method here. We take two pointer at two end and calculate the area.
 * Challenge: when to move pointer1 to right and pointer2 to left?
 *            We are checking whichever is less in between nums[pointer1] & nums[pointer2], we are increasing that side pointer.
 *            If value at both pointer is equal then we're moving pointer2. we can move right also.
 */

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] nums={1,8,6,2,5,4,8,3,7};
        System.out.println(container(nums));
    }
    static int container(int[] nums){
        int pointer1=0;
        int pointer2=nums.length-1;
        int tempResult=Integer.MIN_VALUE;//If we want to store maximum value then start with minimum value or vice-versa.
        while(pointer1<pointer2){
            int height= nums[pointer1]<nums[pointer2]?nums[pointer1]:nums[pointer2];
            int width=pointer2-pointer1;
            int outputArea=Area(height,width);
            if(tempResult<outputArea){
                tempResult=outputArea;
            }
            if(nums[pointer1]<nums[pointer2]){
                pointer1++;
            }else{
                pointer2--;
            }
        }
        return tempResult;

    }

    static int Area(int height, int width){
        return height*width;
    }
}
