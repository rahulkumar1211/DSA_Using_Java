package StringQuestion;

/**
 * https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
 *
 * Given two strings needle and haystack, return the index of the first occurrence of needle in haystack,
 * or -1 if needle is not part of haystack.
 *
 * Example 1:
 *
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 * Example 2:
 *
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we return -1.
 *
 * Time Complexity: O(N+M)
 * Space Complexity: O(N>M? N: M)
 *
 * Logic: Based on KMP Algorithm of String Matching
 */

public class IndexOfFirstOccureneceInString {
    public static void main(String[] args) {
                 findIndex();
    }
    static void findIndex(){
        String s="mississippi";
        String t="issipi";
        int[] tArray=new int[t.length()];
        int p1=0;
        int p2=1;
        tArray[p1]=0;
        while(p2<t.length()){
            if(t.charAt(p1)==t.charAt(p2)){
                tArray[p2]=p1+1;
                p1+=1;
                p2+=1;
            }else{
                if(p1==0){
                    tArray[p2]=0;
                    p2+=1;
                }else{
                    p1=tArray[p1-1];
                }
            }
        }

        int sPointer=0;
        int tPointer=0;
        while(sPointer<s.length() && tPointer<t.length()){
            if(s.charAt(sPointer)==t.charAt(tPointer)){
                sPointer++;
                tPointer++;
            }else{
                if(tPointer==0){
                        sPointer+=1;
                }else{
                    tPointer=tArray[tPointer-1];

                }
            }
        }
        if(tPointer==t.length()){
            System.out.println(t+" is available inside "+s);
            System.out.println("The index of first occurrence is "+(sPointer-tPointer));
        }else{
            System.out.println(t+" is not available inside "+s);
            System.out.println("The index of first occurrence is -1");
        }
    }
}

