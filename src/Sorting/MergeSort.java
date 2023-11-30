package Sorting;
import java.util.Arrays;
public class MergeSort {

    /*
    No. of levels in which this array will break and then merge: k= log(base 2)N
    Time complexity: O(NlogN) base=2
    Space complexity: O(N)
     */

    public static void main(String[] args) {

        int[] nums={5,4,3,2,1};
        System.out.println(Arrays.toString(mergeSort(nums)));

    }

    static int[] mergeSort(int[] nums){
        if(nums.length==1){
            return nums;
        }
        int mid=nums.length/2;
        int[] left=mergeSort(Arrays.copyOfRange(nums,0,mid));
        int[] right= mergeSort(Arrays.copyOfRange(nums,mid,nums.length));

        return merge(left,right);
    }
    private static int[] merge(int[] first,int[] second){
        int[] mix=new int[first.length+second.length];

        int i=0;
        int j=0;
        int k=0;

        while(i<first.length && j<second.length){
            if(first[i]<second[j]){
                mix[k]=first[i];
                i++;

            }else{
                mix[k]=second[j];
                j++;
            }
            k++;
        }
        //it may be possible that one of the array not finished completely.
        //so add all the element in the array
        while(i<first.length){
            mix[k]=first[i];
            i++;
            k++;
        }
        while(j<second.length){
            mix[k]=second[j];
            j++;
            k++;
        }

        return mix;
    }
}
