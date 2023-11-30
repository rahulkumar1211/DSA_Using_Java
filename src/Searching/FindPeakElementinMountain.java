package Searching;

public class FindPeakElementinMountain {
    /*
    In this question, we have to find the index of the maximum element whose neighbours are less than elements value
    and then we have to return the index of it.
    Constarints:
    1. Array is not sorted.
    2. We have to solve it in O(logn) time complexity. O(n) we can do using linear search but that is not the
       efficient approach.
     */
    public static void main(String[] args) {
        int[] nums={1,2,1,3,5,6,4};

        int start=0;
        int end=nums.length-1;
        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]>nums[mid+1]){
                //means we're in decreasing part of array
                // so this may be the answer but we have to look left part of the mid
                // this is why end!=mid-1
                end=mid;
            }
            else{
                //we're in ascending part of array
                start=mid+1;//because we know num[mid]<num[mid+1]
            }

        }
        //in the end start==end, because both will point to the same largest element in an array.
        // start and end always try to find largest element in above two checks
        // hence when they are pointing to just one element it means that is the largest one
        //more elaboration: at every point of time for start and end they have the best possible answer till
        // that time and if we are saying only one item are remaining because of the above checks then that
        // is the best answer;
        System.out.println(start);//we can print end also because both are same.

    }
}
