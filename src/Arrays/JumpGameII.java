package Arrays;

/**
 *
 * https://leetcode.com/problems/jump-game-ii/?envType=study-plan-v2&envId=top-interview-150
 * You are given a 0-indexed array of integers nums of length n. You are initially positioned at nums[0].
 * Each element nums[i] represents the maximum length of a forward jump from index i.
 * In other words, if you are at nums[i], you can jump to any nums[i + j] where:
 * 0 <= j <= nums[i] and
 * i + j < n
 * Return the minimum number of jumps to reach nums[n - 1].
 * The test cases are generated such that you can reach nums[n - 1].
 *
 * Test Case 1: {2,3,1,1,4} Output:2
 * Test Case 2: {2,4,1,2,3,1,1,2} Output:3
 * Test Case 3: {7,0,9,6,9,6,1,7,9,0,1,2,9,0,3} Output:2
 */
public class JumpGameII {
    public static void main(String[] args) {
        int[] nums={2,4,1,2,3,1,1,2};
        System.out.println(MinimumJump(nums));
    }

    /**
     *
     * Logic: Here we are iterating over the array. And checking how far an element at any index can go.
     *        Based on that we are updating the flag.
     *        Since we know that we can make any choices under the farthest we can reach from that particular index
     *        so we are increasing the jump value only when we are completing all the possible values below the farthest
     *        value.
     *        suppose: nums={2,3,1,2,3,1,1,2}
     *                 here for i=0
     *                          we have nums[i]=2
     *                                  so we can go to i=1, i=2
     *                                     and we are updating the flag based on maximum we can reach from any index.
     *                                     we are updating the lastJumpIndex =flag because it will give the window of how far
     *                                     we can go from that index.
     *                                     so once we reach that index it means we have taken the jump so we are increasing the jump value.
     *                                     Before that we are just checking the flag and updating it so we are not increasing the jump.
     *                                     For further clarification: https://www.youtube.com/watch?v=9kyHYVxL4fw
     *
     */
    static int MinimumJump(int[] nums){
       int jump=0;
       int flag=0;
       int lastJumpIndex=0;
       for(int i=0;i<nums.length-1;i++){
           if(i+nums[i]>flag){
               flag=i+nums[i];

           }
           if(i==lastJumpIndex){
               lastJumpIndex=flag;
               jump+=1;
               if(flag>=nums.length-1){
                   return jump;
               }
           }
       }
        return jump;
    }

}
