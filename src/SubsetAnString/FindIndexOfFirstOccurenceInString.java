package SubsetAnString;

public class FindIndexOfFirstOccurenceInString {

    public static void main(String[] args) {
        System.out.println(findIndex("hello","ll"));
    }

    static int findIndex(String str, String target){
        int firstIndex=0;
        int firstOccurrence=0;
       for(int i=firstIndex,j=0;i<str.length() && j<target.length();){
           if(str.charAt(i)==target.charAt(j)){
               i=i+1;
               j=j+1;
               firstOccurrence=firstIndex;
           }else{
               firstIndex=i;
               j=0;
               firstOccurrence=0;
           }
       }
       return firstOccurrence;

    }
}
