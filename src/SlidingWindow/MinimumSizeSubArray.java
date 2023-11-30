package SlidingWindow;
import java.util.*;

public class MinimumSizeSubArray {
    public static void main(String[] args) {
        int[] nums={12,28,83,4,25,26,25,2,25,25,25,12};
        int target=213;
        System.out.println(minimumSize(target,nums));
    }
    static int minimumSize(int target, int[] nums){
        Arrays.sort(nums);
        int start=0;
        int length=Integer.MAX_VALUE;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        while(sum>=target){
            length=Math.min(length, nums.length-start);
            sum-=nums[start++];
            if(sum<target){
                length=Math.min(length, nums.length-start+1);

            }
        }
        return (length==Integer.MAX_VALUE)?0:length;
    }
}
