package StackAndQueues;
import java.util.Stack;
import java.util.Arrays;

public class NextGreatestInCircularArray {
    public static void main(String[] args) {
            int[] input={1,2,3,2,1};
            nextGreater(input);
    }

    static void nextGreater(int[] nums){
        int n=nums.length;
        int[] output=new int[n];
        /**It will fill arrays with -1 */
        Arrays.fill(output,-1);
        Stack<Integer> stack=new Stack<>();

        for(int i=0;i<2*n;i++){
            while(!stack.isEmpty() && nums[stack.peek()]<nums[i%n]){
                output[stack.pop()]=nums[i%n];
            }
            if(i<n){
                stack.push(i);
            }
        }

        for(int val:output){
            System.out.print(val+" ");
        }


    }
}
