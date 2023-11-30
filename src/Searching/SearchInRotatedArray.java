package Searching;

public class SearchInRotatedArray {
    /**
     * Here if we try to find the target directly then it will be very confusing.
     * Brute Force approach: iterate through each element one by one and return the index value once finds the target.
     * Time complexity: O(N)
     *
     * Binary Search Approach: Since this is the rotated array, so we first try to find the peak of the array.
     * After find the peak:
     * 1. if peak==-1 means array is not rotated so do the simple binary search
     * 2. if peak==target means peak is only the target and return that value.
     * 3. if target>=start then binary search-> end=peak-1;
     * 4. if target<start, then binary search-> start=peak+1, end=end(no change)
     * @param args
     */

    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2};
        int target=0;
        System.out.println(search(nums,target));
    }
        public static int search(int[] nums, int target) {
            int peakIndex=peak(nums);
            if(peakIndex==-1){
                return findTarget(nums,0,nums.length-1, target);
            }
            if(target==nums[peakIndex]){
                return peakIndex;
            }
            if(target>=nums[0]){
                return findTarget(nums,0,peakIndex-1,target);
            }
            return findTarget(nums,peakIndex+1,nums.length-1,target);

        }
        //function for binary search of target
        public static int findTarget(int[] nums, int start, int end,int target){
            while(start<=end){
                int mid=start+(end-start)/2;
                if(target<nums[mid]){
                    end=mid-1;
                }
                else if(target>nums[mid]){
                    start=mid+1;
                }
                else{
                    return mid;
                }
            }
            return -1;
        }
        //finding the peak value in a rotated array.
        public static int peak(int[] nums){
            int start=0;
            int end=nums.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                /**case 1: let's consider that our num[mid]>num[mid+1] i.e. mid contains peak value */
                if(mid<end && nums[mid]>nums[mid+1]){
                    return mid;
                }
                /**case 2: if nums[mid]<nums[mid-1]. i.e. mid-1 contains peak value */
                if(mid>start && nums[mid]<nums[mid-1]){
                    return mid-1;
                }
                /**case 3: if our nums[start] is either greater than or equal to nums[mid] value then
                 we don't have to check for values after mid. so we can shift our end value to
                 end=mid-1.
                 -> But if this doesn't fullfilled which means our peak value is in second half
                 so we don't have to check for value before mid. so start=mid+1; */
                if(nums[mid]<=nums[start]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
                /** Case 4: This condition check will get failed when we have duplicate values in an array like
                 *          start=end=mid=sameValue;
                 *          if(nums[mid]<=nums[start]){
                 *                     end=mid-1;
                 *                 }else{
                 *                     start=mid+1;
                 *                 }
                 *          To Solve the above problem we have to do below modification.
                 *          if(nums[start]==nums[mid] && nums[mid]==nums[end])
                 *          {
                 *              //skip the element
                 *              NOTE: There can be the case that either start or end contains the peak so
                 *                    Need to check that
                 *                    //check whether start contains the peak
                 *                    if(nums[start]>nums[start+1]){
                 *                       return start;
                 *                    }
                 *                  start++;
                 *                   //check whether end contains the peak
                 *                   if(nums[end]>nums[end-1]){
                 *                       return end;
                 *                       }
                 *                  end--;
                 *          }
                 *          //left side is sorted so peak value should be in right
                 *          else if(nums[start]<nums[mid]||(nums[start]==nums[mid] && nums[mid]>nums[end])){
                 *                  start=mid+1;
                 *                  }
                 *                  else{
                 *                  end=mid-1;
                 *                  }
                 *  */

            }
            /**case 5: this will return when our array is not rotated that i.e. nums[nums.length-1] contains the peak value */
            return -1;

        }


}
