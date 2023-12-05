package StackAndQueues;

public class StackMain {
    public static void main(String[] args) throws StackException {
        Stack s=new Stack(7);
        s.push(34);
        s.push(13);
        s.push(19);
        s.push(28);
        s.push(48);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}
