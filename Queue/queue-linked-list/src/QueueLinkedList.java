public class QueueLinkedList {
    LinkedList list;

    public QueueLinkedList() {
        list = new LinkedList();
        System.out.println("The Queue is successfully created");
    }

    public boolean isEmpty() {
        if (list.head == null) {
            return true;
        } else {
            return false;
        }
    }

    public void enQueue(int value) {
        list.insertInLinkedList(value, list.size);
        System.out.println("Successfully inserted " + value + " in the queue");
    }
}
