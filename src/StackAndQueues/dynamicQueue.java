package StackAndQueues;

public class dynamicQueue extends circularQueue{
    public dynamicQueue(){
         super();
    }
    public dynamicQueue(int size){
        this.data=new int[size];
    }

    @Override
    public boolean insert(int item){
        /**this care of it being full */
        if(isFull()){
            //double the size of array
            int[] temp= new int[data.length*2];
            for(int i=0;i<data.length;i++){
                temp[i]=data[(front+i)%data.length];
            }
            front=0;
            end=data.length;
            data=temp;
        }
        /**at this point we know array is not full so insert it
         *
         */

        return super.insert(item);
    }
}
