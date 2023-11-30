package StringQuestion;

public class ReverseString {

    public static void main(String[] args) {
        Reverse("Rahul",0,4);
    }

    public static void Reverse(String s, int firstIndex, int lastIndex){
        if(firstIndex>=lastIndex){
            System.out.println(s);
            return;
        }
        s=swap(s,firstIndex,lastIndex);
        Reverse(s,firstIndex+1,lastIndex-1);

    }
    public static String swap(String input, int first, int last){
        char[] tempArray= input.toCharArray();
        char temp=tempArray[first];
        tempArray[first]=tempArray[last];
        tempArray[last]=temp;
        String s= String.valueOf(tempArray);
        return s;
    }
}
