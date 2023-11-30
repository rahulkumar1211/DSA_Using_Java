package BitManipulationAndMaths;

public class ReverseNumber {
    public static void main(String[] args) {
        int sum = 0;
        int n = 12345678;

        /* using while loop
        while (n > 0) {
            sum = 10 * sum + n % 10;
            n=n/10;
        }
        System.out.println(sum);*/
        /*Using Recursion*/
        System.out.println(reverse(n,sum));
    }

    static int reverse(int n,int sum){
        if(n==0){
            return sum;
        }
        sum=10*sum+n%10;
        return reverse(n/10,sum);
    }

}

