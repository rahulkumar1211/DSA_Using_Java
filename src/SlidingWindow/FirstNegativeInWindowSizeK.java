package SlidingWindow;
import java.util.*;

public class FirstNegativeInWindowSizeK {
    public static void main(String[] args) {
        int[] nums={-1,-2,3,4,-5,6,7,8,9};
        int k=3;
       System.out.println(firstNegative(nums,k));


    }

    static List<Integer> firstNegative(int[] nums, int k){
        List<Integer> list=new ArrayList<>();
        int j=0;
        int i=0;
        List<Integer> output=new ArrayList<>();
        while(j<k){
            if(nums[j]<0){
                list.add(nums[j]);
            }
            j++;
        }
        if(list.isEmpty()){
            output.add(0);
        }else{
            output.add(list.get(0));
        }
        while(j<nums.length){
      /**      if(list.isEmpty()){
                output.add(0);
            }else{
                output.add(list.get(0));
            }*/

            if(list.contains(nums[i])){
                list.remove(list.indexOf(nums[i]));
            }
            if(nums[j]<0){
                list.add(nums[j]);
            }
            i++;
            j++;
            if(list.isEmpty()){
                output.add(0);
            }else{
                output.add(list.get(0));
            }
        }
        /**
        while(j<nums.length){
            if(j-i+1<k){
                if(nums[j]<0){
                    list.add(nums[j]);
                }
                j++;
            }else if(j-i+1==k){
                if(list.isEmpty()){
                    output.add(0);
                }else{
                    output.add(list.get(0));
                }

                if(i>0 && list.contains(nums[i-1])){
                    list.remove(list.indexOf(nums[i-1]));
                }
                if(nums[j]<0){
                    list.add(nums[j]);
                }
                i++;
                j++;

            }

        }*/
       return output;
    }
}
