package Sorting;

import java.util.Arrays;

public class MergeSortInPlace {
    public static void main(String[] args) {

        int[] nums={5,4,3,2,1};
       mergeSort(nums,0,nums.length);
        System.out.println(Arrays.toString(nums));

    }

    static void mergeSort(int[] nums,int s,int e){
        if(e-s==1){
            return;
        }
        int mid=s+(e-s)/2;
        System.out.println(Arrays.toString(nums));
        System.out.println("------------------------------------------");
        mergeSort(nums,s,mid);
        mergeSort(nums,mid,e);

        mergeInPlace(nums,s,mid,e);
    }
    private static void mergeInPlace(int[] nums,int s,int mid, int e){
        int[] mix=new int[e-s];

        int i=s;
        int j=mid;
        int k=0;

        while(i<mid&& j<e){
            if(nums[i]<nums[j]){
                mix[k]=nums[i];
                i++;

            }else{
                mix[k]=nums[j];
                j++;
            }
            k++;
        }
        //it may be possible that one of the array not finished completely.
        //so add all the element in the array
        while(i<mid){
            mix[k]=nums[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k]=nums[j];
            j++;
            k++;
        }

        for(int l=0;l<mix.length;l++){
            nums[s+l]=mix[l];
        }
    }
}
