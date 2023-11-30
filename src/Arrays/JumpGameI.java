package Arrays;

/**
 * https://leetcode.com/problems/jump-game/description/?envType=study-plan-v2&envId=top-interview-150
 *
 *     Logic: Start from the last and check if the element before the last is able to reach last or not. If yes,
 *     then change the destination and again check till the start of error.
 *     If all goes well then return true otherwise return false.
 */
public class JumpGameI {
    public static void main(String[] args) {
        int[] nums={2,3,1,1,4};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums) {
        if(nums.length==1){ //If num contains any one element even if it is zero. It is considered as true.
            return true;
        }
        boolean isReached=false;
        int DestinationIndex=nums.length-1;
        int i=DestinationIndex-1;
        while(i>=0){
            if(nums[i]>=DestinationIndex-i){
                DestinationIndex=i;
                isReached=true;
            }else{
                isReached=false;
            }
            i=i-1;
        }
        return isReached;
    }
}
