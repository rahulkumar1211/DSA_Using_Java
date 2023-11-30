package Arrays;

public class MaximumSubarray {

    public static void main(String[] args) {
        int[] nums=new int[]{-2,1,-3,4,-1,2,1,-5,4};
        maxSub(nums);
    }

    static void maxSub(int[] nums){
        int sum=0;
        int maxSum=nums[0];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>maxSum){
                maxSum=sum;
            }
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(maxSum);
    }
}
