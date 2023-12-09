package Blind_75_LeetCode_Series;

public class HistogramRectangle {
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }
    public static int largestRectangleArea(int[] heights) {
        int maxArea=0;
        int[] lessFromLeft=new int[heights.length];
        int[] lessFromRight=new int[heights.length];

        for(int i=0;i<heights.length;i++){
            int p=i;
            while(p>=0){
                if(heights[i]>heights[p]){
                    break;
                }
                else{
                    lessFromLeft[i]+=1;
                    p--;
                }
            }
        }
        for(int i=0;i<heights.length;i++){
            int p=i;
            while(p<heights.length){
                if(heights[i]>heights[p]){
                    break;
                }
                else{
                    lessFromRight[i]+=1;
                    p++;
                }
            }
        }

        for(int i=0;i<heights.length;i++){

            int area=heights[i]*Math.abs((lessFromRight[i]+lessFromLeft[i]-1));
            maxArea=Math.max(maxArea,area);
        }

        return maxArea;

    }
}
