package Sorting;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class MinimumAbsoluteDifference {
    /**
     * https://leetcode.com/problems/minimum-absolute-difference/description/
     *
     * Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.
     *
     * Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows
     *
     * a, b are from arr
     * a < b
     * b - a equals to the minimum absolute difference of any two elements in arr
     *
     *
     * Example 1:
     *
     * Input: arr = [4,2,1,3]
     * Output: [[1,2],[2,3],[3,4]]
     * Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.
     * Example 2:
     *
     * Input: arr = [1,3,6,10,15]
     * Output: [[1,3]]
     * Example 3:
     *
     * Input: arr = [3,8,-10,23,19,-4,-14,27]
     * Output: [[-14,-10],[19,23],[23,27]]
     *
     * Time complexity: O(NlogN)
     * Space Complexity: O(N);
     */

    public static void main(String[] args) {

    }
    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        /**
         Sorting the array makes it easy to find the difference. Don't use Math.abs() while finding a difference, it will throw an error.
         lsit.clear() we are using to remove the previous lists which were added whose difference values are greater than the current difference value.
         */
        Arrays.sort(arr);
        int minDiff=Integer.MAX_VALUE;
        List<List<Integer>> list=new ArrayList();
        for(int i=0;i<arr.length-1;i++){
            int diff=arr[i+1]-arr[i];
            if(minDiff>diff){
                minDiff=diff;
                list.clear();
                list.add(Arrays.asList(arr[i],arr[i+1]));
            }else if(minDiff==diff){
                list.add(Arrays.asList(arr[i],arr[i+1]));
            }

        }
        return list;
    }
}
