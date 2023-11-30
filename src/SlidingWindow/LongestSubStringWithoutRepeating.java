package SlidingWindow;
import java.util.*;

/**
 * This question was based on sliding window algorithm.
 *
 * https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/
 *
 * We are taking two pointer as left and right.
 * We are checking if the character of the string is available in the HashSet or not. If the character is not
 * available in the string then we are inserting it into the Set and increasing the right value.
 * We are also checking the length of the inserted string which is not having any repeating character with [l-r+1] formula
 * and updating it if it is fullfilling the conditions.
 * If the character is available in the set then we are removing the character from starting (using l) and we continue to remove
 * it till we remove that particular matched character.
 * In the last we will return the value of len which will keep the longest substring without repeating the character.
 *
 * Time complexity: O(N)
 * Space complexity: O(N)
 *
 */
public class LongestSubStringWithoutRepeating {

    public static void main(String[] args) {
        String s="abcabcbb";
        subStr(s);
    }
    public static void subStr(String s){
        Set<Character> set=new HashSet<>();
        int len=0;
        int l=0;
        int r=0;
        while(r<s.length()){
            if(!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                if((r-l)+1>len){
                    len=(r-l)+1;
                }
                r++;
            }else if(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
        }
        System.out.println(len);

    }
}
