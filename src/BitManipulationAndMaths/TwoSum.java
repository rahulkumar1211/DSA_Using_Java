package BitManipulationAndMaths;

import java.util.Arrays;

public class TwoSum {

    public void calculateTwoSum(){
        int[] numbers={2,7,11,15};
        int target=9;
        int[] output= new int[2];
        /*
        Approach 1: Below approach is based on nested loop.
         */
        outerLoop:
        for(int i=0; i<numbers.length;i++){
            int firstValue=numbers[i];
                for(int j=numbers.length-1; j>i;j--){
                    if(target-firstValue==numbers[j]){
                        output[0]=++i;
                        output[1]=++j;
                        break outerLoop;// this is called breaking the labeled loop. It will break the outerloop instead of innerloop.
                    }
                }
        }
        /*
        Approach 2: It is based on two pointer method which is available in LeetCode 150 Question section
         */
        for(int num:output){
            System.out.print(num+" ");
        }

    }
}
