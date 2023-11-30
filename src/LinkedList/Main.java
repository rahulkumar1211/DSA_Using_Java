package LinkedList;

public class Main {
    public static void main(String[] args) {
      /**  LinkedList SLL= new LinkedList();
        SLL.createSLL(5);
        System.out.println(SLL.head.value);
        SLL.insertSLL(6,0);
        System.out.println(SLL.head.value);
        SLL.insertSLL(3,4);
        SLL.insertSLL(14,1);
        SLL.insertSLL(8,5);
        SLL.insertSLL(17,3);
        SLL.traverseLL();
        SLL.searchNode(14);
        SLL.searchNode(20);
        SLL.deleteNode(0);
        SLL.traverseLL();*/

      DoubleLinkedList DLL= new DoubleLinkedList();
      DLL.traverseDLL();
      DLL.createDLL(5);
      DLL.insertDLL(8,1);
      DLL.insertDLL(4,0);
      DLL.insertDLL(6,2);
      DLL.insertDLL(7,8);
      System.out.println("Forward Traversal: ");
      DLL.traverseDLL();
      System.out.println("Reverse Traversal: ");
      DLL.revTraverseDLL();
      System.out.println("Search value in the DLL");
      DLL.searchNode(6);
      DLL.deleteNode(3);
      DLL.traverseDLL();
    }
}
