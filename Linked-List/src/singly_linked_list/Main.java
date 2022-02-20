package singly_linked_list;

public class Main {

    public static void main(String[] args) {
        SinglyLinkedList sLL = new SinglyLinkedList();
        sLL.createSinglyLinkedList(5);
        // System.out.println(sLL.head.value);
        sLL.insertInLinkedList(6, 1);
        sLL.insertInLinkedList(7, 3);
        sLL.insertInLinkedList(8, 4);
        sLL.insertInLinkedList(9, 5);
        sLL.traverseSinglyLinkedList();
        sLL.deleteSLL();
        sLL.traverseSinglyLinkedList();
    }



}
