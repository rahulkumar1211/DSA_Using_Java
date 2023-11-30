package SubsetAnString;

public class RemoveSubStringFromString {
    /*
    Remove the subString if it's available in the original string
     */
    public static void main(String[] args) {
        String input="addfdjfapplekddff";
        String remove="apple";
        System.out.println(removeString(remove,input));
        /*Skip if app is available but apple should remain as it is*/
        System.out.println(skipAppButNotApple("dladappbhdleappledcdh"));
    }

    static String removeString(String remove,String original){
        if(original.isEmpty()){
            return "";
        }
        if(original.startsWith(remove)){//it will check if the string starts with "apple" or not
            return removeString(remove,original.substring(remove.length()));
        }else{
            return original.charAt(0)+removeString(remove,original.substring(1));
        }
    }
    static String skipAppButNotApple(String original){
        if(original.isEmpty()){
            return "";
        }
        if(original.startsWith("app") && !original.startsWith("apple")){
            return skipAppButNotApple(original.substring("app".length()));
        }else{
            return original.charAt(0)+skipAppButNotApple(original.substring(1));
        }
    }

}
