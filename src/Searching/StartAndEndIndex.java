package Searching;

public class StartAndEndIndex {

    public void searchRange(int[] nums, int target) {
        int[] output=new int[2];
        int start=search(nums,target,true);
        int end=search(nums,target,false);
        output[0]=start;
        output[1]=end;
        System.out.print(output[0]+" "+output[1]);
    }
    int search(int[] nums, int target, boolean findFirstIndex){
        int ans= -1;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<nums[mid]){
                end=mid-1;
            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                ans=mid;
                if(findFirstIndex){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return ans;
    }
}
