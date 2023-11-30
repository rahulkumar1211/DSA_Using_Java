package Searching;

public class InfiniteArray {
 /*
  In this problem, we are given an Infinite Array and a target value.
  we have to find the index of the target value.
  constarints: since this is the infinite array we cannot apply array.length to find the length of an array
  */
    public static void main(String[] args) {
       int[] nums=new int[100];
       //Assinging value of nums from 1 to 100.
       for(int i=1; i<=100; i++){
           nums[i-1]=i;
       }
       int target =84;
       int start =0;
       int end=1;
       //Since we cannot apply the .length . so here we are checking whether target value lies inside the chosen start and
        //end index or not. If not lies then we are expanding our span and shifting the start and end .
       while(!(target>=nums[start] && target<nums[end])){
           end=2*end;
           //below condition, we are applying because we have given array of length 100 only as reference. so it will through
           // IndexOutOfBoundException.
           if(end>=100){
               end=99;
           }
       }
       while(start<=end){
           int mid=start+(end-start)/2;
           if(target<nums[mid]){
               end=mid-1;
           }
           else if(target>nums[mid]){
               start=mid+1;
           }
           else{
               System.out.println("The index value of "+target+" is "+mid);
               break;
           }

       }
    }
}
