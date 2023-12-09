package Blind_75_LeetCode_Series;

public class SubstringWithConcatenationOfAllWords {

    public static void main(String[] args) {
        String[] input={"foo","bar"};
        printPermutation("",input);


    }
    static void printPermutation(String p, String[] up){
        if(up.length==0){
            System.out.println(p);
            return;
        }
        String ch=up[0];
        int idx=0;
        for(int i=0;i<=p.length();i++){
            String first=p.substring(0,i);//i.e. empty string
            String second=p.substring(i,p.length());//i.e whole string
            printPermutation(first+ch+second,up);
        }
    }
}

