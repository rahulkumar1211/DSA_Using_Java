package SubsetAnString;
import java.util.ArrayList;

/*
https://leetcode.com/problems/letter-combinations-of-a-phone-number/
Below code is based on 1-abc,2-def,3-ghi,.....
But leetcode solution is different
 */
public class LetterCombinationOfPhoneNumber {
    public static void main(String[] args) {
       // printPad("","12");
        System.out.println(printPadList("","12"));
    }

    static void printPad(String p,String up){
        if(up.isEmpty()){
            System.out.print(p+" ");
            return;
        }

        int digit= up.charAt(0)-'0';//this will convert "2" to 2 i.e. char to int
        for(int i=(digit-1)*3;i<digit*3;i++){

            char ch= (char)('a'+i);//this will give char value . a+1= b; a+2=c;
            printPad(p+ch,up.substring(1));
        }
    }

    static ArrayList<String> printPadList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> returnValue=new ArrayList<>();
            returnValue.add(p);

            return returnValue;
        }
        int digit= up.charAt(0)-'0';
        ArrayList<String> ans= new ArrayList<>();
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            ans.addAll(printPadList(p+ch,up.substring(1)));
        }
        return ans;
    }
}
