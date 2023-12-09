package StackAndQueues;

import java.util.Stack;

public class NearestGreaterToLeft {

    public static void main(String[] args) {
        int[] Input={1,3,2,4};
        nearestGreater(Input);
    }

    /**Optimize using Stack: Time Complexity: O(N), Space Complexity: O(N)*/
    static void nearestGreater(int[] Input){
        java.util.Stack<Integer> stack=new Stack<>();
        int[] Output=new int[Input.length];
        int idx=0;
        while(idx<Input.length){
            if(!stack.isEmpty() && stack.peek()<Input[idx]){
                stack.pop();
            }
            else if(!stack.isEmpty() && stack.peek()>Input[idx]){
                Output[idx]=stack.peek();
                stack.push(Input[idx++]);
            }
            else if(stack.isEmpty()){
                Output[idx]=-1;
                stack.push(Input[idx++]);
            }
        }

        for(int val:Output){
            System.out.print(val+" ");
        }

    }
}
