package StackAndQueues;
import java.util.*;

public class Stack {
    protected int[] data;
    private static final int DEFAULT_SIZE=10;
    int ptr=-1;

    public Stack(){
        this(DEFAULT_SIZE);
    }
    public Stack(int size){
        this.data=new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }

    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Stack is Empty");
        }
        int popVal=data[ptr];
        ptr--;
        return popVal;
    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("Stack is Empty");
        }
        return data[ptr];
    }

    public boolean isFull(){
        if(ptr==data.length-1){//i.e. pointer is on last index;
            return true;
        }
        return false;
    }

    public boolean isEmpty(){
        if(ptr==-1){ //i.e. stack is empty
            return true;
        }
        return false;
    }


}
