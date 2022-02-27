package circular_singly_linked_list;

public class Main {

    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCSLL(5);
        System.out.println(csll.head.value);
        System.out.println(csll.head.next.value);
    }

}
