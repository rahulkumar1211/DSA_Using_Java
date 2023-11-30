package StringQuestion;

public class PowerSetOfString {
    public static void main(String[] args) {
        powerSet("abc",0,"");
    }
    public static void powerSet(String input, int index, String current){
        if(index==input.length()){
            System.out.println(current);
            return;
        }
        powerSet(input, index+1,current+input.charAt(index));
        powerSet(input, index+1, current);
    }
}
