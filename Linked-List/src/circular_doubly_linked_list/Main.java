package circular_doubly_linked_list;

public class Main {
    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.createCDLL(1);
        cdll.insertNode(2, 0);
        System.out.println(cdll.head.value);
    }
}
