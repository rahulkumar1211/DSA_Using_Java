package Blind_75_LeetCode_Series;

/**
 * https://leetcode.com/problems/greatest-common-divisor-of-strings/description/?envType=study-plan-v2&envId=leetcode-75
 *
 * For two strings s and t, we say "t divides s" if and only if s = t + ... + t
 * (i.e., t is concatenated with itself one or more times).
 *
 * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 *
 * Example 1:
 *
 * Input: str1 = "ABCABC", str2 = "ABC"
 * Output: "ABC"
 * Example 2:
 *
 * Input: str1 = "ABABAB", str2 = "ABAB"
 * Output: "AB"
 * Example 3:
 *
 * Input: str1 = "LEET", str2 = "CODE"
 * Output: ""
 */
public class GCDOfString {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCDEF","ABC"));
    }
    public static String gcdOfStrings(String str1, String str2) {
        /**if below if condition is false then str1+str2!=str2+str1 i.e. not-pallindromic */
        if(!(str1+str2).equals(str2+str1)) return "";
        return str2.substring(0,GCD(str1.length(),str2.length()));
    }
    //same function we use to find the GCD of two number
    //here we are taking length of strings as a number and finding it
    static int GCD(int len1,int len2){
        if(len2==0) return len1;
        else return GCD(len2,len1%len2);
    }
}
