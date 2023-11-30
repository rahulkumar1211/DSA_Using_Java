package BitManipulationAndMaths;

public class FibonacciNumber {

    /*
    Fibonacci: Here the nth value is the sum of n-1 & n-2
               0 1 1 2 3 5 8 13 21 34 55 89...........

     */

    public static void main(String[] args) {
        System.out.println(calculateFibonacci(5));
    }

    static int calculateFibonacci(int n){
        if(n==0|| n==1){
            return n;
        }
        return calculateFibonacci(n-1)+calculateFibonacci(n-2);
    }
}
