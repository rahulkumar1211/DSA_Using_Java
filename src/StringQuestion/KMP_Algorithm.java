package StringQuestion;

public class KMP_Algorithm {
    /**
     * Knuth-Morris-Prathh Algorithm
     * Logic: In this algorithm we create LPS array where LPS stands for Longest Prefix and Suffix Array. We iterate through
     * the target string which we want to check whether available in the source or not. In target string we go through each
     * element and check whether prefix and suffix at the particular index is same or not. According to that we update the values in
     * array.
     * Once we create the array we start check the target in the source.
     *
     * Worst Time Complexity: O(N+M)
     * Space complexiyt: O(target.length())
     *
     * For better understanding: https://www.youtube.com/watch?v=JoF0Z7nVSrA
     *
     */

    public static void main(String[] args) {
            KMP();
    }

    static void KMP(){
        String s="mississippi";
        String t="issip";
        int[] tArray=new int[t.length()];
        int p1=0;
        int p2=1;
        tArray[p1]=0;
        while(p2<t.length()){
            if(t.charAt(p1)==t.charAt(p2)){
                tArray[p2]=p1+1;
                p1+=1;
                p2+=1;
            }else{
                if(p1==0){
                    tArray[p2]=0;
                    p2+=1;
                }else{
                    p1=tArray[p1-1];
                }
            }
        }

        int sPointer=0;
        int tPointer=0;
        while(sPointer<s.length() && tPointer<t.length()){
            if(s.charAt(sPointer)==t.charAt(tPointer)){
                sPointer++;
                tPointer++;
            }else if(tPointer==0){
                sPointer+=1;
            }else{
                tPointer=tArray[tPointer-1];
            }
        }
        if(tPointer==t.length()){
            System.out.println(t+" is available inside "+s);
        }else{
            System.out.println(t+" is not available inside "+s);
        }
    }
}
