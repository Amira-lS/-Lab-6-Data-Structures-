
package testprogram2;


public class TestProgram2 {


    public static void main(String[] args) {

        System.out.println("List of Integers");

        DoublyLinkedList<Integer> intDList = new DoublyLinkedList<>();
        intDList.addFirst(400);
        intDList.addFirst(300);
        intDList.addFirst(200);
        intDList.addFirst(100);
        System.out.println("Forward Traversal:");
        intDList.ForwardTraversal();
        System.out.println();
        System.out.println("Backward Traversal:");
        intDList.BackwardTraversal();

        System.out.println("------------------------");
        System.out.println("List of Strings");

        DoublyLinkedList<String> strDList = new DoublyLinkedList<>();
        strDList.addFirst("Ma");
        strDList.addFirst("Amira");
        strDList.addLast("Alharthi");
        System.out.println("Forward Traversal:");
        strDList.ForwardTraversal();
        System.out.println();
        System.out.println("Backward Traversal:");
        strDList.BackwardTraversal();
    }
}


  
