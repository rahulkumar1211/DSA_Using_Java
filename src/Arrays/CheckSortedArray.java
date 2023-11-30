package Arrays;

public class CheckSortedArray {
    /*
    We have to check whether given array is sorted or not using recursion
     */
    public static void main(String[] args) {
        int[] nums={1,2,4,7,8};
        int index=0;
        System.out.println("is Sorted? "+checkSorted(nums,index));
    }

    /*
    On way to implement recursion using 3 parameters
     */
    static boolean checkSorted(int[] nums,int index,boolean isSorted){
        if(index==nums.length-1){
            return true&&isSorted;
        }
        if(nums[index]<nums[index+1]){
            return checkSorted(nums,index+1,true);
        }

        return checkSorted(nums,index+1,false);
    }

    /*
    Other way to implement recursion
     */
    static boolean checkSorted(int[] nums,int index){
        if(index==nums.length-1){
            return true;//if we reached till last index it means this is largest element in the array so we return true
        }
        return (nums[index]<nums[index+1])&&checkSorted(nums,index+1);
    }
}
