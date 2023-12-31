package Blind_75_LeetCode_Series;

/**
 *
 * https://leetcode.com/problems/string-compression/?envType=study-plan-v2&envId=leetcode-75
 *
 * Given an array of characters chars, compress it using the following algorithm:
 *
 * Begin with an empty string s. For each group of consecutive repeating characters in chars:
 *
 * If the group's length is 1, append the character to s.
 * Otherwise, append the character followed by the group's length.
 * The compressed string s should not be returned separately, but instead, be stored in the input character array chars.
 * Note that group lengths that are 10 or longer will be split into multiple characters in chars.
 *
 * After you are done modifying the input array, return the new length of the array.
 *
 * You must write an algorithm that uses only constant extra space.
 *
 * Example 1:
 *
 * Input: chars = ["a","a","b","b","c","c","c"]
 * Output: Return 6, and the first 6 characters of the input array should be: ["a","2","b","2","c","3"]
 * Explanation: The groups are "aa", "bb", and "ccc". This compresses to "a2b2c3".
 * Example 2:
 *
 * Input: chars = ["a"]
 * Output: Return 1, and the first character of the input array should be: ["a"]
 * Explanation: The only group is "a", which remains uncompressed since it's a single character.
 * Example 3:
 *
 * Input: chars = ["a","b","b","b","b","b","b","b","b","b","b","b","b"]
 * Output: Return 4, and the first 4 characters of the input array should be: ["a","b","1","2"].
 * Explanation: The groups are "a" and "bbbbbbbbbbbb". This compresses to "ab12".
 *-----------------------------------------------------------------------------------------------------------------
 *  Logic:
 *  Here we will simply iterate over the array and checking the current value with previous value.
 *  if it is same then increasing the count otherwise adding it to string variable.
 *
 * Challenge: If we keep only i<chars.length then for if(i<chars.length && chars[i]==chars[i-1])
 *            it will only increase the count and return back to for loop and once the i will value will
 *            increase then it will break the loop. so we won't get the last value in our output.
 *            for that we have to iterate till i<=chars.length and we have to check if conditions
 *            till i<chars.length otherwise will get index out of bound exception.
 *           Since we are iterating till i<=chars.length and checking if condition till i<chars.length ,
 *           for i=chars.length it will go to else block and update the string s value and
 *           we'll get the required output.
 *           Time complexity: O(N)
 *           Space complexity: O(1)
 */

public class StringCompression {
    public static void main(String[] args) {
        char[] input={'a'};
        compressStr(input);

    }

    static void compressStr(char[] chars){
        String s="";
        int count=1;
        for(int i=1;i<=chars.length;i++){
            if(i<chars.length && chars[i]==chars[i-1]){
                count+=1;
            }else{
                s+=chars[i-1];
                if(count>1 && count<10){
                    s+=count;
                    count=1;
                }else if(count>=10){
                    s+=(count/10);
                    s+=(count%10);
                    count=1;
                }

            }
        }
        System.out.println(s);


    }
}
