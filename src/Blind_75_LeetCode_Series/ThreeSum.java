package Blind_75_LeetCode_Series;
import java.util.*;

public class ThreeSum {
    /**
     *
     * https://leetcode.com/problems/3sum/description/
     *
     * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k,
     * and j != k, and nums[i] + nums[j] + nums[k] == 0.
     *
     * Notice that the solution set must not contain duplicate triplets.
     *
     * Example 1:
     *
     * Input: nums = [-1,0,1,2,-1,-4]
     * Output: [[-1,-1,2],[-1,0,1]]
     * Explanation:
     * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
     * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
     * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
     * The distinct triplets are [-1,0,1] and [-1,-1,2].
     * Notice that the order of the output and the order of the triplets does not matter.
     * Example 2:
     *
     * Input: nums = [0,1,1]
     * Output: []
     * Explanation: The only possible triplet does not sum up to 0.
     *
     * Time Complexity: O(N*N)
     * Space complexity: O(N) but depends on the input
     */
    public static void main(String[] args) {
        int[] nums={-1,0,-1,1,2,-4};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        /**
         Time complexity: O(N^2)
         Space complexity: O(N)-> It basically depends on the size of the input
         */
        if(nums.length<3 || nums==null){
            return new ArrayList<>();
        }
        Set<List<Integer>> result= new HashSet<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            //why we are skipping if nums[i]==nums[i-1]?
            //becuase i>i-1 and since we are coming from start so when i was i-1 at that time
            //left pointer have i value. So if we take it again then our answer will contain
            //duplicate value
            if (i > 0 && nums[i - 1] == nums[i]) {
                continue;
            }
            int firstVal=nums[i];
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=firstVal+nums[left]+nums[right];
                if(sum==0){
                    result.add(Arrays.asList(firstVal,nums[left],nums[right]));
                    left++;
                    right--;
                }else if (sum>0){
                    right--;
                }else{
                    left++;
                }
            }
        }

        return new ArrayList<>(result);




    }
}
