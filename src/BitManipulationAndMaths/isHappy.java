package BitManipulationAndMaths;
import java.util.*;
/**
 * https://leetcode.com/problems/happy-number/submissions/
 *
 This question is basically based on finding the cycle in the sum of the square of the digits of a number.
 Challenge: We have to figure out that when we are going to break this loop because if it is not a happy
 number then the loop will continues for the infinite time and it will throw the Time Limit Exceed
 Exception.
 So, we have two approach to solve this question:

 1. We can store the squareSum in a SET. Since set only contains the unique number so if we encounter the
 condition where we found the our sum is already available in the set it means the cycle will repeat again
 In that case we have to break the loop. We also have to check if ans==1 then we found our desired answer.

 2. We can use fast pointer and slow pointer method to find the cycle and break the loop if we found
 condition where our fast and slow pointer will be equal.

 In both the approach our squareSum() method will be common because we have to find the square.
 */

public class isHappy {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
    public static boolean isHappy(int n) {
        /**Approach 1: */
        HashSet<Integer> sumSet= new HashSet<>();
        boolean isHap=true;
        while(isHap){
            int ans=squareSum(n);
            if(ans==1){
                break;
            }
            else if(sumSet.contains(ans)){
                isHap=false;
                break;

            }else{
                System.out.println(ans);
                sumSet.add(ans);
                n=ans;
            }
        }
        return isHap;

        /**Approach 2:
         *  /**Approach 2:
         *int fast = n;
         *int slow = n;
         *do {
         *slow = squareSum(slow);
         *fast = squareSum(squareSum(fast));
         *} while (slow != fast);
         *
         *return slow == 1 ? true : false;
         */

    }

    static int squareSum(int n){
        int sum=0;
        while(n>0){
            sum+=Math.pow(n%10,2);
            n/=10;
        }
        //sum+=Math.pow(n,2);
        return sum;
    }
}
