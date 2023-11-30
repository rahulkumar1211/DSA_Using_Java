package SubsetAnString;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] arr={1,2,2};
        List<List<Integer>> answer=subset(arr);
        for(List<Integer> l:answer){
            System.out.print(l+" ");
        }
    }
    static List<List<Integer>> subset(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outerList=new ArrayList<>();

        outerList.add(new ArrayList<>());
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            if(i>0 && arr[i]==arr[i-1]){
                start=end+1;
            }
            end=outerList.size()-1;

                int n=outerList.size();
                for(int j=start;j<n;j++){
                    List<Integer> internal= new ArrayList<Integer>(outerList.get(j));
                    internal.add(arr[i]);
                    outerList.add(internal);
                }

            }

        return outerList;
    }
}
