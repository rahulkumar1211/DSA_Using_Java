package StackAndQueues;

public class QueueMain {

    public static void main(String[] args) throws Exception {
        circularQueue q= new circularQueue(7);
        q.insert(77);
        q.insert(67);
        q.insert(27);
        q.insert(89);
        q.insert(14);
        q.insert(90);
        System.out.println(q.remove());
        q.insert(133);
        q.display();
    }



}
