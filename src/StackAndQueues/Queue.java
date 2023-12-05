package StackAndQueues;

public class Queue {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int end=0; //can give -1 also but we have to modify accordingly.

    public Queue(){
        this(DEFAULT_SIZE);
    }
    public Queue(int size){
        this.data=new int[size];
    }

    public boolean isFull(){
        if(end==data.length-1){//i.e. pointer is on last index;
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(end==0){ //i.e Queue is empty
            return true;
        }
        return false;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++]=item;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty ");
        }
        int removed=data[0];
        //need to shift all the data one step towards left. Time Complexity: O(N)
        for(int i=1;i<end;i++){
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[0];
    }

    public void display() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        for(int i=0;i<end;i++){
            System.out.print(data[i]+" ");
        }
        System.out.print("END");
    }
}
