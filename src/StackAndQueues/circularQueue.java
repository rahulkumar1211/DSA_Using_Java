package StackAndQueues;

public class circularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    protected int end=0; //can give -1 also, but we have to modify accordingly.
    protected int front=0;
    private int size=0;

    public circularQueue(){
        this(DEFAULT_SIZE);
    }
    public circularQueue(int size){
        this.data=new int[size];
    }

    public boolean isFull(){
        if(size==data.length){//i.e. pointer is on last index;
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(size==0){ //i.e Queue is empty
            return true;
        }
        return false;
    }

    public boolean insert(int item){
        if(isFull()){
            return false;
        }
        data[end++]=item;
        end=end%data.length;
        size++;
        return true;
    }

    public int remove() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty ");
        }
        int removed=data[front++];
        front=front%data.length;
        size--;
        return removed;
    }
    public int front() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    public void display() throws Exception{
        if(isEmpty()){
            throw new Exception("Queue is empty");
        }
        int i=front;
        do{
            System.out.print(data[i]+" ");
            i++;
            i=i%data.length;
        }while(i!=end);
        System.out.print("END");
    }
}
