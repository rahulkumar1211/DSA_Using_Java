package Blind_75_LeetCode_Series;
import java.util.Arrays;
import java.util.HashMap;
  /*
  Given an array of integer nums and an integer target, return
 indices of the two numbers such that they add up to the target.
 You may assume that each input would have exactly one solution,
 and you may not use the same element twice.
 You can return the answer in any order.
 Input: nums = [2,7,11,15], target = 9
 Output: [0,1]
 Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
   */
public class TwoSum {

      public static void main(String[] args) {
          int[] nums={2,7,11,15};
          int target=9;
          //System.out.println(Arrays.toString(twoSum(nums,target)));
          System.out.println(Arrays.toString(twoSumUsingMap(nums,target)));

      }

      static int[] twoSum(int[] nums, int target){
          //this will work when the array is sorted. If the array is not sorted then it will not work
          int start=0;
          int end=nums.length-1;
          while(start<end){
              if(nums[start]+nums[end]>target){
                  end=end-1;
              }else if(nums[start]+nums[end]<target){
                  start=start+1;
              }
              else{
                  return new int[]{start,end};
              }
          }
          return new int[]{-1,-1};
      }

      //implementation using HashMap
      //Time complexity: O(n).   Space complexity: O(n)
      static int[] twoSumUsingMap(int[] nums, int target){
          HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
          for(int i=0;i<nums.length;i++){
              int findValue=target-nums[i];
              if(map.containsKey(findValue)){
                  return new int[]{i,map.get(findValue)};
              }else{
                  map.put(nums[i],i);
              }
          }
          return new int[]{-1,-1};
      }
}
