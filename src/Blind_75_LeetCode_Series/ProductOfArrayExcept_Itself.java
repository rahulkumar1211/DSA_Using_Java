package Blind_75_LeetCode_Series;
import java.util.Arrays;
public class ProductOfArrayExcept_Itself {
    /**
     * https://leetcode.com/problems/product-of-array-except-self/?envType=study-plan-v2&envId=leetcode-75
     *
     * Given an integer array nums, return an array answer such that
     * answer[i] is equal to the product of all the elements of nums
     * except nums[I].
     * The product of any prefix or suffix of nums is guaranteed to fit in a
     * 32-bit integer.
     * You must write an algorithm that runs in O(n) time and without
     * using the division operation.
     * Input: nums = [1,2,3,4]
     * Output: [24,12,8,6]
     */
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(Arrays.toString(productCalculation(nums)));
    }

    static int[] productCalculation(int[] nums){
        System.out.println(Arrays.toString(nums));
        int[] prefixProdFromStart=new int[nums.length];
        int[] prefixProdFromEnd=new int[nums.length];
        int productFromStart=1;
        int productFromEnd=1;
        for(int i=0;i<nums.length;i++){
            productFromStart*=nums[i];
            prefixProdFromStart[i]=productFromStart;
        }
        System.out.println(Arrays.toString(prefixProdFromStart));
        for(int i=nums.length-1;i>=0;i--){
            productFromEnd*=nums[i];
            prefixProdFromEnd[i]=productFromEnd;
        }
        System.out.println(Arrays.toString(prefixProdFromEnd));
        nums[0]=prefixProdFromEnd[0];
        nums[nums.length-1]=prefixProdFromStart[nums.length-2];
        for(int i=1;i<nums.length-1;i++){
                nums[i]=prefixProdFromStart[i-1]*prefixProdFromEnd[i+1];
        }
        return nums;
    }

    //Other approach

    /**
     * In below approach, we are using prefix and postfix algorithm
     * Since we have to calculate the product of array elements except itself at that particular index without using
     * division operator. so we are storing the product of elements before that particular index in one array. And product
     * of element after that index in other array. Then we are making product of that array element.
     * prefixFromStart=[1,2,6,24]
     * prefixFromEnd=[24,24,12,4]
     * @param nums
     * @return
     */
    static int[] productArray(int[] nums){
        int[] res=new int[nums.length];
        int prefixFromStart=1;
        int prefixFromEnd=1;
        for(int i=0;i<nums.length;i++){
            res[i]=prefixFromStart;
            prefixFromStart*=nums[i];
        }
        for(int i=nums.length-1;i>=0;i--){
            res[i]*=prefixFromEnd;
            prefixFromEnd*=nums[i];
        }
        return res;
    }
}
