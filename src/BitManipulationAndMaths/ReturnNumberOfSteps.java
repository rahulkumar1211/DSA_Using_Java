package BitManipulationAndMaths;

public class ReturnNumberOfSteps {
    /*
    In this program we have return number of step required to make number to zero.
    If number is even then divide it by 2.
    If number is odd then subtract 1 from it.
    LeetCode Question. 1342
     */
    public static void main(String[] args) {

        System.out.println(steps(41,0));
    }

    static int steps(int n, int steps){
        if(n==0){
            return steps;
        }
        if(n%2==0){
            n=n/2;
        }
        else{
            n=n-1;
        }
        steps++;
        return steps(n,steps);
    }
}
