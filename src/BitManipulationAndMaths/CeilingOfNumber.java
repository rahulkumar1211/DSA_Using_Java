package BitManipulationAndMaths;

public class CeilingOfNumber {
    /*
    In this program we'll find the minimum number which is greater or equal to the given target number in an number array. This
    is also called finding the ceiling of a number
     */

    public int findCeiling(){
        int[] nums={2,3,5,6,7,10,16,18};
        int target=4;
        int start=0;
        int end=nums.length-1;

        while(start<=end){
           int mid=start+((end-start)/2);
            if(target<nums[mid]){
                end=mid-1;
            }
            if(target>nums[mid]){
                start=mid+1;
            }
            else{
                return nums[mid];
            }
        }
     return nums[start];
    }
}
