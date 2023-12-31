package Arrays;

public class RotatedBinarySearchUsingRecursion {
    public static void main(String[] args) {
          int[] nums={5,6,7,8,9,1,2,3};
        System.out.println(search(nums,8,0,nums.length-1));
    }

    static int search(int[] nums, int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(nums[m]==target){
            return m;
        }
        if(nums[s]<=nums[m]){
            if(target>=nums[s] && target<=nums[m]){
                return search(nums,target,s,m-1);
            }else{
                return search(nums,target,m+1,e);
            }
        }
        if(target>=nums[m]&& target<=nums[e]){
            return search(nums,target,m+1,e);
        }else{
            return search(nums,target,s,m-1);
        }
    }
}
