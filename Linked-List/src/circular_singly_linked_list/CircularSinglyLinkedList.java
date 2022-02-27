package circular_singly_linked_list;

public class CircularSinglyLinkedList {

    public Node head;
    public Node tail;
    public int size;

    public Node createCSLL(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = tail = node;
        size = 1;
        return head;
    }

}
