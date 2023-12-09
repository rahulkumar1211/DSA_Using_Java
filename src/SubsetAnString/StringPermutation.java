package SubsetAnString;
import java.util.ArrayList;
import java.util.List;

public class StringPermutation {
    public static void main(String[] args) {
        printPermutation("","abc");
       // System.out.println(printPermutationList("","abc"));
       // System.out.println(printPermutationCount("","abcd"));

    }

    static void printPermutation(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String first=p.substring(0,i);//i.e. empty string
            String second=p.substring(i,p.length());//i.e whole string
            printPermutation(first+ch+second,up.substring(1));
        }
    }

    static ArrayList<String> printPermutationList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> returnValue= new ArrayList<>();
            returnValue.add(p);
            return returnValue;
        }
        char ch= up.charAt(0);
        ArrayList<String> ans= new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String first=p.substring(0,i);
            String second=p.substring(i,p.length());
            ans.addAll(printPermutationList(first+ch+second,up.substring(1)));
        }
        return ans;
    }

    static int printPermutationCount(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        char ch=up.charAt(0);
        int count=0;
        for(int i=0;i<=p.length();i++){
            String first=p.substring(0,i);
            String second=p.substring(i,p.length());
            count+=printPermutationCount(first+ch+second,up.substring(1));
        }
        return count;
    }
}
