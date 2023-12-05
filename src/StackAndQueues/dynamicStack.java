package StackAndQueues;

public class dynamicStack extends Stack{

    public dynamicStack(){
        super();
    }
    public dynamicStack(int size){
        super(size);//it will call stack with size n
    }

   @Override
    public boolean push(int item){
        /**this care of it being full */
        if(isFull()){
            //double the size of array
            int[] temp= new int[data.length*2];
            for(int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
       /**at this point we know array is not full so insert it
        *
         */

       return super.push(item);
   }


}
