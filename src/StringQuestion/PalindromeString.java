package StringQuestion;

public class PalindromeString {

    public static void main(String[] args) {
        System.out.println(isPalindrome("abac"));
    }

    /**
     * Using Recurssion

    public static boolean isPalindrome(String s, int start, int end){
        if(start>=end){
            System.out.println(s+" is palindrome string");
            return true;
        }
        if(s.charAt(start)!=s.charAt(end)){
            System.out.println(s+" is not a palindrome string");
            return false;
        }
        return isPalindrome(s,start+1,end-1);
    }
     */

    /**
     * Using Iteration

    public static boolean isPalindrome(String s){
        for(int i=0; i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
                System.out.println(s + " is not a palindrome string");
                return false;

            }
        }
        System.out.println(s+" is a palindrome string");
        return true;
    }
     */


    /**
     * Using Regular Expression
     */
    public static boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        for(int i=0; i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}
