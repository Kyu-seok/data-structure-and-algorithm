package LinkedListQuestions;

public class Main {

    public static void main(String[] args) {
        LinkedList llA = new LinkedList();
        llA.insertNode(3);
        llA.insertNode(1);
        llA.insertNode(5);
        llA.insertNode(9);
        LinkedList llB = new LinkedList();
        llB.insertNode(2);
        llB.insertNode(4);
        llB.insertNode(6);

        Questions q = new Questions();
        q.addSameNode(llA, llB, 7);
        q.addSameNode(llA, llB, 2);
        q.addSameNode(llA, llB, 1);

        Node inter = q.findIntersection(llA, llB);
        System.out.println(inter.value);

    }

}
