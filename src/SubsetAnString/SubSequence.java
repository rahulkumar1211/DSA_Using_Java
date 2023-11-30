package SubsetAnString;
import java.util.ArrayList;
public class SubSequence {
    /*
    Write a program to print the permutations of a string
    eg. [abc]=[a,b,c,ab,ac,bc,abc];
    Note: Order of character should not be changed
     */

    public static void main(String[] args) {
        printPermutation("","abc");
        System.out.println(printPermute("","abc"));
    }

    static void printPermutation(String output,String input){
        if(input.isEmpty()){
            System.out.print(output+" ");
            return;
        }
        //take the character
        printPermutation(output+input.charAt(0),input.substring(1));
        //leave the character
        printPermutation(output,input.substring(1));
    }

    /*
    Return answers in ArrayList
     */
    static ArrayList<String> printPermute(String output, String input){
        if(input.isEmpty()){
            ArrayList<String> list= new ArrayList<>();
            list.add(output);
            return list;
        }
        //take the character
       ArrayList<String> left= printPermute(output+input.charAt(0),input.substring(1));
        //leave the character
       ArrayList<String> right= printPermute(output,input.substring(1));

       left.addAll(right);

       return left;
    }
}
