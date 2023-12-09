package Blind_75_LeetCode_Series;
import java.util.*;

/**
 * Given a string s which represents an expression, evaluate this expression and return its value.
 * The integer division should truncate toward zero.
 * You may assume that the given expression is always valid. All intermediate results will be in the range of [-231, 231 - 1].
 * Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().
 *
 * Example 1:
 * Input: s = "3+2*2"
 * Output: 7
 *
 * Example 2:
 * Input: s = " 3/2 "
 * Output: 1
 *
 * Example 3:
 * Input: s = " 3+5 / 2 "
 * Output: 5
 */

public class BasicCalculator {

    public static void main(String[] args) {
        String s="1 + 1";
        System.out.println(Calculator(s));
    }

    static int Calculator(String s){
        char[] val=s.toCharArray();
        Stack<Integer> stack=new Stack<>();
        int number=0;
        int result=0;
        int sign=1;
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(val[i])){
                number=(10*number)+(val[i]-'0');
            }
            else if(val[i]=='+'){
                result+=(sign*number);
                sign=1;
                number=0;
            }
            else if(val[i]=='-'){
                result+=(sign*number);
                sign=-1;
                number=0;
            }
            else if(val[i]=='('){
                stack.push(result);
                stack.push(sign);
                result=0;
                number=0;
                sign=1;
            }
            else if(val[i]==')'){
                result+=(sign*number);
                number=0;
                int stack_sign=stack.peek();
                stack.pop();
                int last_result=stack.peek();
                stack.pop();
                result*=stack_sign;
                result+=last_result;
            }
        }
        result+=(number*sign);
        return result;
    }
}
