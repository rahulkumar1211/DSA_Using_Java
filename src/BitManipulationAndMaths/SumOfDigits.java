package BitManipulationAndMaths;

public class SumOfDigits {

    public static void main(String[] args) {
        System.out.println("Sum of 1050 is "+DigitSum(1050));
    }

    static int DigitSum(int n){
        if(n<10){
            return n;
        }
        return n%10+DigitSum(n/10);
    }
}
