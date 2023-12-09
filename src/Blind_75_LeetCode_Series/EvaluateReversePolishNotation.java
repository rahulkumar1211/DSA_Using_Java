package Blind_75_LeetCode_Series;
import java.util.*;

public class EvaluateReversePolishNotation {
    public static void main(String[] args) {
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(tokens));
    }
    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<tokens.length;i++){
            if(tokens[i].equals("+")){
                int firstVal=stack.pop();
                int secondVal=stack.pop();
                int sum=firstVal+secondVal;
                stack.push(sum);
            }
            else if(tokens[i].equals("-")){
                int firstVal=stack.pop();
                int secondVal=stack.pop();
                int diff=secondVal-firstVal;
                stack.push(diff);
            }
            else if(tokens[i].equals("*")){
                int firstVal=stack.pop();
                int secondVal=stack.pop();
                int multiply=firstVal*secondVal;
                stack.push(multiply);
            }
            else if(tokens[i].equals("/")){
                int firstVal=stack.pop();
                int secondVal=stack.pop();
                int divison=secondVal/firstVal;
                stack.push(divison);
            }
            else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.peek();
    }
}
