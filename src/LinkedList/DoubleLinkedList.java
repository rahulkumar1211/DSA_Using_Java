package LinkedList;

public class DoubleLinkedList {

    Node head;
    Node tail;
    int size;

    /**
     * Create DLL
     * Time complexity: O(1)
     * Space Complexity: O(1)
     */
    public Node createDLL(int value){
        Node node=new Node();
        node.value=value;
        node.next=null;
        node.prev=null;
        head=node;
        tail=node;
        size=1;
        System.out.println("Double Linked list has been created");
        return head;
    }

    /**
     * Insert value in DLL
     */
     public void insertDLL(int value, int location){
         Node newNode=new Node();
         newNode.value=value;
         if(head==null){
             createDLL(value);
             return;
         }
         if(location==0){
             newNode.prev=null;
             newNode.next=head;
             head.prev=newNode;
             head=newNode;
         }
         else if(location>=size){
             newNode.prev=tail;
             tail.next=newNode;
             newNode.next=null;
             tail=newNode;
         }
         else{
             Node tempNode=head;
             int index=0;
             while(index<location-1){
                 tempNode=tempNode.next; /**it will store one position value less than the location*/
                 index++;
             }
             newNode.next=tempNode.next;
             tempNode.next.prev=newNode;
             tempNode.next=newNode;
             newNode.prev=tempNode;
         }
         size++;
     }

    /**
     * Traverse to DLL
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
     public void traverseDLL(){
         if(head==null){
             System.out.println("The double linked list is not created yet");
             return;
         }
         int idx=0;
         Node tempNode=head;
         while(idx<size){
             System.out.print(tempNode.value+" ");
             tempNode=tempNode.next;
             idx++;
         }
         System.out.println("\n");
     }

    /**
     * Reverse Traversal in DLL
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public void revTraverseDLL(){
        if(tail==null){
            System.out.println("The double linked list is not created yet");
            return;
        }
        int idx=size;
        Node tempNode=tail;
        while(idx>0){
            System.out.print(tempNode.value+" ");
            tempNode=tempNode.prev;
            idx--;
        }
        System.out.println("\n");

    }

    /**
     * Search Node in DLL
     * Time Complexity: O(N)
     * Space Complexity:O(1)
     */

    public boolean searchNode(int nodeValue){
        if(head==null){
            System.out.println("Double linked list is not created yet");
            return false;
        }
        if(head.value==nodeValue){
            System.out.println(nodeValue+" is present at the head of the double linked list");
            return true;
        }else{
            Node tempNode=head;
            int idx=0;
            while(idx<size){
                if(tempNode.value==nodeValue){
                    System.out.println(nodeValue+" is present in the DLL at "+(idx+1)+" location");
                    return true;
                }else{
                    tempNode=tempNode.next;
                    idx++;
                }
            }
        }
        System.out.println(nodeValue+" is not found in the DLL");
        return false;
    }

    /**
     * Delete Node in DLL
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public void deleteNode(int location){
        if(location==0){
            Node tempNode=head.next;
            tempNode.prev=null;
            head.next=null;
            head=tempNode;
        }
        if(location>=size){
            Node tempNode=tail.prev;
            tail.prev=null;
            tempNode.next=null;
            tail=tempNode;
        }else{
            int idx=0;
            Node tempNode=head;
            while(idx<location-1){
                tempNode=tempNode.next;
                idx++;
            }
            Node node=tempNode.next.next;
            tempNode.next=node;
            node.prev=tempNode;

        }
        size--;
    }

    /**
     * Delete Entire DLL
     * Time Complexity: O(N)
     * Space Complexity: O(1)
     */
    public void deleteDLL(){
        Node tempNode=head;
        for(int i=0;i<size;i++){
            tempNode.prev=null;
            tempNode.next=null;
        }
        head=null;
        tail=null;
        System.out.println("Entire DLL has been deleted");
    }


}
