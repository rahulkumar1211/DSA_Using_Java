package SubsetAnString;

public class RemoveCharacterFromString {
    /*
    write a code to remove a particular character from a string
     */
    public static void main(String[] args) {
        /*Remove 'a' from string*/
        skipChar("","aachdaadcldaadds",'a');
        /*Remove 'd' from string*/
        System.out.println(skip("aachdaadcldaadds",'d'));
    }

    static void skipChar(String modified, String original, char c){
        if(original.isEmpty()){
            System.out.println("Modified String is: "+modified);
            return;
        }
        char ch=original.charAt(0);
        if(ch==c){
            skipChar(modified,original.substring(1),c);
        }else{
            skipChar(modified+ch,original.substring(1),c);
        }
    }

    static String skip(String original, char ch){
        if(original.isEmpty()){
            return "";
        }
        char c=original.charAt(0);//it will check for value at 0th index
        if(c==ch){
            return skip(original.substring(1),ch);
        }
        else{
            return c+skip(original.substring(1),ch);
        }
    }
}
