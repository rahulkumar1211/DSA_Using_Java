package Blind_75_LeetCode_Series;

/**
 *
 * https://leetcode.com/problems/is-subsequence/description/?envType=study-plan-v2&envId=leetcode-75
 *
 * Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 *
 * A subsequence of a string is a new string that is formed from the original
 * string by deleting some (can be none) of the characters without disturbing
 * the relative positions of the remaining characters.
 * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 *
 * Example 1:
 * Input: s = "abc", t = "ahbgdc"
 * Output: true
 *
 * Example 2:
 * Input: s = "axc", t = "ahbgdc"
 * Output: false
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */
public class IsSubsequence {
    public static void main(String[] args) {
        System.out.println(isSub("abc","ahbgdc"));
    }

    static boolean isSub(String s, String t){
        int pointer1=0;
        int pointer2=0;
        while(pointer1<t.length() && pointer2<s.length()){
            if(t.charAt(pointer1)==s.charAt(pointer2)){
                pointer1+=1;
                pointer2+=1;
            }else{
                pointer1+=1;
            }
        }
        if(pointer2==s.length()){
            return true;
        }
        return false;
    }
}


