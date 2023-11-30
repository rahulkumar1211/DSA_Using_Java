package Blind_75_LeetCode_Series;
import java.util.Arrays;
public class ContainDuplicate {
    /**
     * Given an integer array nums, return true if any value appears at
     * least twice in the array, and return false if every element is
     * distinct.
     * Input: nums = [1,2,3,1]
     * Output: true
     *
     * Time Complexity: O(NlogN)
     * Space Complexity: O(1)
     */
    public static void main(String[] args) {
        int[] nums={1,1,1,3,3,4,3,2,4,2};
        System.out.println(findDuplicate(nums));
    }

    static boolean findDuplicate(int[] nums){
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if((nums[i]^nums[i+1])==0){
                return true;
            }
        }
        return false;
    }
}
