package Blind_75_LeetCode_Series;

public class FlowerbedProblem {
    /**
     * https://leetcode.com/problems/can-place-flowers/description/?envType=study-plan-v2&envId=leetcode-75
     *
     * You have a long flowerbed in which some of the plots are planted, and some are not.
     * However, flowers cannot be planted in adjacent plots.
     *
     * Given an integer array flowerbed containing 0's and 1's, where 0 means empty
     * and 1 means not empty, and an integer n, return true if n new flowers can be
     * planted in the flowerbed without violating the no-adjacent-flowers rule and
     * false otherwise.
     * Example 1:
     *
     * Input: flowerbed = [1,0,0,0,1], n = 1
     * Output: true
     * Example 2:
     *
     * Input: flowerbed = [1,0,0,0,1], n = 2
     * Output: false
     *
     * Logic: We are checking if the n[i-1]==n[i]==n[i+1]==0 then we can place the flower and we can return true or false based
     *        on the value of n after iteration through loop
     * Challenge: The above conditions will throw IndexOutOfBoundException for initial and last positions so we have to check those
     *            positions first and need to assign value accordingly. Then we can check value for middle elements.
     *
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public static void main(String[] args) {
        int[] flowerbed={1,0,0,0,1};
        int n=2;
        System.out.println(canPlaceFlowers(flowerbed,n));

    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        //checking the base conditions
        if(flowerbed.length==1 && flowerbed[0]==0 && n<=1){
            return true;
        }
        //checking the initial position
        if(flowerbed[0]==0 && flowerbed[0]==flowerbed[1]){
            flowerbed[0]=1;
            n=n-1;
        }
        //checking the last position
        if(flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-1]==flowerbed[flowerbed.length-2]){
            flowerbed[flowerbed.length-1]=1;
            n=n-1;
        }
        //it will check the middle positions and fill
        for(int i=1;i<flowerbed.length-1;i++){
            if(flowerbed[i]==0){
                if(flowerbed[i-1]==flowerbed[i] && flowerbed[i]==flowerbed[i+1]){
                    flowerbed[i]=1;
                    n=n-1;
                }
            }
        }

        if(n<=0){
            return true;
        }
        return false;
    }
}
