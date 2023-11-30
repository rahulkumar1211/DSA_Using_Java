package Blind_75_LeetCode_Series;

/**
 * https://leetcode.com/problems/reverse-vowels-of-a-string/?envType=study-plan-v2&envId=leetcode-75
 *
 * Given a string s, reverse only all the vowels in the string and return it.
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 *
 * Example 1:
 * Input: s = "hello"
 * Output: "holle"
 *
 * Example 2:
 * Input: s = "leetcode"
 * Output: "leotcede"
 *
 * Logic:
 * It is based on two pointers.
 * First we have to check for vowels from start and end positions. For that we have to create one function which will return true or false.
 * Second if we couldn't find the vowels at one particular array then we have to move forward till we find it. Both from start and end.
 * Once we found it we have to swap it. For this we are using swap function.
 * Once we swap we are increasing start and last both.
 * Time complexity: O(N)
 * Space complexity: O(1)
 */
public class ReverseVowelsOfString {
    public static void main(String[] args) {
        String s="leetcode";
        char[] sArray=s.toCharArray();
        System.out.println(reverseVowel(sArray));

    }
    static String reverseVowel(char[] input){
       int startIndex=0;
       int lastIndex=input.length-1;
       while(startIndex<lastIndex){
           while(startIndex<lastIndex && !isVowel(input[startIndex])){
               startIndex++;
           }
           while(startIndex<lastIndex && !isVowel(input[lastIndex])){
               lastIndex--;
           }
           swapChar(input,startIndex,lastIndex);
           startIndex++;
           lastIndex--;
       }
       return new String(input);
    }

    static void swapChar(char[] input, int first, int second){
        char temp=input[first];
        input[first]=input[second];
        input[second]=temp;
    }

    static boolean isVowel(char ch){
        return ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
}
