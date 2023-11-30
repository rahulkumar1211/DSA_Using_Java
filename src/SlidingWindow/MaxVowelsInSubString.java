package SlidingWindow;

public class MaxVowelsInSubString {
    public static void main(String[] args) {
      String s="acdiiigh";
      int k=3;
       maxVowel(s,k);
    }
    public static void maxVowel(String s,int k){
        int l=0;
        int r=k-1;
        int vCount=0;
        int maxVCount=Integer.MIN_VALUE;
        while(r<s.length()&& l<s.length()){
            if(s.charAt(l)=='a'||s.charAt(l)=='e'||s.charAt(l)=='i'||s.charAt(l)=='o'||s.charAt(l)=='u'){
                vCount++;
                if(maxVCount<vCount){
                    maxVCount=vCount;
                }
            }
            l++;
            if(l>r){
                r++;
                l=r-k+1;
                vCount=0;
            }

        }
        System.out.println(maxVCount);
    }
}
