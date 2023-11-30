package BitManipulationAndMaths;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(calculateFactorial(5));
    }

    static int calculateFactorial(int n){
        if(n==1){
            return n;
        }
        return n*calculateFactorial(n-1);
    }
}
