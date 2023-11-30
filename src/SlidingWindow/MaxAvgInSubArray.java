package SlidingWindow;

/**
 * https://leetcode.com/problems/maximum-average-subarray-i/description/?envType=study-plan-v2&envId=leetcode-75
 *
 * Based on Sliding window Algo
 *
 * Time Complexity: O(N)
 * Space Complexity:O(1)
 *
 */
public class MaxAvgInSubArray {
    public static void main(String[] args) {
        int[] nums=new int[]{1,12,-5,-6,50,3};
        int k=4;
        System.out.println(maxAvg(nums,k));
    }

    static double maxAvg(int[] nums, int k){
        double maxAvg=0.0;
        double currentAvg=0.0;
        int i=0;
        int j=0;
        while(j<k){
            currentAvg+=(double)nums[j]/(double)k;
            j++;
        }
        maxAvg=currentAvg;
        while(j<nums.length){
            currentAvg-=(double)nums[i]/(double)k;
            currentAvg+=(double)nums[j]/(double)k;
            maxAvg=Math.max(currentAvg,maxAvg);
            i++;
            j++;
        }

        return maxAvg;
    }

    /**
     * Other way to apply sliding window algorithm
     * @param nums
     * @param k
     * @return
     */

    static double maxavg(int[] nums, int k){
        /**
         Time Complexity: O(N)
         Space Complexity: O(1)
         */
        int sum=0;
        int maxSum=0;
        int i=0;
        int j=0;
        while(j<k){
            sum+=nums[j];
            j++;
        }
        maxSum=sum;
        while(j<nums.length){
            sum+=(nums[j]-nums[j-k]);
            maxSum=Math.max(sum,maxSum);
            j++;
        }

        return (double)maxSum/k;
    }
}
