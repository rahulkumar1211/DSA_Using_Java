package BitManipulationAndMaths;

public class CountNumberOfZero {
    public static void main(String[] args) {
        /*Implementation using recursion*/
        System.out.println(countZero(100050,0));
    }

    static int countZero(int n, int count){
        if(n==0){
            return count;
        }
        if(n%10==0){
            count++;
        }
        return countZero(n/10,count);
    }

}
