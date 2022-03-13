package LinkedListQuestions;

public class Main {

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.createLL(1);
        ll.insertNode(2);
        ll.insertNode(3);
        ll.insertNode(4);
        ll.insertNode(5);
        ll.traversalLL();
        Questions q = new Questions();
        Node n = q.nthToLast(ll, 2);
        System.out.println(n.value);
    }

}
