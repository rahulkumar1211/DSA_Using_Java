package BitManipulationAndMaths;

import java.util.Arrays;

public class BitManipulation {

    /*
      Sign:
      Bitwise AND: &
      Bitwise OR: |
      Bitwise XOR: ^
      Bitwise NOT: ~
      Shift digit n times right in a number: N(number)>>n
      Shift digit n times left in a number: N(number)<<n
      For Signed right shift-  n = n>>1 eg. a>>b=a/2^b
      For Unsigned right shift-  n = n>>>1 eg. a<<b= a*2^b
      -------------------------------------------------------
      XOR Property:
      1. n ^n= n
      2. 0^n= n
      3. 1^n= ~n
      -------------------------------------------------------
      AND Property:
      1. if n&1==1 -> it's an odd number
      2. if n&1==0 -> it's an even number
      -------------------------------------------------------
      Bit Masking:
      It is used to set, get or clear the ith bit of a given number.
       eg. 1 & (digit of a number)= 1 (it's a 1 at that digit)
           1& (digit of a number)=0 (it's a 0 at that digit)
      --------------------------------------------------------
     */

    public static void main(String[] args) {
      /*  EvenOrOdd(5);
        EvenOrOdd(8);
        FindBit(170,7); //check the function implementation. It is showing wrong value
        SetBit(182,5); //check the function implementation. It is showing wrong value
        findMagic(3);
        NoOfDigit(10,2);
        checkPowerOf2(16);
        checkPowerOf2(14);
        calculatePower(2,4);
        SetBit(15);
        //range xor for a,b= xor(b) ^xor(a-1)
        int a=3;
        int b=9;
        System.out.println("xor answer "+ (findRange(b)^findRange(a-1)));
        int[][] matrix={{1,1,0},{1,0,1},{0,0,0}};
        flipAndInvertImage(matrix);
        int n=15;
        for(int i=1;i<=n;i++){
            System.out.println(i+" is a Prime: "+isPrime(i));
        }
        int n=40;
        boolean[] primes=new boolean[n+1];
        findPrime(n,primes);

        System.out.println(findHCF(6,21));

        System.out.println(findLCM(2,4));

        System.out.println(rangeBitwiseAnd(5,7));

       */
        addBinary("1010","1011");
    }
    /*
    Q1. Find the only non-repeating elements in an array were every element repeat twice.
     */
    public void UniqueElementPartOne(){
        int[] arr={5,4,1,4,3,5,1};
        int result=0;
        for(int i=0; i<arr.length; i++){
            result=result^arr[i];
        }
        System.out.println("The unique element in an array is: "+result);
        System.out.println("The time complexity is O(n) and space complexity is O(1)");
    }

    /*
     Q2. Find the two non-repeating elements in an array where every element repeat twice.
     */
    public void UniqueElementPartTwo(){
        int[] arr={5,4,1,4,3,5,1,2};
        int result=0;
        for(int i=0; i<arr.length; i++){
            result=result^arr[i];
        }
        int temp=-(~result); //inverting the number will make it negative in decimal so palced - in front of it to make it positive.
        int firstElement= result^temp;
        int secondElement= result^firstElement;

        System.out.println("Two unique elements are "+firstElement+" , "+secondElement);
        System.out.println("The time complexity is O(n) and space complexity is O(1)");
    }

    /*
    Q3. Find the non-repeating number from an array where every element repeat thrice.
     */

     public void UnqiueElementPartThree(){
         int[] arr={3,3,9,2,2,2,9,9,3,4,4,4,5,6,6,6,7,7,7,5,5,1};
         Arrays.sort(arr);
         for(int i=1; i<arr.length; i+=3){
             if(arr[0]!=arr[1]){
                 System.out.println("Unqiue element is: "+arr[0]);
                 break;
             }
             if(arr[arr.length-1]!=arr[arr.length-2]){
                 System.out.println("Unique element is: "+arr[arr.length-1]);
                 break;
             }
             if(arr[i]!=arr[i-1]){
                 System.out.println("Unique element is: "+arr[i-1]);
                 break;
             }
         }
     }
     /*
     Q4. Find whether the number is even or odd.
      */
    static void EvenOrOdd(int num){
        if((num&1)==1){
            System.out.println(num+" is odd number");
        }
        else{
            System.out.println(num+" is a even number");
        }
    }

    /*
    Q5. Find the ith of a number
     */
    static void FindBit(int n, int k){

        int bit=n&1<<(k-1);
        System.out.println("Bit at "+k+"th position is: "+bit);
    }

    /*
    Q6. Set the ith of a number
     */

   static void SetBit(int n, int k){
       int bit=n|(1<<(k-1));
       System.out.println(bit);
   }

   /*
   Q7. Find the nth magic number.
       Magic number is nothing but set bit in binary multiplied with 5^(n-1) where n is nth magic number.
    */

    static void findMagic(int n){
        int ans=0;
        int base=5;
        while(n>0){
            int lastBit=n&1;
            n=n>>1;
            ans+=lastBit*base;
            base*=5;
        }
        System.out.println(ans);
    }
    /*
    Q8. Find the number of digits in a particular base
        eg. 32 have 5 digit in binary number
            proof: log32/log2= 5
        Formula: Loga(base b)= loga/logb
                 Time complexity: logn
     */
    static void NoOfDigit(int number, int base){
        int digits=(int) (Math.log(number)/Math.log(base))+1;
        System.out.println("Number of digits in "+number+" in base "+base+" is "+digits);
    }

    /*
    Q9. Check whether the number is a power of 2 or not.
        eg. 16 is a power of 2
        formula: if n&(n-1)==0 then it's a power of 2.
        eg. 0 is a power of 2. (exception) so give false for this case separately
     */
    static void checkPowerOf2(int number){
        if((number&(number-1))==0){
            System.out.println(number+" is a power of 2");
        }
        else{
            System.out.println(number+" is not a power of 2");
        }
    }

    /*
    Q10. Calculate a^b

     */
    static void calculatePower(int base, int power){
        int ans=1;
        while(power>0){ //Time complexity: O(logn)
            if((power&1)==1){
                ans*=base;

            }
            base*=base;
            power=power>>1;
        }
        System.out.println(ans);
    }

    /*
    Q11. Count set bit in a number
    eg. 9-> number of set bit is 2
     */
    static void SetBit(int number){
        int count=0;
        while(number>0){
            if((number&1)==1){
                count++;
            }
            number=number>>1;
        }
        System.out.println(count);
    }

    /*
    Q12. Find range xor from 0 to n

     */
    static int findRange(int num){
        if(num%4==0){
            return num;
        }
        if(num%4==1){
            return 1;
        }
        if(num%4==2){
            return num+1;
        }

            return 0;

    }

    /*
    Q13. Flipping the image
    Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.

    To flip an image horizontally means that each row of the image is reversed.

    For example, flipping [1,1,0] horizontally results in [0,1,1].
    To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.

    For example, inverting [0,1,1] results in [1,0,0].
     */
    static void flipAndInvertImage(int[][] image) {
      for(int[] row:image){
          for(int c=0;c<(image[0].length+1)/2;c++){
              int temp=row[c]^1;
              row[c]=row[image[0].length-1-c]^1;
              row[image[0].length-1-c]=temp;
          }
      }
        for(int r=0; r<image.length;r++){
            for(int c=0; c<image[0].length;c++){
                System.out.print(image[r][c]+" ");
            }
            System.out.println();
        }

    }

    /*
    Q14. Check whether the number is prime or not
         logic: check whether number is divisible by values<=sqrt(n). If it does then not a prime otherwise prime.

     */
    static boolean isPrime(int n){ //Time complexity: O(sqrt(n))
        if(n<=1) return false;
        int c=2;
        while(c*c<=n){
            if(n%c==0) return false;
            c++;
        }
        return true;
    }

    /*
    Q15. Find whether the number is prime or not with other approach
         Time complexity in this approach O(n*log(log(n))
     */
   //false in array means number is prime
    static void findPrime(int n,boolean[] Prime){
        for(int i=2; i*i<=n;i++){
            if(!Prime[i]){
                for(int j=2*i;j<=n;j+=i){
                    Prime[j]=true;
                }
            }
        }
        for(int i=2;i<=n;i++){
            if(!Prime[i]){
                System.out.print(i+" ");
            }
        }
    }

    /*
    Q16. Find HCF/GCD of a number
         -> what is the HCF of number a & b: minimum positive value of equation ax+by where x & y are integers.
         Formula: GCD or HCF(a,b)= HCF(a%b(if a>b) or b%a(if b>a), a); -> Eucledian Algorithm
     */
    static int findHCF(int a, int b){
            if(a==0){
                return b;
            }
            return findHCF(b%a,a);
    }

    /*
    Q17. Find LCM of a number
      -> LCM(a,b)= minimum number which is divisible by both a & b.
      ->LCM(3,7)- 21
      ->LCM(2,4)-4
      NOTE: LCM(a,b) * HCF(a,b)=a*b;
            so LCM(a,b)=a*b/HCF(a,b);
     */
    static int findLCM(int a, int b){
        return (a*b)/findHCF(a,b);
    }
    /*
    Q18. Find bitwise AND for a range of number
     */
    static int rangeBitwiseAnd(int left, int right) {
        if(left>=Integer.MAX_VALUE || right>=Integer.MAX_VALUE){
            return 0;
        }
        int result=1;
        for(int i=left;i<right;i++){
            result&=i;
        }
        return result;
    }

    /*
    Q19. Add two Binary number
     */
    static void addBinary(String a, String b) {
        int alen= a.length();
        int blen= b.length();
        int sum = 0;
        int carry = 0;
        StringBuilder output = new StringBuilder();
       for(int i=alen-1, j=blen-1; i>=0||j>=0;i--,j--){
           int x=Character.getNumericValue(a.charAt(i));
           int y=Character.getNumericValue(b.charAt(j));
           sum=(x+y+carry);
           output.append(sum%2);
           carry=sum/2;
       }
       if(carry>0){
           output.append(carry);
       }
        System.out.println(output.reverse().toString());
    }
}

