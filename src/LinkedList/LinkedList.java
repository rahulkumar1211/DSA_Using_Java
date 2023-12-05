package LinkedList;

public class LinkedList {

   public Node head;
   public Node tail;
   public int size;

    /**
     * Creating Single LinkedList: always return head of the linkedList
     * Time Complexity: O(1)
     * Space Complexity:O(1)
     */
    public Node createSLL(int nodeValue){
        head=new Node();
        Node node=new Node();
        node.next=null;
        node.value=nodeValue;
        head=node;
        size=1;
        tail=node;
        return head;
    }

    /**
     * Insert a node in Single LinkedList
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     *
     * Cases: 1. If list doesn't exist
     *        2. If want to add at starting
     *        3. If want to add at the end
     *        4. If want to add in the middle or any location
     */
    public void insertSLL(int nodeValue, int location){
        Node node=new Node();
        node.value=nodeValue;
        if(head==null){
            createSLL(nodeValue);
            return;
        }
        else if(location==0){
            node.next=head;
            head=node;
        }else if(location>=size){
            tail.next=node;
            node.next=null;
            tail=node;
        }else{
          /**  Node tempNode=head;
            int index=0;
            while(index<location-1){
                tempNode=head.next;
                index++;
            }
            Node nextNode=tempNode.next;
            tempNode.next=node;
            node.next=nextNode;*/
          insertNodeUsingRecursion(nodeValue,location,head);
        }
        size++;
    }
    /**
     * insert in SLL using recursion
     */
    private void insertNodeUsingRecursion(int value, int location, Node node){
        if(location==0){
            Node newNode=new Node();
            newNode.value=value;
            newNode.next=node.next;
            node.next=newNode;
            return;
        }
        insertNodeUsingRecursion(value, location-1,node.next);

    }

    /**
     * Traverse a Single LinkedList
     *
     * Time Complexity: O(N)
     * Space Complexity:O(1)
     */
    public void traverseLL(){
        if(head==null){
            System.out.println("Linked list is not created yet");
        }else{
            Node tempNode=head;
            for(int i=0;i<size;i++){
                System.out.print(tempNode.value);
                if(i!=size-1){
                    System.out.print("->");
                }
                tempNode=tempNode.next;
            }
            System.out.println("\n");
        }
    }

    public void reverseLL(){
       
    }

    /**
     * Search node in SLL
     * Time complexity: O(N)
     * Space complexity: O(1)
     */
    public boolean searchNode(int nodeValue){
        if(head!=null){
            Node tempNode=head;
            for(int i=0;i<size;i++){
                if(tempNode.value==nodeValue){
                    System.out.print("Found the node at location "+i+"\n");
                    return true;
                }
                    tempNode=tempNode.next;
            }
        }
        System.out.print("Node not found in LinkedList"+"\n");
        return false;
    }

    /**
     * Delete a node in SLL
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public void deleteNode(int location){
        if(head==null){
            System.out.println("The SLL doesn't exist");
            return;
        }else if(location==0){
            head=head.next;
            size--;
            if(size==0){
                tail=null;
            }
        }else if(location>=size){
            Node tempNode=head;
            for(int i=0;i<size-1;i++){
                tempNode=tempNode.next;
            }
            if(tempNode==head){
                tail=null;
                head=null;
                size--;
                return;
            }
            tempNode.next=null;
            tail=tempNode;
            size--;
        }else{
            Node tempNode=head;
            for(int i=0;i<location-1;i++){//point to node which is just before the node which we are deleting
                tempNode=tempNode.next;
            }
            tempNode.next=tempNode.next.next;
            size--;
        }
    }

    /**
     * Delete entire SLL
     * Time Complexity:O(1)
     * Space Complexity:O(1)
     */
    public void deleteSLL(){
        head=null;
        tail=null;
        System.out.println("Single Linked List has been deletd");
    }



}
