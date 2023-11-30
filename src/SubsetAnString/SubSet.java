package SubsetAnString;
import java.util.ArrayList;
import java.util.List;
public class SubSet {
    //implementation without using recursion
    //Number of subset: 2^N
    //time taken by each subset: N
    //space taken by each subset: N
    //time complexity: O(N.2^N)
    //space complexity: O(N.2^N)

    public static void main(String[] args) {
            int[] arr={1,2,3};
            List<List<Integer>> answer=subset(arr);
            for(List<Integer> l:answer){
                System.out.print(l+" ");
            }
    }

    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outerList=new ArrayList<>();

        outerList.add(new ArrayList<>());

        for(int num:arr){
            int n=outerList.size();
            for(int i=0;i<n;i++){
                List<Integer> internal= new ArrayList<Integer>(outerList.get(i));
                internal.add(num);
                outerList.add(internal);
            }

        }
        return outerList;
    }
}
