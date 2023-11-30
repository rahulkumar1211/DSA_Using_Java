package BackTracking;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Problem: Write a code to travel from point A to point B in a matrix. Here A=(0,0), B=(2,2).
 *          Condition: You can only travel either down or right.
 */
public class MazeProblem {
    public static void main(String[] args) {
      //  System.out.println(count(3,3));
      //  System.out.println(pathIncludeDiagonal("",3,3));
        boolean[][] restriction={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
    //    pathWithRestrictions("",restriction,0,0);
       // allPaths("",restriction,0,0);
        int[][] paths=new int[restriction.length][restriction[0].length];
        allPathsPrint("",restriction,0,0,paths,1);
    }

    static int count(int r, int c){
        if(r==1 || c==1){
            return 1;
        }
        int down=count(r-1,c);
        int right=count(r,c-1);
        return down+right;
    }

    static List<String> path(String p, int r, int c){
        if(r==1 && c==1){
            List<String> returnValue= new ArrayList<>();
            returnValue.add(p);
            return returnValue;
        }
        List<String> Down= new ArrayList<>();
        List<String> Right= new ArrayList<>();
        if(r>1){
            Down=path(p+"D",r-1,c);
        }
        if(c>1){
            Right=path(p+"R",r,c-1);
        }
        Down.addAll(Right);
        return Down;
    }

    //Include a diagonal path as well in the path
    static List<String> pathIncludeDiagonal(String p, int r, int c){
        if(r==1 && c==1){
            List<String> returnValue= new ArrayList<>();
            returnValue.add(p);
            return returnValue;
        }
        List<String> list= new ArrayList<>();
        if(r>1 && c>1){
            list.addAll(pathIncludeDiagonal(p+"VH",r-1,c-1));//means going diagonal
        }
        if(r>1){
            list.addAll(pathIncludeDiagonal(p+"D",r-1,c));
        }
        if(c>1){
            list.addAll(pathIncludeDiagonal(p+"R",r,c-1));
        }

        return list;
    }

    //Restrictions is included in the path.
    static void pathWithRestrictions(String p, boolean[][] restrictions, int r, int c){
        if(r==restrictions.length-1 && c== restrictions[0].length-1){
            System.out.println(p);
            return;
        }
        if(!restrictions[r][c]){//it means if value at this point is false then recursion will terminate
            return;
        }
        if(r<restrictions.length-1){
            pathWithRestrictions(p+"D",restrictions,r+1,c);
        }
        if(c<restrictions[0].length-1){
            pathWithRestrictions(p+"R",restrictions,r,c+1);
        }
    }
    //include all paths: i.e. we can go UP, DOWN, RIGHT, LEFT

    static void allPaths(String p, boolean[][] maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){//it will check if the path is false it means it already visited. So return the function call.
            return;
        }
        //I am considering this block in path so I am making it as false to avoid repition
        maze[r][c]=false;

        if(r<maze.length-1){
            allPaths(p+"D",maze,r+1,c);
        }
        if(c<maze[0].length-1){
            allPaths(p+"R",maze,r,c+1);
        }
        if(r>0){
            allPaths(p+"U",maze,r-1,c);
        }
        if(c>0){
            allPaths(p+"L",maze,r,c-1);
        }

        //this line is where the function will be over
        //so before the function get removed, revert the changes which were made during this function call
        maze[r][c]=true;
    }

    //print all the path tracking
    static void allPathsPrint(String p, boolean[][] maze, int r, int c,int[][] path, int steps){
        path[r][c]=steps;
        if(r==maze.length-1 && c==maze[0].length-1){
            for(int[] arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            return;
        }

        if(!maze[r][c]){//it will check if the path is false it means it already visited. So return the function call.
            return;
        }
        //I am considering this block in path so I am making it as false to avoid repition
        maze[r][c]=false;
        path[r][c]=steps;

        if(r<maze.length-1){
            allPathsPrint(p+"D",maze,r+1,c,path,steps+1);
        }
        if(c<maze[0].length-1){
            allPathsPrint(p+"R",maze,r,c+1,path,steps+1);
        }
        if(r>0){
            allPathsPrint(p+"U",maze,r-1,c,path,steps+1);
        }
        if(c>0){
            allPathsPrint(p+"L",maze,r,c-1,path,steps+1);
        }

        //this line is where the function will be over
        //so before the function get removed, revert the changes which were made during this function call
        maze[r][c]=true;
        path[r][c]=0;
    }

}
