package Sorting;
import java.util.*;
public class SortArrayByIncreasingFrequency {
    /**
     * https://leetcode.com/problems/sort-array-by-increasing-frequency/description/
     *
     * Given an array of integers nums, sort the array in increasing order based on the
     * frequency of the values. If multiple values have the same frequency, sort them in decreasing order.
     *
     * Return the sorted array.
     * Example 1:
     *
     * Input: nums = [1,1,2,2,2,3]
     * Output: [3,1,1,2,2,2]
     * Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.
     * Example 2:
     *
     * Input: nums = [2,3,1,3,2]
     * Output: [1,3,3,2,2]
     * Explanation: '2' and '3' both have a frequency of 2, so they are sorted in decreasing order.
     * Example 3:
     *
     * Input: nums = [-1,1,-6,4,5,-6,1,4,1]
     * Output: [5,-1,4,4,-6,-6,1,1,1]
     *
     * Time complexity: O(N^2)
     * Space complexity:O(N)
     */

    public static void main(String[] args) {
        int[] nums={1,1,2,2,2,3};
        for(int val:frequencySort(nums)){
            System.out.print(val+" ");
        }
    }
    public static int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
        }

        List<Integer> list= new ArrayList<>(map.keySet());
        /**
         We have assigned the key values to list.
         In Collections.sort(list, comparator)-> if we don't define any logic then it will sort
         the values of list in ascending order.
         Here we have created one function in comparator.
         Comparator logic: if the values at key a & b are same then we are sorting based on the
         key values otherwise we are sorting the key based on its values.
         */
        Collections.sort(list,(a, b)->{
            return (map.get(a)==map.get(b))?b-a:map.get(a)-map.get(b);
        });

        int[] res=new int[nums.length];
        int j=0;
        for(int num:list){
            for(int i=0;i<map.get(num);i++){
                res[j++]=num;
            }
        }
        return res;

    }
}
