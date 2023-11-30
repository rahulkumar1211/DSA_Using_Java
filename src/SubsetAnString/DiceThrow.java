package SubsetAnString;
import java.util.List;
import java.util.ArrayList;
public class DiceThrow {
    /*
    Write a program to return the possible combinations of outcome from the dice which will be equal to target.
    like target-4: (1,1,2),(1,3),(2,2),(3,1),(4)..etc.
     */
    public static void main(String[] args) {
           // Dice("",4);
        System.out.println(DiceList("",4));
        System.out.println(DiceListCount("",4));
    }

    static void Dice(String p, int target){
        if(target==0){
            System.out.print(p+" ");
            return;
        }

        for(int i=1;i<=6 && i<=target;i++){
            Dice(p+i,target-i);
        }
    }
    //Return answer in the form of List
    static List<String> DiceList(String p, int target){
        if(target==0){
            List<String> returnValue=new ArrayList<>();
            returnValue.add(p);
            return returnValue;
        }
        List<String> ans= new ArrayList<>();
        for(int i=1;i<=6&&i<=target;i++){
            ans.addAll(DiceList(p+i,target-i));
        }
        return ans;
    }

    //Return the count of number of combinations
    static int DiceListCount(String p, int target){
        if(target==0){
            return 1;
        }
        int count=0;
        for(int i=1;i<=6&& i<=target;i++){
            count+=DiceListCount(p+i,target-i);
        }
        return count;
    }

    //if the max face value is given by the user instead of static 6.
    static void DiceWithDifferentFace(String p, int target, int face){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=face&&i<=target;i++){
            DiceWithDifferentFace(p+i,target-i,face);
        }
    }
}
