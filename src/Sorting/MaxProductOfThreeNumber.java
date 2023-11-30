package Sorting;

/**
 * Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
 *
 * Example 1:
 *
 * Input: nums = [1,2,3]
 * Output: 6
 * Example 2:
 *
 * Input: nums = [1,2,3,4]
 * Output: 24
 * Example 3:
 *
 * Input: nums = [-1,-2,-3]
 * Output: -6
 */
public class MaxProductOfThreeNumber {

    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(maximumProduct(nums));
    }

    public static int maximumProduct(int[] nums) {
        /**
        Here, we have to find three numbers which gives maximum product.
If we will sort our array, then all the smaller(or negative, etc) elements
will be at left, and all the greater elements will be at right
So, just take right three elements, and do multiplication between them and
return it (But, it's possible only if array has only positive elements)

Thus, it could also be possible that two negative numbers lying at the left extreme end
         could also contribute to lead to a larger product if the third number in the
         triplet being considered is the largest positive number in the numsnums array
Why only two negative numbers from the left ?
Eg : (-2) * (-2) = 4          ==> Product of two -ve elements
Eg : (-2) * (-2) * (-2) = -8  ==> Product of three -ve elements
Above, product of two -ve elements is in positive, but product of three -ve
elements is negative, and here we want "max product", which will definetely
in positive
That's why, if there is a possibility of having -ve elements also in our array
So, also do product of first two elements and last element */

    /**   Time complexity: O(NlogN)
         Space complexity:O(1)
       Arrays.sort(nums);
        int n=nums.length;
        return Math.max(nums[n-1]*nums[n-2]*nums[n-3], nums[0]*nums[1]*nums[n-1]);
    */
        /**
         Time complexity: O(N)
         Space complexity:O(1)
         */
        int max1=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        int max3=Integer.MIN_VALUE;
        int min1=Integer.MAX_VALUE;
        int min2=Integer.MAX_VALUE;

        for(int elem: nums){
            if(elem>max1){
                max3=max2;
                max2=max1;
                max1=elem;
            }
            else if(elem>max2){
                max3=max2;
                max2=elem;
            }else if(elem>max3){
                max3=elem;
            }
            if(elem<min1){
                min2=min1;
                min1=elem;
            }else if(elem<min2){
                min2=elem;
            }
        }

        return Math.max(max1*max2*max3, min1*min2*max1);

    }
}
