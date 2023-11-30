package Arrays;
import java.util.ArrayList;
public class ElementCheckUsingRecursion {
    public static void main(String[] args) {
        int[] nums={1,3,5,8,10,10,10,10,10,15};
        int target=10;
     //   ArrayList<Integer> output;
      //  System.out.println(checkElement(nums,target,0));
      //  System.out.println(findAllIndex(nums,target,0,output=new ArrayList<Integer>()));
        System.out.println(findIndexesWithoutListArgument(nums,target,0));
    }

    /**
     * Check whether element is present in the array or not and return true or false.
     */
    static boolean checkElement(int[] nums, int target, int index){

        if(index==nums.length){//it means we went outside the matrix length and didn't find the target
            return false;
        }

        return (target==nums[index])||(checkElement(nums,target,index+1));//It means either target==nums[index]
        // or check in other part of the array.

    }

    /**
     * Return the index where your found the target for the first time.
     */
    static int findIndex(int[] nums,int target,int index){
        if(index==nums.length){
            return -1;
        }
        if(target==nums[index]){
            return index;
        }
        else{
            return findIndex(nums,target,index+1);
        }
    }
    static int findIndexFromLast(int[] nums,int target,int index){
        if(index==-1){
            return -1;
        }
        if(target==nums[index]){
            return index;
        }
        else{
            return findIndexFromLast(nums,target,index-1);
        }
    }

    /* return the start and end index of the target in array
     */

    static ArrayList<Integer> findAllIndex(int[] nums,int target, int index, ArrayList<Integer> indexes){
        if(index==nums.length){
            return indexes;
        }
        if(nums[index]==target){
            indexes.add(index);
        }
        return findAllIndex(nums,target,index+1,indexes);
    }

    /*
    return the start and end index of the target in the array but without taking list as a parameter
     */
    static ArrayList<Integer> findIndexesWithoutListArgument(int[] nums,int target,int index){
        ArrayList<Integer> returnList= new ArrayList<Integer>();;
        if(index==nums.length){
            return returnList;
        }
        if(target==nums[index]){
            returnList.add(index);
        }
        /*
        Below ArrayList will store the values which is coming from previous recursion call.
         */
        ArrayList<Integer> returnAllIndexes=findIndexesWithoutListArgument(nums,target,index+1);
        returnList.addAll(returnAllIndexes);
        return returnList;
    }


}
