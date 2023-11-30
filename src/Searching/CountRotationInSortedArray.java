package Searching;

public class CountRotationInSortedArray {
    /*
    In this problem, we have to find how many times, the array is rotated. Return the number
     */
    /*
    Logic: original array={0,1,2,3,4,5,6,7}
           given array={4,5,6,7,0,1,2,3}
           if original rotated one time- {7,0,1,2,3,4,5,6}
           if original rotated two times-{6,7,0,1,2,3,4,5}
           if original rotated three times-{5,6,7,0,1,2,3,4}
           if original rotated four times-{4,5,6,7,0,1,2,3}
           so we can conclude that the {index value of peak +1} is equal to the number of times our array is rotated.
     */
    public static void main(String[] args) {
        int[] nums={4,5,6,7,0,1,2,3};
        System.out.println("The array nums is rotated : "+(findRotation(nums)+1));

    }
    public static int findRotation(int[] nums){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1]){
                /*
                We are in decreasing array
                 */
                return mid;
            }
            else if(mid>start && nums[mid]<nums[mid-1]){
                /*
                We are in increasing array
                 */
                return mid-1;
            }
            else if(nums[start]>=nums[mid]){
                end=mid-1;
            }
        }
        return -1;
    }
}
