package SubsetAnString;

public class PrintPermuteWithASCII {
    /*
    print the permutation of a string and also print their ASCII values
     */
    public static void main(String[] args) {
        printPermuteWithASCII("","abc");
    }

    static void printPermuteWithASCII(String output, String input){
        if(input.isEmpty()){
            System.out.print(output+" ");
            return;
        }

        //Take the character
        printPermuteWithASCII(output+input.charAt(0),input.substring(1));
        //Leave the character
        printPermuteWithASCII(output,input.substring(1));
        //print ASCII of character
        printPermuteWithASCII(output+(input.charAt(0)+0),input.substring(1));
        // ch+0=> it will print the ASCII value of character ch
    }
}
