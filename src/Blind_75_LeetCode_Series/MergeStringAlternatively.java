package Blind_75_LeetCode_Series;

/**
 *
 * https://leetcode.com/problems/merge-strings-alternately/description/?envType=study-plan-v2&envId=leetcode-75
 *
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order,
 * starting with word1. If a string is longer than the other, append the additional letters onto the
 * end of the merged string.
 *
 * Return the merged string.
 * Example 1:
 *
 * Input: word1 = "abc", word2 = "pqr"
 * Output: "apbqcr"
 * Explanation: The merged string will be merged as so:
 * word1:  a   b   c
 * word2:    p   q   r
 * merged: a p b q c r
 *
 * Example 2:
 *
 * Input: word1 = "ab", word2 = "pqrs"
 * Output: "apbqrs"
 * Explanation: Notice that as word2 is longer, "rs" is appended to the end.
 * word1:  a   b
 * word2:    p   q   r   s
 *
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */

public class MergeStringAlternatively {
    public static void main(String[] args) {
        String word1="abc";
        String word2="pqr";
        System.out.println(mergeAltr(word1,word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        String output="";
        int len1=word1.length();
        int len2=word2.length();
        int i=0;
        int j=0;
        while(i<len1 && j<len2){
            output+=word1.charAt(i);
            output+=word2.charAt(j);
            i=i+1;
            j=j+1;
        }
        //if word2 completed but word1 not then
        while(i<len1){
            output+=word1.charAt(i);
            i=i+1;
        }
        //if word1 completed but word2 not then
        while(j<len2){
            output+=word2.charAt(j);
            j=j+1;
        }
        return output;

    }

    static String mergeAltr(String word1,String word2){
        String output="";
        while(!word1.isEmpty()&&!word2.isEmpty()){
            output+=word1.charAt(0);
            output+=word2.charAt(0);
            word1=word1.substring(1);
            word2=word2.substring(1);
        }
        //if word2 is completed but word1 is not then
        while(!word1.isEmpty()){
            output+=word1.charAt(0);
            word1=word1.substring(1);
        }
        //if word1 is completed but word2 is not then
        while(!word2.isEmpty()){
            output+=word2.charAt(0);
            word2=word2.substring(1);

        }
        return output;
    }
}
