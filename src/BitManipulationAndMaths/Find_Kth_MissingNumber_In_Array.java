package BitManipulationAndMaths;

public class Find_Kth_MissingNumber_In_Array {

    public static void main(String[] args) {
        int[] nums={2,3,4,7,11};
        int k=5;
        int ans=1;
        int count=0;
        int number=1;
        int index=0;
        while(index<nums.length && count<k){
            if(nums[index]==number){
                number++;
                index++;
            }else{
                ans=number;
                count++;
                number++;
            }
        }
      /*  while(number<nums[nums.length-1] && count<k){
            int searchOutput=search(nums,number);
            if(searchOutput==-1){
                ans=number;
                count++;
            }
            number++;
        }*/
        if(count<k){
            System.out.println(nums[nums.length-1]+(k-count));
        }else{
            System.out.println(ans);
        }
    }

    static int search(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            int mid= start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
