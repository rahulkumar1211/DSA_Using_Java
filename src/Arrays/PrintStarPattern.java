package Arrays;

public class PrintStarPattern {
    public static void main(String[] args) {
        int n=4;
        printPattern1(n);
        printPattern2(5,5);

    }
    /*
    print below pattern
    * * * *
    * * *
    * *
    *
     */
    static void printPattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    /*
    Print below pattern
        *
        **
        ***
        ****
        *****
     */
    static void printPattern2(int r,int c){
        if(r==0){
            return;
        }
        if(c<r){
            printPattern2(r,c+1);
            System.out.print("* ");
        }else{
            printPattern2(r-1,0);
            System.out.println();

        }


    }
}
