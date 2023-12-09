package StackAndQueues;
import com.sun.security.jgss.GSSUtil;

import java.util.Stack;

public class NearestGreaterToRight {

    public static void main(String[] args) {
        int[] Input={1,3,2,4};
        System.out.println("Implementation Using Array");
        nearestGreaterInRight(Input);
        System.out.println("Implementation Using Stack");
        nearestGreater(Input);
    }

    /** Brute Force approach: Time Complexity: O(N^2) , Space Complexity: O(N)*/
    static void nearestGreaterInRight(int[] Input){
         int[] Output=new int[Input.length];

        for(int val:Input){
            System.out.print(val+" ");
        }
        System.out.print("\n");
        System.out.println("------------------------------------");

         for(int i=0;i<Input.length;i++){
             for(int j=i+1;j<Input.length;j++){
                 if(Input[j]>Input[i]){
                     Output[i]=Input[j];
                     break;
                 }
             }
             if(Output[i]==0){
                 Output[i]=-1;
             }
         }
         for(int val:Output){
             System.out.print(val+" ");
         }
        System.out.println("\n---------------------------------");



    }
    /**Optimize using Stack: Time Complexity: O(N), Space Complexity: O(N)*/
    static void nearestGreater(int[] Input){
        Stack<Integer> stack=new Stack<>();
        int[] Output=new int[Input.length];
        int idx=Input.length-1;
        while(idx>=0){
            if(!stack.isEmpty() && stack.peek()<Input[idx]){
                stack.pop();
            }
            else if(!stack.isEmpty() && stack.peek()>Input[idx]){
                Output[idx]=stack.peek();
                stack.push(Input[idx--]);
            }
            else if(stack.isEmpty()){
                Output[idx]=-1;
                stack.push(Input[idx--]);
            }
        }

        for(int val:Output){
            System.out.print(val+" ");
        }

    }
}
