package Blind_75_LeetCode_Series;
import java.util.*;

public class SimplifyPath {

    public static void main(String[] args) {
            String path="/../";
        System.out.println(simplifyPath(path));
    }
    public static String simplifyPath(String path) {
        Stack<String> stack=new Stack<>();
        String[] vals=path.split("/");
        for(String val:vals){
            if(!stack.isEmpty() && val.equals("..")){
                stack.pop();
            }
            else if(!val.equals("..") && !val.equals(".") && !val.equals("")){
                stack.push(val);
            }
        }
        return "/"+String.join("/",stack);

    }
}
