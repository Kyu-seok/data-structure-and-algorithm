package circular_singly_linked_list;

public class Main {

    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCSLL(5);
        csll.insertCSLL(4, 0);
        csll.insertCSLL(6, 1);
        csll.insertCSLL(7, 8);
        csll.traverseCSLL();
        csll.deleteCSLL();
        csll.traverseCSLL();
    }

}
